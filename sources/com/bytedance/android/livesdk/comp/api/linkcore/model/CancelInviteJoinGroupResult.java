package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CancelInviteJoinGroupResult {
    public final String logId;

    public static /* synthetic */ CancelInviteJoinGroupResult copy$default(CancelInviteJoinGroupResult cancelInviteJoinGroupResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelInviteJoinGroupResult.logId;
        }
        return cancelInviteJoinGroupResult.copy(str);
    }

    public final CancelInviteJoinGroupResult copy(String str) {
        return new CancelInviteJoinGroupResult(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelInviteJoinGroupResult) && o.LJ(this.logId, ((CancelInviteJoinGroupResult) obj).logId);
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
        LIZ.append("CancelInviteJoinGroupResult(logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final String getLogId() {
        return this.logId;
    }

    public CancelInviteJoinGroupResult(String str) {
        this.logId = str;
    }
}
