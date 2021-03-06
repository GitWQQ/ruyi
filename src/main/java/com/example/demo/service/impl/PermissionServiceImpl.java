package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PermissionMapper;
import com.example.demo.domain.Permission;
import com.example.demo.service.PermissionService;

@Service
public class PermissionServiceImpl  implements PermissionService{

	@Autowired
	private PermissionMapper permissionMapper;
	
	@Override
	public List<Permission> getPermissionByParam(String rolename) {
		if(rolename !=null && !"".equals(rolename)){
			return permissionMapper.getPermissionByParam(rolename);
		}
		return null;
	}
}
