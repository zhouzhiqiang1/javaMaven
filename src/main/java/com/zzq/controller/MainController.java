package com.zzq.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class MainController {
    @RequestMapping (value = "/main.json",method = RequestMethod.GET)

    @ResponseBody
    public Object main(){
        JSONObject json = new JSONObject();
        Map map = new HashMap();
        map.put("age",28);
        map.put("sex",1);
        map.put("name","伟豪");

        json.put("value","key");
        json.put("age",12);
        json.put("list",map);


        String pretty = JSON.toJSONString(json, SerializerFeature.PrettyFormat, SerializerFeature.WriteDateUseDateFormat);
        System.out.println(pretty);

        return json;
    }

}
