package com.microservice.paymentgateway.paymentgateway.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class AccountInfo {

    private String name;
    private String bankName;
    private int balance;
    private List<Integer> lastTransactions;
}
