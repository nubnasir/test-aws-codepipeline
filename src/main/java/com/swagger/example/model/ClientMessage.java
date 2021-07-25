package com.swagger.example.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientMessage {
    @ApiModelProperty(name = "message data", example = "abc efg")
    private String message;
}
