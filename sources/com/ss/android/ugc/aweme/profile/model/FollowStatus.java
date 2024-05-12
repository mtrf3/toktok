package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.b0;

/* loaded from: classes10.dex */
public final class FollowStatus extends BaseResponse {

    @InterfaceC65349Pkn("contact_name")
    public String contactName;
    public int followFrom;

    @InterfaceC65349Pkn("follow_status")
    public int followStatus;

    @InterfaceC65349Pkn("is_enterprise")
    public int isEnterprise;
    public String secUserId;
    public String userId;

    @InterfaceC65349Pkn("watch_status")
    public int watchStatus;
    public boolean isFollowSucess = true;
    public boolean isFollowChange = true;
    public int followerStatus = -1;
    public int preStatus = -1;

    public boolean getIsEnterprise() {
        if (this.isEnterprise == 1) {
            return true;
        }
        return false;
    }

    public boolean isCheating() {
        if (this.status_code == 2149) {
            return true;
        }
        return false;
    }

    public FollowStatus() {
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowStatus{watchStatus=");
        LIZ.append(this.watchStatus);
        LIZ.append(", followStatus=");
        LIZ.append(this.followStatus);
        LIZ.append(", contactName='");
        Q89.LIZIZ(LIZ, this.contactName, '\'', ", isEnterprise=");
        LIZ.append(this.isEnterprise);
        LIZ.append(", userId='");
        Q89.LIZIZ(LIZ, this.userId, '\'', ", secUserId='");
        Q89.LIZIZ(LIZ, this.secUserId, '\'', ", isFollowSucess=");
        LIZ.append(this.isFollowSucess);
        LIZ.append(", isFollowChange=");
        LIZ.append(this.isFollowChange);
        LIZ.append(", followerStatus=");
        LIZ.append(this.followerStatus);
        LIZ.append(", followFrom=");
        LIZ.append(this.followFrom);
        LIZ.append(", preStatus=");
        return b0.LIZJ(LIZ, this.preStatus, '}', LIZ);
    }

    public FollowStatus(String str, int i) {
        this.userId = str;
        this.followStatus = i;
    }

    public FollowStatus(String str, int i, int i2) {
        this.userId = str;
        this.followStatus = i;
        this.status_code = i2;
    }
}
