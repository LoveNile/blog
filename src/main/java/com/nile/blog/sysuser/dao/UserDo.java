package com.nile.blog.sysuser.dao;

import com.nile.blog.sysuser.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDo extends CrudRepository<User, String> {
}
