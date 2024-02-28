package com.apidevelopment.Service;

import com.apidevelopment.Enitty.ApiUser;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface ApiUserService {

    ApiUser postApiUser(ApiUser apiUser);

    List<ApiUser> getAllApiUser();

    Optional<ApiUser> getApiUserById(@PathVariable long id);

    ApiUser deleteById(long id);

    ApiUser updateApiUser(ApiUser apiUser, long id);
}
