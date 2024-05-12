package com.ss.android.ugc.aweme.setting.creatorverification;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes9.dex */
public final class CreatorVerificationResponse extends BaseResponse {

    @InterfaceC65349Pkn("RejectReason")
    public String rejectReason;

    @InterfaceC65349Pkn("VerificationStatus")
    public CreatorVerificationStatus verificationStatus;

    public final String getRejectReason() {
        return this.rejectReason;
    }

    public final CreatorVerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }

    public final void setRejectReason(String str) {
        this.rejectReason = str;
    }

    public final void setVerificationStatus(CreatorVerificationStatus creatorVerificationStatus) {
        this.verificationStatus = creatorVerificationStatus;
    }
}
