package com.gaurav.accounts.controller;

import com.gaurav.accounts.constants.AccountsConstants;
import com.gaurav.accounts.dto.CustomerDto;
import com.gaurav.accounts.dto.ResposeDto;
import com.gaurav.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class AccountsController {

    private IAccountsService iAccountsService;

    @PostMapping("/create")
    public ResponseEntity createAccount(@RequestBody CustomerDto customerDto) {
        iAccountsService.createAccount(customerDto);
        return ResponseEntity.
                status(HttpStatus.CREATED).
                body(new ResposeDto(AccountsConstants.STATUS_200, AccountsConstants.MESSAGE_200));
    }


}
