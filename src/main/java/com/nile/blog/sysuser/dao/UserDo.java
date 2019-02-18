package com.nile.blog.sysuser.dao;

import com.nile.blog.sysuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDo extends JpaRepository<User, String> {
}
