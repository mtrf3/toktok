package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import java.io.Serializable;

/* loaded from: classes10.dex */
public class CommentNotice implements Serializable {

    @InterfaceC65349Pkn("avatar_badge_url")
    public UrlModel avatarBadgeUrl;

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;

    @InterfaceC65349Pkn("comment")
    public Comment comment;

    @InterfaceC65349Pkn("comment_type")
    public int commentType;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("forward_id")
    public String forwardId;

    @InterfaceC65349Pkn("level1_comment")
    public Comment level1Comment;

    @InterfaceC65349Pkn("label_text")
    public String mLabelText;

    @InterfaceC65349Pkn("label_type")
    public int mLabelType;

    @InterfaceC65349Pkn("parent_id")
    public String parentId;

    @InterfaceC65349Pkn("relation_label")
    public RelationDynamicLabel relationLabel;

    @InterfaceC65349Pkn("reply_comment")
    public Comment replyComment;

    public boolean isReplyWithVideo() {
        int i = this.commentType;
        if (i == 17 || i == 18 || i == 19) {
            return true;
        }
        return false;
    }

    public UrlModel getAvatarBadgeUrl() {
        return this.avatarBadgeUrl;
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentType() {
        return this.commentType;
    }

    public String getContent() {
        return this.content;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getLabelType() {
        return this.mLabelType;
    }

    public Comment getLevel1Comment() {
        return this.level1Comment;
    }

    public String getParentId() {
        return this.parentId;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public Comment getReplyComment() {
        return this.replyComment;
    }

    public void setAvatarBadgeUrl(UrlModel urlModel) {
        this.avatarBadgeUrl = urlModel;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void setCommentType(int i) {
        this.commentType = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setLabelType(int i) {
        this.mLabelType = i;
    }

    public void setLevel1Comment(Comment comment) {
        this.level1Comment = comment;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyComment(Comment comment) {
        this.replyComment = comment;
    }
}
