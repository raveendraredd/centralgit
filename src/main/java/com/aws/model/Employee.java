/**
 * 
 */
package com.aws.model;

/**
 * @author raveendra.g
 *
 */
public class Employee {
private String empName;
private int empId;
private String salary;
private String designation;
private String deptNo;

public Employee() {
	super();
}
public Employee(String empName, int empId, String salary, String designation, String deptNo) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.salary = salary;
	this.designation = designation;
	this.deptNo = deptNo;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDeptNo() {
	return deptNo;
}
public void setDeptNo(String deptNo) {
	this.deptNo = deptNo;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + ", designation=" + designation
			+ ", deptNo=" + deptNo + "]";
}

}
