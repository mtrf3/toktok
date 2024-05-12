package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReplyInviteGroupResult {
    public final String logId;

    public static /* synthetic */ ReplyInviteGroupResult copy$default(ReplyInviteGroupResult replyInviteGroupResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyInviteGroupResult.logId;
        }
        return replyInviteGroupResult.copy(str);
    }

    public final ReplyInviteGroupResult copy(String str) {
        return new ReplyInviteGroupResult(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReplyInviteGroupResult) && o.LJ(this.logId, ((ReplyInviteGroupResult) obj).logId);
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
        LIZ.append("ReplyInviteGroupResult(logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final String getLogId() {
        return this.logId;
    }

    public ReplyInviteGroupResult(String str) {
        this.logId = str;
    }
}
