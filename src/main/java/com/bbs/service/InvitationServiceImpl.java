package com.bbs.service;


import com.bbs.mapper.InvitationMapper;
import com.bbs.pojo.Invitation;
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
public class InvitationServiceImpl implements InvitationService{

    @Resource
    private InvitationMapper invitationMapper;

    @Override
    public List<Invitation> getInvitation(String queryStr) {
        return invitationMapper.selectInvitation(queryStr);
    }

    @Override
    public int addInvitation(String title,String summary,String author) {
        Date date = new Date();
        Invitation invitation = new Invitation();
        invitation.setAuthor(author);
        invitation.setSummary(summary);
        invitation.setTitle(title);
        invitation.setCreatedate(date);
        return invitationMapper.insert(invitation);
    }
}
