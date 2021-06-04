package com.lh.controller;

import com.lh.common.dto.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @RequestMapping("/save")
    public ResponseVo save(){

        log.info("save ...");
        return ResponseVo.getInstance(200,"save ok");
    }
}
