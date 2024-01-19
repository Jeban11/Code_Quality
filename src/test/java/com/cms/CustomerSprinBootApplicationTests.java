//package com.cms;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.cms.bean.Customer;
//import com.cms.controller.CMScontroller;
//
//@SpringBootTest
//class CustomerSprinBootApplicationTests {
//
//	@Autowired
//	CMScontroller controller;
//
//	String insert;
//	String update;
//	String delete;
//	String result;
//	String result1;
//	List<Customer> list = new ArrayList<Customer>();
//	List<Customer> list1 = new ArrayList<Customer>();
//	Customer cus1;
//	Customer cus2;
//
//	@Test
//	@Order(1)
//	void contextLoads() {
//
//	}
//
//	@Test
//	@Order(2)
//	public void testPerformInsert() {
//		Customer cu = new Customer();
//		cu.setId(108);
//		cu.setName("Ignesh");
//		cu.setEmail("ig@gmail.com");
//		cu.setCno("9078563456");
//		cu.setLocation("Trichy");
//		insert = "Inserted";
//		result = controller.performinsertCustomer(cu);
//		Assert.assertEquals(insert, result);
//	}
//
//	@Test
//	@Order(3)
//	public void testPerformUpdate() {
//		Customer cu = new Customer();
//		cu.setId(104);
//		cu.setName("Kishore");
//		cu.setEmail("kis@gmail.com");
//		cu.setCno("9078563456");
//		cu.setLocation("Trichy");
//		update = "Updated";
//		result = controller.performupdateCustomer(cu);
//		assertEquals(update, result);
//	}
//
//	@Test
//	@Order(4)
//	public void testPerformDelete() {
//		delete = "Deleted";
//		result = controller.performdeleteCustomer(201);
//		result1 = controller.performdeleteCustomer(301);
//		assertEquals(delete, result);
//	}
//
//	@Test
//	@Order(5)
//	public void testGetAllCustomerDetails() {
//		list = controller.getAllCustomer();
//		cus1 = new Customer(101, "Domnic", "d@gmail.com", "8967456745", "Trichy");
//		cus2 = new Customer(102, "Raja", "r@gmail.com", "9078564534", "PDKT");
//		list1.add(cus1);
//		list1.add(cus2);
//		list.equals(list1);
//	}
//
//}
