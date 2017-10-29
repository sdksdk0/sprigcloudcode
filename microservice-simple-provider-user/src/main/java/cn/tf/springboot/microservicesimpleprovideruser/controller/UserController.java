package cn.tf.springboot.microservicesimpleprovideruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.tf.springboot.microservicesimpleprovideruser.entity.User;
import cn.tf.springboot.microservicesimpleprovideruser.repository.UserDao;

@RestController
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id){
		return this.userDao.findOne(id);
	}

}
