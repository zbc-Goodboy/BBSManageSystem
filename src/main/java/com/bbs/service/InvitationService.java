package com.bbs.service;

import com.bbs.pojo.Invitation;

import java.util.List;

/**
 * Created by ACCP8.0 on 2020/10/30.
 */
public interface InvitationService {

    List<Invitation> getInvitation(String queryStr);

    int addInvitation( String title,String summary,String author);
}
