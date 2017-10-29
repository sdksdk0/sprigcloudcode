package cn.tf.springboot.microservicesimpleprovideruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.tf.springboot.microservicesimpleprovideruser.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
	
	

}
