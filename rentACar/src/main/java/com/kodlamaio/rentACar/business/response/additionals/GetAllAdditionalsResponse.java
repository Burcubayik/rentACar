package com.kodlamaio.rentACar.business.response.additionals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAdditionalsResponse {
	private int id;
	private String additionalItemName;
	private int rentAlId;
}
