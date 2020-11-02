package com.bbs.mapper;

import com.bbs.pojo.ReplyDetail;

import java.util.List;

public interface ReplyDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReplyDetail record);

    int insertSelective(ReplyDetail record);

    ReplyDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReplyDetail record);

    int updateByPrimaryKey(ReplyDetail record);

    List<ReplyDetail> selectReplyDetail(Long invid);
}