package com.ss.android.ugc.aweme.bnpl.network.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class DoVerifyResponse {

    @InterfaceC65349Pkn("alert_msg")
    public final AlertMsg alertMsg;

    @InterfaceC65349Pkn("next_verify_info")
    public final String nextVerifyInfo;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    @InterfaceC65349Pkn("status")
    public final String status;

    @InterfaceC65349Pkn("status_reason")
    public final StatusReason statusReason;

    @InterfaceC65349Pkn("verify_detail")
    public final String verifyDetail;

    @InterfaceC65349Pkn("verify_result")
    public final String verifyResult;

    @InterfaceC65349Pkn("verify_type")
    public final String verifyType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoVerifyResponse)) {
            return false;
        }
        DoVerifyResponse doVerifyResponse = (DoVerifyResponse) obj;
        return o.LJ(this.status, doVerifyResponse.status) && o.LJ(this.verifyResult, doVerifyResponse.verifyResult) && o.LJ(this.verifyType, doVerifyResponse.verifyType) && o.LJ(this.nextVerifyInfo, doVerifyResponse.nextVerifyInfo) && o.LJ(this.statusReason, doVerifyResponse.statusReason) && o.LJ(this.requestId, doVerifyResponse.requestId) && o.LJ(this.verifyDetail, doVerifyResponse.verifyDetail) && o.LJ(this.alertMsg, doVerifyResponse.alertMsg);
    }

    public final int hashCode() {
        int hashCode = ((((((((((((this.status.hashCode() * 31) + this.verifyResult.hashCode()) * 31) + this.verifyType.hashCode()) * 31) + this.nextVerifyInfo.hashCode()) * 31) + this.statusReason.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.verifyDetail.hashCode()) * 31;
        AlertMsg alertMsg = this.alertMsg;
        return hashCode + (alertMsg == null ? 0 : alertMsg.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DoVerifyResponse(status=");
        LIZ.append(this.status);
        LIZ.append(", verifyResult=");
        LIZ.append(this.verifyResult);
        LIZ.append(", verifyType=");
        LIZ.append(this.verifyType);
        LIZ.append(", nextVerifyInfo=");
        LIZ.append(this.nextVerifyInfo);
        LIZ.append(", statusReason=");
        LIZ.append(this.statusReason);
        LIZ.append(", requestId=");
        LIZ.append(this.requestId);
        LIZ.append(", verifyDetail=");
        LIZ.append(this.verifyDetail);
        LIZ.append(", alertMsg=");
        LIZ.append(this.alertMsg);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DoVerifyResponse(String status, String verifyResult, String verifyType, String nextVerifyInfo, StatusReason statusReason, String requestId, String verifyDetail, AlertMsg alertMsg) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(verifyResult, "verifyResult");
        o.LJIIIZ(verifyType, "verifyType");
        o.LJIIIZ(nextVerifyInfo, "nextVerifyInfo");
        o.LJIIIZ(statusReason, "statusReason");
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(verifyDetail, "verifyDetail");
        this.status = status;
        this.verifyResult = verifyResult;
        this.verifyType = verifyType;
        this.nextVerifyInfo = nextVerifyInfo;
        this.statusReason = statusReason;
        this.requestId = requestId;
        this.verifyDetail = verifyDetail;
        this.alertMsg = alertMsg;
    }
}
