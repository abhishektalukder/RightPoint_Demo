package com.example.demo.controller.inventory;


import com.example.demo.entity.Employee;
import com.example.demo.model.inventory.Inventory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rightpoint/inventory/controller", headers = "Accept=application/json")
public class InventryController {


    @PostMapping(path = "/createEmployee")
    @ResponseStatus( HttpStatus.CREATED )
    public void createInventory(@RequestBody Employee employee){

    }

    public List<Inventory> getAllinventory(){
        return null;
    }

    public List<Inventory> getInventoryByType(String inventoryType){
        return null;
    }

    public Inventory deleteInventoryById(Long inventoryId){
        return null;
    }
}
