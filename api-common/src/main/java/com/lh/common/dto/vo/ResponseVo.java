package com.lh.common.dto.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ResponseVo <T>{

    private Integer code;//状态码
    private String msg;//消息
    private T data;//数据
    public ResponseVo(Integer code,String message){
        this(code,message,null);
    }

    public static ResponseVo getInstance(Integer code,String message){
        return new ResponseVo(code,message);
    }

}