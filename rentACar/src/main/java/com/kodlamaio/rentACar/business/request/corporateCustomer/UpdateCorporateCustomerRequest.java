package com.kodlamaio.rentACar.business.request.corporateCustomer;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCorporateCustomerRequest {
	@Min(1)
	private int corporateCustomerId;

	@NotBlank
	@NotNull
	private String taxNumber;

	@NotBlank
	@NotNull
	private String corporateNumber;

	@Email
	private String email;

	@NotBlank
	@NotNull
	private String password;
}
