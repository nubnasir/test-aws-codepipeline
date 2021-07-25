package com.swagger.example.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientInput {
    @ApiModelProperty(name = "number data", example = "1234", required = true)
    private Integer number;
}
