package com.bbs.service;

import com.bbs.pojo.ReplyDetail;

import java.util.List;

/**
 * Created by ACCP8.0 on 2020/10/30.
 */
public interface ReplyDetailService {

    List<ReplyDetail> getReplyDetail(Long invid);

    int addReplyDetail(Long invid,String content,
                        String author);
}
