package com.apidevelopment.Repository;

import com.apidevelopment.Enitty.ApiUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiUserRepository extends JpaRepository<ApiUser, Long> {

    ApiUser deleteById(long id);
}
