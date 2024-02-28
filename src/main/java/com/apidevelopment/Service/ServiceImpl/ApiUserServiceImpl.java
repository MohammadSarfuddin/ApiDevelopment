package com.apidevelopment.Service.ServiceImpl;

import com.apidevelopment.Enitty.ApiUser;
import com.apidevelopment.Repository.ApiUserRepository;
import com.apidevelopment.Service.ApiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ApiUserServiceImpl implements ApiUserService {

    @Autowired
    private ApiUserRepository apiUserRepository;

    @Override
    public ApiUser postApiUser(ApiUser apiUser) {
        return apiUserRepository.save(apiUser);
    }

    @Override
    public List<ApiUser> getAllApiUser() {
        return apiUserRepository.findAll();
    }

    @Override
    public Optional<ApiUser> getApiUserById(long id) {
        return apiUserRepository.findById(id);
    }

    @Override
    public ApiUser deleteById(long id) {
        return apiUserRepository.deleteById(id);
    }

    @Override
    public ApiUser updateApiUser(ApiUser apiUser, long id) {
        ApiUser apiUser1= apiUserRepository.findById(apiUser.getId()).orElseThrow(() -> new RuntimeException(" API user is not found "));

        apiUser1.setId(apiUser.getId());
        apiUser1.setCity(apiUser.getCity());
        apiUser1.setName(apiUser.getName());
        apiUser1.setSalary(apiUser.getSalary());

        return apiUser1;
    }
}
