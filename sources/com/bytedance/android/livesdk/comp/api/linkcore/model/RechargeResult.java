package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelAllUser;

/* loaded from: classes7.dex */
public final class RechargeResult {
    public final GroupChannelAllUser groupChannelAllUser;
    public final String logId;

    public static /* synthetic */ RechargeResult copy$default(RechargeResult rechargeResult, GroupChannelAllUser groupChannelAllUser, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            groupChannelAllUser = rechargeResult.groupChannelAllUser;
        }
        if ((i & 2) != 0) {
            str = rechargeResult.logId;
        }
        return rechargeResult.copy(groupChannelAllUser, str);
    }

    public final RechargeResult copy(GroupChannelAllUser groupChannelAllUser, String str) {
        return new RechargeResult(groupChannelAllUser, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RechargeResult)) {
            return false;
        }
        RechargeResult rechargeResult = (RechargeResult) obj;
        return o.LJ(this.groupChannelAllUser, rechargeResult.groupChannelAllUser) && o.LJ(this.logId, rechargeResult.logId);
    }

    public int hashCode() {
        GroupChannelAllUser groupChannelAllUser = this.groupChannelAllUser;
        int hashCode = (groupChannelAllUser == null ? 0 : groupChannelAllUser.hashCode()) * 31;
        String str = this.logId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RechargeResult(groupChannelAllUser=");
        LIZ.append(this.groupChannelAllUser);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final GroupChannelAllUser getGroupChannelAllUser() {
        return this.groupChannelAllUser;
    }

    public final String getLogId() {
        return this.logId;
    }

    public RechargeResult(GroupChannelAllUser groupChannelAllUser, String str) {
        this.groupChannelAllUser = groupChannelAllUser;
        this.logId = str;
    }
}
