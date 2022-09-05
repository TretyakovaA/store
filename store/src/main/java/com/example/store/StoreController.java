package com.example.store;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/store/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @RequestMapping(path = "/add")
    public List<Item> add(@RequestParam("id") List<Integer> ids) {
        return storeService.add(ids);
    }

    @RequestMapping(path = "/get")
    public List<Item> get() {
        return storeService.get();
    }
}
