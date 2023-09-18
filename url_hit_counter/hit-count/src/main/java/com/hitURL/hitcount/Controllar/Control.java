package com.hitURL.hitcount.Controllar;

import com.hitURL.hitcount.Enitity.Varibles;
import com.hitURL.hitcount.service.Urlhitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Control {

    @Autowired
    private Urlhitservice urlHitService;

    @PostMapping("posting/visitor")
    public String addVisitor(@RequestBody Varibles user){
        return urlHitService.addVisitor(user);
    }

    @GetMapping("getting/visitors")
    public List<Varibles> getallvisitors(){
        return urlHitService.getallvisitors();
    }

    @GetMapping("getting/count")
    public String getnoofvisitor(){
        return urlHitService.getnoofvisitor();
    }

    @GetMapping("api/v1/visitor-count-app/userName/{userName}")
    public Varibles getVisitor(@PathVariable String userName){
        return urlHitService.getVisitor(userName);
    }



}
