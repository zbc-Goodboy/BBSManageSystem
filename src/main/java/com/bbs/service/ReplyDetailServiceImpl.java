package com.bbs.service;

import com.bbs.mapper.ReplyDetailMapper;
import com.bbs.pojo.ReplyDetail;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by ACCP8.0 on 2020/10/30.
 */
@Service
@Transactional
public class ReplyDetailServiceImpl implements ReplyDetailService{

    @Resource
    private ReplyDetailMapper replyDetailMapper;

    @Override
    public List<ReplyDetail> getReplyDetail(Long invid) {
        return replyDetailMapper.selectReplyDetail(invid);
    }

    @Override
    public int addReplyDetail(Long invid,String content,String author) {
        ReplyDetail replyDetail = new ReplyDetail();
        replyDetail.setCreatedate(new Date());
        replyDetail.setAuthor(author);
        replyDetail.setContent(content);
        replyDetail.setInvid(invid);
        return replyDetailMapper.insert(replyDetail);
    }
}
