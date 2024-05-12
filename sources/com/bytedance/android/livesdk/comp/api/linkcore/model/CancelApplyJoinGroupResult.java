package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CancelApplyJoinGroupResult {
    public final String logId;

    public static /* synthetic */ CancelApplyJoinGroupResult copy$default(CancelApplyJoinGroupResult cancelApplyJoinGroupResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelApplyJoinGroupResult.logId;
        }
        return cancelApplyJoinGroupResult.copy(str);
    }

    public final CancelApplyJoinGroupResult copy(String str) {
        return new CancelApplyJoinGroupResult(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelApplyJoinGroupResult) && o.LJ(this.logId, ((CancelApplyJoinGroupResult) obj).logId);
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
        LIZ.append("CancelApplyJoinGroupResult(logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final String getLogId() {
        return this.logId;
    }

    public CancelApplyJoinGroupResult(String str) {
        this.logId = str;
    }
}
