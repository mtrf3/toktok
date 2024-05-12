package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;
import webcast.data.cohost_biz.BizLeaveJoinGroupResponse;

/* loaded from: classes14.dex */
public final class LeaveGroupResult {
    public final BizLeaveJoinGroupResponse cohostRespExtra;
    public final String logId;

    public static /* synthetic */ LeaveGroupResult copy$default(LeaveGroupResult leaveGroupResult, BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bizLeaveJoinGroupResponse = leaveGroupResult.cohostRespExtra;
        }
        if ((i & 2) != 0) {
            str = leaveGroupResult.logId;
        }
        return leaveGroupResult.copy(bizLeaveJoinGroupResponse, str);
    }

    public final LeaveGroupResult copy(BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse, String str) {
        return new LeaveGroupResult(bizLeaveJoinGroupResponse, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveGroupResult)) {
            return false;
        }
        LeaveGroupResult leaveGroupResult = (LeaveGroupResult) obj;
        return o.LJ(this.cohostRespExtra, leaveGroupResult.cohostRespExtra) && o.LJ(this.logId, leaveGroupResult.logId);
    }

    public int hashCode() {
        BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse = this.cohostRespExtra;
        int hashCode = (bizLeaveJoinGroupResponse == null ? 0 : bizLeaveJoinGroupResponse.hashCode()) * 31;
        String str = this.logId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LeaveGroupResult(cohostRespExtra=");
        LIZ.append(this.cohostRespExtra);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final BizLeaveJoinGroupResponse getCohostRespExtra() {
        return this.cohostRespExtra;
    }

    public final String getLogId() {
        return this.logId;
    }

    public LeaveGroupResult(BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse, String str) {
        this.cohostRespExtra = bizLeaveJoinGroupResponse;
        this.logId = str;
    }
}
