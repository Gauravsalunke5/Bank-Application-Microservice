package com.gaurav.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResposeDto {
    private String statusCode;
    private String statusMsg;
}
