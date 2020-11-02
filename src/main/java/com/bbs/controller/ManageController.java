package com.bbs.controller;

import com.bbs.pojo.Invitation;
import com.bbs.pojo.ReplyDetail;
import com.bbs.service.InvitationService;
import com.bbs.service.ReplyDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ACCP8.0 on 2020/10/30.
 */
@Controller
public class ManageController {

    @Resource
    private ReplyDetailService replyDetailService;

    @Resource
    private InvitationService invitationService;

    @RequestMapping("/")
    public String go(){
        return "homep";
    }

    @RequestMapping("getinvitations")
    @ResponseBody
    public PageInfo<Invitation> getAllInvitation(Integer pageNo, Integer pageSize,String str){
        PageHelper.offsetPage((pageNo-1)*pageSize,pageSize);
        List<Invitation> invitationList=invitationService.getInvitation(str);
        PageInfo<Invitation> pageInfo = new PageInfo<>(invitationList);
        return pageInfo;
    }
    @RequestMapping("addinvitation")
    public Integer addInvitation(@Param("title") String title,@Param("summary")String summary,
                                 @Param("author")String author)
    {
        return invitationService.addInvitation(title,summary,author);
    }

    @RequestMapping("getreplydetail")
    @ResponseBody
    public List<ReplyDetail> getAllReplyDetail(Integer pageNo,Integer pageSize,Long invid){
        List<ReplyDetail> replyDetailList = replyDetailService.getReplyDetail(invid);
        return replyDetailList;
    }


    @RequestMapping("addreply")
    public String addReplyDetail(@Param("invid") Long invid,@Param("content")String content,
                                  @Param("author")String author){
        int num = replyDetailService.addReplyDetail(invid,content,author);
        return "reply";
    }
}
