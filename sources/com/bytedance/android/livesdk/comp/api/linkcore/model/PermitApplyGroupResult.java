package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PermitApplyGroupResult {
    public final String logId;

    public static /* synthetic */ PermitApplyGroupResult copy$default(PermitApplyGroupResult permitApplyGroupResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permitApplyGroupResult.logId;
        }
        return permitApplyGroupResult.copy(str);
    }

    public final PermitApplyGroupResult copy(String str) {
        return new PermitApplyGroupResult(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PermitApplyGroupResult) && o.LJ(this.logId, ((PermitApplyGroupResult) obj).logId);
    }

    public int hashCode() {
        String str = this.logId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermitApplyGroupResult(logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final String getLogId() {
        return this.logId;
    }

    public PermitApplyGroupResult(String str) {
        this.logId = str;
    }
}
