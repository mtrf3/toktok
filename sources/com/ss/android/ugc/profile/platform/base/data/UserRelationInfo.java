package com.ss.android.ugc.profile.platform.base.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class UserRelationInfo implements Serializable {

    @InterfaceC65349Pkn("follow_status")
    public Integer followStatus;

    @InterfaceC65349Pkn("follower_status")
    public Integer followerStatus;

    @InterfaceC65349Pkn("is_blocked")
    public Boolean isBlocked;

    @InterfaceC65349Pkn("is_blocking")
    public Boolean isBlocking;

    @InterfaceC65349Pkn("is_geo_blocked_profile")
    public Boolean isGeoBlocked;

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowerStatus() {
        return this.followerStatus;
    }

    public final Boolean isBlocked() {
        return this.isBlocked;
    }

    public final Boolean isBlocking() {
        return this.isBlocking;
    }

    public final Boolean isGeoBlocked() {
        return this.isGeoBlocked;
    }

    public final void setBlocked(Boolean bool) {
        this.isBlocked = bool;
    }

    public final void setBlocking(Boolean bool) {
        this.isBlocking = bool;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setFollowerStatus(Integer num) {
        this.followerStatus = num;
    }

    public final void setGeoBlocked(Boolean bool) {
        this.isGeoBlocked = bool;
    }
}
