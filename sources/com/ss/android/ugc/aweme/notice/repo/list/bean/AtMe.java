package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public class AtMe {

    @InterfaceC65349Pkn("avatar_badge_url")
    public UrlModel avatarBadgeUrl;

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;

    @InterfaceC65349Pkn("comment")
    public Comment comment;

    @InterfaceC65349Pkn("comment_status")
    public int commentStatus = -1;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("sticker")
    public Emoji emoji;

    @InterfaceC65349Pkn("image_url")
    public UrlModel imageUrl;

    @InterfaceC65349Pkn("item_status")
    public int itemStatus;

    @InterfaceC65349Pkn("level1_comment")
    public Comment level1Comment;

    @InterfaceC65349Pkn("label_text")
    public String mLabelText;

    @InterfaceC65349Pkn("label_type")
    public int mLabelType;

    @InterfaceC65349Pkn("relation_label")
    public RelationDynamicLabel relationLabel;

    @InterfaceC65349Pkn("reply_comment")
    public Comment replyComment;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("sub_type")
    public int subType;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("user_info")
    public User user;

    public UrlModel getAvatarBadgeUrl() {
        return this.avatarBadgeUrl;
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentStatus() {
        return this.commentStatus;
    }

    public String getContent() {
        return this.content;
    }

    public Emoji getEmoji() {
        return this.emoji;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public int getItemStatus() {
        return this.itemStatus;
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

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public Comment getReplyComment() {
        return this.replyComment;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
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

    public void setCommentStatus(int i) {
        this.commentStatus = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setItemStatus(int i) {
        this.itemStatus = i;
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

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyComment(Comment comment) {
        this.replyComment = comment;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
