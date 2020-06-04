package com.cds.mongocrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cds.mongocrud.dto.TickTokUserBean;

public interface UserRepository extends MongoRepository<TickTokUserBean, String> {

	TickTokUserBean findByUserName(String name);
	TickTokUserBean deleteByEmail(String email);
}
