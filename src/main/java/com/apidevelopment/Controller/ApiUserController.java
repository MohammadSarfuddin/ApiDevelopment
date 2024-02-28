package com.apidevelopment.Controller;

import com.apidevelopment.Enitty.ApiUser;
import com.apidevelopment.Service.ApiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("app/v1/")
public class ApiUserController {

    @Autowired
    private ApiUserService apiUserService;

    @PostMapping("/postApiUser")
   public ApiUser postApiUser(@RequestBody ApiUser apiUser){
       return apiUserService.postApiUser(apiUser);
   }

   @GetMapping("/getAllApiUser")
   public List<ApiUser> getAllApiUser(){
        return apiUserService.getAllApiUser();
   }

   @GetMapping("/getApiUser/{id}")
   public Optional<ApiUser> getApiUserById(@PathVariable long id){
        return apiUserService.getApiUserById(id);
    }

    @DeleteMapping("/apiUser/{id}")
    public ApiUser deleteById(@PathVariable long id){
        return apiUserService.deleteById(id);
    }

    @PutMapping("/updateApiUser")
    public ApiUser updateApiUser(@RequestBody() ApiUser apiUser, @PathVariable("id") long id){

        return apiUserService.updateApiUser(apiUser, id);
    }
}
