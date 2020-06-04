package com.cds.mongocrud.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document(collection = "ticktok_user")
@Data
@Builder

public class TickTokUserBean {
	@Id
	private String Id;
	private String userName;
	private String email;
	private String phoneNumber;
	
}
