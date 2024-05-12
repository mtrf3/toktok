package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.b0;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ShareStateResponse extends BaseResponse {

    @InterfaceC65349Pkn("share_user")
    public ShareUserStruct[] shareUsers;

    /* loaded from: classes2.dex */
    public static final class ShareUserStruct implements Serializable {

        @InterfaceC65349Pkn("experiment_version")
        public ExperimentVersion experimentVersion;

        @InterfaceC65349Pkn("sec_user_id")
        public String secUserId;

        @InterfaceC65349Pkn("user_id")
        public String userId;

        @InterfaceC65349Pkn("follow_status")
        public int followStatus = -1;

        @InterfaceC65349Pkn("share_status")
        public int shareStatus = 2;

        public final String toUidString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShareUserStruct{sec_user_id=");
            LIZ.append(this.secUserId);
            LIZ.append(", follow_status=");
            LIZ.append(this.followStatus);
            LIZ.append(", share_status=");
            return b0.LIZJ(LIZ, this.shareStatus, '}', LIZ);
        }

        public final ExperimentVersion getExperimentVersion() {
            return this.experimentVersion;
        }

        public final int getFollowStatus() {
            return this.followStatus;
        }

        public final String getSecUserId() {
            return this.secUserId;
        }

        public final int getShareStatus() {
            return this.shareStatus;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final void setExperimentVersion(ExperimentVersion experimentVersion) {
            this.experimentVersion = experimentVersion;
        }

        public final void setFollowStatus(int i) {
            this.followStatus = i;
        }

        public final void setSecUserId(String str) {
            this.secUserId = str;
        }

        public final void setShareStatus(int i) {
            this.shareStatus = i;
        }

        public final void setUserId(String str) {
            this.userId = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ExperimentVersion implements Serializable {

        @InterfaceC65349Pkn("internal_share_holdout_receiver_receiver_side")
        public String internalShareHoldoutVersion;

        public final String getInternalShareHoldoutVersion() {
            return this.internalShareHoldoutVersion;
        }

        public final void setInternalShareHoldoutVersion(String str) {
            this.internalShareHoldoutVersion = str;
        }
    }

    public final ShareUserStruct[] getShareUsers() {
        return this.shareUsers;
    }

    public final void setShareUsers(ShareUserStruct[] shareUserStructArr) {
        this.shareUsers = shareUserStructArr;
    }
}
