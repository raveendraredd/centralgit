package com.aws.model;

import org.springframework.http.HttpStatus;

public class ResponseModel {
public Status status;
private Object response;
private HttpStatus httpStatus;

public ResponseModel() {
	super();
}

public ResponseModel(HttpStatus httpStatus) {
	super();
	this.httpStatus = httpStatus;
}

public ResponseModel(Status status, Object response, HttpStatus httpStatus) {
	super();
	this.status = status;
	this.response = response;
	this.httpStatus = httpStatus;
}
public Status getStatus() {
	return status;
}
public void setStatus(Status failed) {
	this.status = failed;
}
public Object getResponse() {
	return response;
}
public void setResponse(Object response) {
	this.response = response;
}
public HttpStatus getHttpStatus() {
	return httpStatus;
}
public void setHttpStatus(HttpStatus httpStatus) {
	this.httpStatus = httpStatus;
}
@Override
public String toString() {
	return "ResponseModel [status=" + status + ", response=" + response + ", httpStatus=" + httpStatus + "]";
}

}
