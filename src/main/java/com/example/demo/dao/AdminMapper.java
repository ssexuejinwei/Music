package com.example.demo.dao;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Example.AdminExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(String adminid);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(String adminid);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    /**
     * @param Map
     * @IN :"adminid","adminpassword"
     * @OUT: "result"> String
     */
    String isAdminExist(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"adminid"
     * @OUT: "admin"> Admin
     */
    String getAdminById(Map<String,Object> Map);
}