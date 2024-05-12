package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;
import webcast.data.cohost_biz.BizJoinGroupResponse;

/* loaded from: classes7.dex */
public final class InviteGroupResult {
    public final BizJoinGroupResponse cohostRespExtra;
    public final String logId;

    public static /* synthetic */ InviteGroupResult copy$default(InviteGroupResult inviteGroupResult, BizJoinGroupResponse bizJoinGroupResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bizJoinGroupResponse = inviteGroupResult.cohostRespExtra;
        }
        if ((i & 2) != 0) {
            str = inviteGroupResult.logId;
        }
        return inviteGroupResult.copy(bizJoinGroupResponse, str);
    }

    public final InviteGroupResult copy(BizJoinGroupResponse bizJoinGroupResponse, String str) {
        return new InviteGroupResult(bizJoinGroupResponse, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteGroupResult)) {
            return false;
        }
        InviteGroupResult inviteGroupResult = (InviteGroupResult) obj;
        return o.LJ(this.cohostRespExtra, inviteGroupResult.cohostRespExtra) && o.LJ(this.logId, inviteGroupResult.logId);
    }

    public int hashCode() {
        BizJoinGroupResponse bizJoinGroupResponse = this.cohostRespExtra;
        int hashCode = (bizJoinGroupResponse == null ? 0 : bizJoinGroupResponse.hashCode()) * 31;
        String str = this.logId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteGroupResult(cohostRespExtra=");
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

    public InviteGroupResult(BizJoinGroupResponse bizJoinGroupResponse, String str) {
        this.cohostRespExtra = bizJoinGroupResponse;
        this.logId = str;
    }
}
