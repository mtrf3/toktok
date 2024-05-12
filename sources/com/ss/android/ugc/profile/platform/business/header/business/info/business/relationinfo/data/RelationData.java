package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* loaded from: classes5.dex */
public final class RelationData extends BizBaseData {

    @InterfaceC65349Pkn("follow_status")
    public Integer followStatus;

    @InterfaceC65349Pkn("follow_toast_type")
    public Integer followToastType;

    @InterfaceC65349Pkn("follower_count")
    public Integer followerCount;

    @InterfaceC65349Pkn("following_count")
    public Integer followingCount;

    @InterfaceC65349Pkn("following_visibility")
    public Integer followingVisibility;

    @InterfaceC65349Pkn("friend_count")
    public Integer friendCount;

    @InterfaceC65349Pkn("new_follower_count")
    public Integer newFollowerCount;

    @InterfaceC65349Pkn("formatted_number")
    public String number;

    @InterfaceC65349Pkn("like_count")
    public Long totalFavorite;

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowToastType() {
        return this.followToastType;
    }

    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    public final Integer getFollowingCount() {
        return this.followingCount;
    }

    public final Integer getFollowingVisibility() {
        return this.followingVisibility;
    }

    public final Integer getFriendCount() {
        return this.friendCount;
    }

    public final Integer getNewFollowerCount() {
        return this.newFollowerCount;
    }

    public final String getNumber() {
        return this.number;
    }

    public final Long getTotalFavorite() {
        return this.totalFavorite;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setFollowToastType(Integer num) {
        this.followToastType = num;
    }

    public final void setFollowerCount(Integer num) {
        this.followerCount = num;
    }

    public final void setFollowingCount(Integer num) {
        this.followingCount = num;
    }

    public final void setFollowingVisibility(Integer num) {
        this.followingVisibility = num;
    }

    public final void setFriendCount(Integer num) {
        this.friendCount = num;
    }

    public final void setNewFollowerCount(Integer num) {
        this.newFollowerCount = num;
    }

    public final void setNumber(String str) {
        this.number = str;
    }

    public final void setTotalFavorite(Long l) {
        this.totalFavorite = l;
    }
}
