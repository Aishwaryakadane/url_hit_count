package com.hitURL.hitcount.service;

import com.hitURL.hitcount.Enitity.Varibles;
import com.hitURL.hitcount.Repos.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Urlhitservice {

    @Autowired
    Repo repo;

    public List<Varibles> getallvisitors(){
        return repo.getField();
    }

    public String addVisitor(Varibles user) {
        List<Varibles> list = getallvisitors();
        for (Varibles u : list) {
            if (u.getUserName().equals(user.getUserName()) ){
                u.setCounter(u.getCounter() + 1);
                return "can't add same user";
            }
        }
        list.add(user);
        return "new user";
    }


    public String getnoofvisitor() {
        List <Varibles> ll = getallvisitors();
        return "Visitors :" + ll.size();
    }


    public Varibles getVisitor(String userName) {
        List<Varibles> ll = getallvisitors();
        for(Varibles u : ll){
            if(u.getUserName().equals(userName)){
                return u;
            }
        }
        throw new IllegalStateException("not found");
    }

}

