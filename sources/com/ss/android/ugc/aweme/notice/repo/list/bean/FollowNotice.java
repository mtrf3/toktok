package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;

/* loaded from: classes10.dex */
public class FollowNotice {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("follow_notice_from_scene")
    public int followFrom;

    @InterfaceC65349Pkn("relation_label")
    public RelationDynamicLabel relationLabel;

    @InterfaceC65349Pkn("from_user")
    public User user;

    public int hashCode() {
        return Objects.hash(this.content, this.user);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FollowNotice m143clone() {
        User m150clone;
        FollowNotice followNotice = new FollowNotice();
        User user = this.user;
        if (user == null) {
            m150clone = null;
        } else {
            m150clone = user.m150clone();
        }
        followNotice.user = m150clone;
        followNotice.content = this.content;
        followNotice.relationLabel = this.relationLabel;
        followNotice.followFrom = this.followFrom;
        return followNotice;
    }

    public boolean isNowFollow() {
        int i = this.followFrom;
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public String getContent() {
        return this.content;
    }

    public int getFollowFrom() {
        return this.followFrom;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public User getUser() {
        return this.user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FollowNotice followNotice = (FollowNotice) obj;
        if (Objects.equals(this.content, followNotice.content) && Objects.equals(this.user, followNotice.user)) {
            return true;
        }
        return false;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setFollowFrom(int i) {
        this.followFrom = i;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
