package com.pedro256.app.models.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class RequestProductsToBuy {
    List<ProductToBuyModel> listProducts;
}
