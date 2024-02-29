package com.microservice.paymentgateway.paymentgateway.controller;

import com.microservice.paymentgateway.paymentgateway.model.AccountInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/details")
    public AccountInfo getAccountInfo(){
        List<Integer> lastTransactions = new ArrayList<>();
        lastTransactions.add(500);
        lastTransactions.add(-3000);
        lastTransactions.add(4200);

        return AccountInfo.builder()
                        .name("Jayanta Dhar")
                        .bankName("HDFC Bank")
                        .lastTransactions(lastTransactions)
                        .balance(11000)
                        .build();
    }
}
