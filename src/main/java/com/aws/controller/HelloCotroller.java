/**
 * 
 */
package com.aws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.model.Employee;
import com.aws.model.ResponseModel;
import com.aws.model.Status;

/**
 * @author raveendra.g
 *
 */
@RestController
public class HelloCotroller {
	@GetMapping("/hello")
	public ResponseEntity<ResponseModel> getData() {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("raveendra", 100, "2000", "Java developer", "10"));
		empList.add(new Employee("ravi", 102, "3000", ".Net developer", "11"));
		empList.add(new Employee("ravi.palem", 103, "4000", "Spring", "13"));
		ResponseModel responseModel = new ResponseModel();
		responseModel.setHttpStatus(HttpStatus.ACCEPTED);
		responseModel.setResponse(empList);
		responseModel.setStatus(Status.success);

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseModel);
	}
}
