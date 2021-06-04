package com.lh.controller;

import com.lh.common.dto.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${urls.payment-url}")
    private String paymentUrl;


    @RequestMapping("/save")
    public ResponseVo save(){
        log.info(" save order ...");
        log.info(paymentUrl);
        ResponseVo responseVo = restTemplate.postForObject(paymentUrl + "/payment/save", null, ResponseVo.class);
        log.info(responseVo.toString());
        return ResponseVo.getInstance(200,"保存订单成功");
    }

}
