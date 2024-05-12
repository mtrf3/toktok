package com.ss.android.ugc.profile.platform.base.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ProfileCommonInfo implements Serializable {

    @InterfaceC65349Pkn("friend_count")
    public Integer friendCount;

    @InterfaceC65349Pkn("mode")
    public String mode;

    @InterfaceC65349Pkn("user_account_info")
    public UserAccountInfo userAccountInfo;

    @InterfaceC65349Pkn("user_profile_info")
    public UserProfileInfo userProfileInfo;

    @InterfaceC65349Pkn("user_relation_info")
    public UserRelationInfo userRelationInfo;

    @InterfaceC65349Pkn("user_statics_info")
    public UserStaticsInfo userStaticsInfo;

    public final Integer getFriendCount() {
        return this.friendCount;
    }

    public final String getMode() {
        return this.mode;
    }

    public final UserAccountInfo getUserAccountInfo() {
        return this.userAccountInfo;
    }

    public final UserProfileInfo getUserProfileInfo() {
        return this.userProfileInfo;
    }

    public final UserRelationInfo getUserRelationInfo() {
        return this.userRelationInfo;
    }

    public final UserStaticsInfo getUserStaticsInfo() {
        return this.userStaticsInfo;
    }

    public final void setFriendCount(Integer num) {
        this.friendCount = num;
    }

    public final void setMode(String str) {
        this.mode = str;
    }

    public final void setUserAccountInfo(UserAccountInfo userAccountInfo) {
        this.userAccountInfo = userAccountInfo;
    }

    public final void setUserProfileInfo(UserProfileInfo userProfileInfo) {
        this.userProfileInfo = userProfileInfo;
    }

    public final void setUserRelationInfo(UserRelationInfo userRelationInfo) {
        this.userRelationInfo = userRelationInfo;
    }

    public final void setUserStaticsInfo(UserStaticsInfo userStaticsInfo) {
        this.userStaticsInfo = userStaticsInfo;
    }
}
