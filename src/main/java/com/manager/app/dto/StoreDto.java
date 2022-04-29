package com.manager.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Getter
@AllArgsConstructor
public class StoreDto {

    private final Long id;
    @NotBlank(message = "The Store name is connot be null")
    @Size(max = 50, message = "Your name is soo big!")
    private final String name;
    private final BigDecimal totalEarned;
    private final BigDecimal totalSpent;
//  TODO add when the entity Product is created - 2
//  private List<Product> allProducts;
}
