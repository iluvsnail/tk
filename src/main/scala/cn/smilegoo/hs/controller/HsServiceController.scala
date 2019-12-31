package cn.smilegoo.hs.controller

import cn.smilegoo.hs.service.HsService
import com.alibaba.fastjson.{JSONArray, JSONObject}
import io.swagger.annotations.{Api, ApiImplicitParam, ApiImplicitParams, ApiOperation}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpStatus, MediaType, ResponseEntity}
import org.springframework.web.bind.annotation._
import org.springframework.web.client.RestTemplate



@Api(value = "Hs tool micro services api",tags=Array("Hs tool services api"))
@RestController
@RequestMapping(Array("/tks/api/v1/"))
class HsServiceController {

  @Autowired
  val restTemplate:RestTemplate=null
  @Autowired
  val hsService:HsService = null

  @RequestMapping(value = Array("/{platform}/rp/{flightNo}/{orgDate}/{time}/{price}/{spare}"),method = Array(RequestMethod.POST),produces = Array(MediaType.APPLICATION_JSON_VALUE))
  def reportPrice(@PathVariable platform:String,@PathVariable flightNo:String,@PathVariable orgDate:String,@PathVariable time:String,@PathVariable price:String,@PathVariable spare:String):String ={
    hsService.reportPrice(platform,flightNo,orgDate,time,price,spare)
  }


}
