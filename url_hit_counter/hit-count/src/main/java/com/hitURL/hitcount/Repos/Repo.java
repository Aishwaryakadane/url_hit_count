package com.hitURL.hitcount.Repos;

import com.hitURL.hitcount.Enitity.Varibles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Repo {

    @Autowired
    private List<Varibles> urlhit ;

    public List<Varibles> getField() {
        return urlhit;
    }

    public void addUsers(Varibles u){
        urlhit.add(u);
    }
}
