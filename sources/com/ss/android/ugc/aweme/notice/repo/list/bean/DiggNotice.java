package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes10.dex */
public class DiggNotice implements Serializable {

    @InterfaceC65349Pkn("avatar_badge_url")
    public UrlModel avatarBadgeUrl;

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;

    @InterfaceC65349Pkn("cid")
    public String cid;

    @InterfaceC65349Pkn("comment")
    public Comment comment;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("digg_type")
    public int diggType;

    @InterfaceC65349Pkn("forward_id")
    public String forwardId;

    @InterfaceC65349Pkn("has_digg_list")
    public Boolean hasDiggList;

    @InterfaceC65349Pkn("label_text")
    public String mLabelText;

    @InterfaceC65349Pkn("merge_count")
    public int mergeCount;

    @InterfaceC65349Pkn("relation_label")
    public RelationDynamicLabel relationLabel;

    @InterfaceC65349Pkn("from_user")
    public List<User> users;

    public UrlModel getAvatarBadgeUrl() {
        return this.avatarBadgeUrl;
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getCid() {
        return this.cid;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getContent() {
        return this.content;
    }

    public int getDiggType() {
        return this.diggType;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public Boolean getHasDiggList() {
        return this.hasDiggList;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getMergeCount() {
        return this.mergeCount;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public DiggNotice(DiggNotice diggNotice) {
        this.aweme = diggNotice.aweme;
        this.users = diggNotice.users;
        this.content = diggNotice.content;
        this.mergeCount = diggNotice.mergeCount;
        this.diggType = diggNotice.diggType;
        this.cid = diggNotice.cid;
        this.relationLabel = diggNotice.relationLabel;
        this.forwardId = diggNotice.forwardId;
        this.mLabelText = diggNotice.mLabelText;
        this.avatarBadgeUrl = diggNotice.avatarBadgeUrl;
    }

    public void setAvatarBadgeUrl(UrlModel urlModel) {
        this.avatarBadgeUrl = urlModel;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDiggType(int i) {
        this.diggType = i;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setMergeCount(int i) {
        this.mergeCount = i;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUsers(List<User> list) {
        this.users = list;
    }
}
