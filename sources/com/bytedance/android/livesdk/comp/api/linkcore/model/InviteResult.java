package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class InviteResult {
    public final Map<String, byte[]> extraItems;
    public final String logId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InviteResult copy$default(InviteResult inviteResult, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = inviteResult.extraItems;
        }
        if ((i & 2) != 0) {
            str = inviteResult.logId;
        }
        return inviteResult.copy(map, str);
    }

    public final Map<String, byte[]> component1() {
        return this.extraItems;
    }

    public final String component2() {
        return this.logId;
    }

    public final InviteResult copy(Map<String, byte[]> map, String logId) {
        o.LJIIIZ(logId, "logId");
        return new InviteResult(map, logId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteResult)) {
            return false;
        }
        InviteResult inviteResult = (InviteResult) obj;
        return o.LJ(this.extraItems, inviteResult.extraItems) && o.LJ(this.logId, inviteResult.logId);
    }

    public int hashCode() {
        Map<String, byte[]> map = this.extraItems;
        return this.logId.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteResult(extraItems=");
        LIZ.append(this.extraItems);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public InviteResult(Map<String, byte[]> map, String logId) {
        o.LJIIIZ(logId, "logId");
        this.extraItems = map;
        this.logId = logId;
    }

    public /* synthetic */ InviteResult(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? "" : str);
    }
}
