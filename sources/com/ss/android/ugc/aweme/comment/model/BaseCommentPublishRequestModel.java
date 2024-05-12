package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class BaseCommentPublishRequestModel implements Serializable {

    @InterfaceC65349Pkn("action_type")
    public int actionType;

    @InterfaceC65349Pkn("ad_info")
    public String adInfo;

    @InterfaceC65349Pkn("aweme_id")
    public String aid;

    @InterfaceC65349Pkn("channel_id")
    public int channelId;

    @InterfaceC65349Pkn("is_self_see")
    public int isSelfSee;

    @InterfaceC65349Pkn("reply_id")
    public String replyId;

    @InterfaceC65349Pkn("reply_to_reply_id")
    public String replyToReplyId;

    @InterfaceC65349Pkn("send_comment_type")
    public int sendCommentType;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("text_extra")
    public List<TextExtraStruct> textExtraList;

    public int getActionType() {
        return this.actionType;
    }

    public String getAdInfo() {
        return this.adInfo;
    }

    public String getAid() {
        return this.aid;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public int getIsSelfSee() {
        return this.isSelfSee;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getReplyToReplyId() {
        return this.replyToReplyId;
    }

    public int getSendCommentType() {
        return this.sendCommentType;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtraList() {
        return this.textExtraList;
    }

    public void setActionType(int i) {
        this.actionType = i;
    }

    public void setAdInfo(String str) {
        this.adInfo = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setChannelId(int i) {
        this.channelId = i;
    }

    public void setIsSelfSee(int i) {
        this.isSelfSee = i;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setSendCommentType(int i) {
        this.sendCommentType = i;
    }

    public void setStructList(List<TextExtraStruct> list) {
        this.textExtraList = list;
    }

    public void setText(String str) {
        this.text = str;
    }
}
