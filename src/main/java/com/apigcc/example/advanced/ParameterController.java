package com.apigcc.example.advanced;

import com.apigcc.example.common.UserQuery;
import org.springframework.web.bind.annotation.*;

/**
 * Parameter
 */
@RestController
@RequestMapping("parameter")
public class ParameterController {

    /**
     * RequestParam
     * @param value
     */
    @GetMapping
    public void get(@RequestParam(name = "name",required = false,defaultValue = "apigcc") String value){
    }

    /**
     * RequestBean
     * @param query
     */
    @GetMapping
    public void query(UserQuery query){

    }

    /**
     * RequestBody
     * @param query
     */
    @PostMapping
    public void body(@RequestBody(required = false) UserQuery query){

    }

}
