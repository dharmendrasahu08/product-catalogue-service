package com.dks.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCatalogue {
	
	@RequestMapping("/serviceInfo")
    public String getClientsByApplicationName() {
       return "ProductCatalogue service...";
    }

}
