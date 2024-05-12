package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ApplyResult {
    public final String logId;
    public final BizApplyResponse multiGuestRespExtra;

    public static /* synthetic */ ApplyResult copy$default(ApplyResult applyResult, BizApplyResponse bizApplyResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bizApplyResponse = applyResult.multiGuestRespExtra;
        }
        if ((i & 2) != 0) {
            str = applyResult.logId;
        }
        return applyResult.copy(bizApplyResponse, str);
    }

    public final BizApplyResponse component1() {
        return this.multiGuestRespExtra;
    }

    public final String component2() {
        return this.logId;
    }

    public final ApplyResult copy(BizApplyResponse bizApplyResponse, String logId) {
        o.LJIIIZ(logId, "logId");
        return new ApplyResult(bizApplyResponse, logId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyResult)) {
            return false;
        }
        ApplyResult applyResult = (ApplyResult) obj;
        return o.LJ(this.multiGuestRespExtra, applyResult.multiGuestRespExtra) && o.LJ(this.logId, applyResult.logId);
    }

    public int hashCode() {
        BizApplyResponse bizApplyResponse = this.multiGuestRespExtra;
        return this.logId.hashCode() + ((bizApplyResponse == null ? 0 : bizApplyResponse.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplyResult(multiGuestRespExtra=");
        LIZ.append(this.multiGuestRespExtra);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public ApplyResult(BizApplyResponse bizApplyResponse, String logId) {
        o.LJIIIZ(logId, "logId");
        this.multiGuestRespExtra = bizApplyResponse;
        this.logId = logId;
    }

    public /* synthetic */ ApplyResult(BizApplyResponse bizApplyResponse, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bizApplyResponse, (i & 2) != 0 ? "" : str);
    }
}
