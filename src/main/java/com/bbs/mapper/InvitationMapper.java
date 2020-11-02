package com.bbs.mapper;

import com.bbs.pojo.Invitation;

import java.util.List;

public interface InvitationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    Invitation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);

    List<Invitation> selectInvitation(String queryStr);
}