package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;
import webcast.data.cohost_biz.BizJoinGroupResponse;

/* loaded from: classes7.dex */
public final class ApplyGroupResult {
    public final BizJoinGroupResponse cohostRespExtra;
    public final String logId;

    public static /* synthetic */ ApplyGroupResult copy$default(ApplyGroupResult applyGroupResult, BizJoinGroupResponse bizJoinGroupResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bizJoinGroupResponse = applyGroupResult.cohostRespExtra;
        }
        if ((i & 2) != 0) {
            str = applyGroupResult.logId;
        }
        return applyGroupResult.copy(bizJoinGroupResponse, str);
    }

    public final ApplyGroupResult copy(BizJoinGroupResponse bizJoinGroupResponse, String str) {
        return new ApplyGroupResult(bizJoinGroupResponse, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyGroupResult)) {
            return false;
        }
        ApplyGroupResult applyGroupResult = (ApplyGroupResult) obj;
        return o.LJ(this.cohostRespExtra, applyGroupResult.cohostRespExtra) && o.LJ(this.logId, applyGroupResult.logId);
    }

    public int hashCode() {
        BizJoinGroupResponse bizJoinGroupResponse = this.cohostRespExtra;
        int hashCode = (bizJoinGroupResponse == null ? 0 : bizJoinGroupResponse.hashCode()) * 31;
        String str = this.logId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplyGroupResult(cohostRespExtra=");
        LIZ.append(this.cohostRespExtra);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final BizJoinGroupResponse getCohostRespExtra() {
        return this.cohostRespExtra;
    }

    public final String getLogId() {
        return this.logId;
    }

    public ApplyGroupResult(BizJoinGroupResponse bizJoinGroupResponse, String str) {
        this.cohostRespExtra = bizJoinGroupResponse;
        this.logId = str;
    }
}
