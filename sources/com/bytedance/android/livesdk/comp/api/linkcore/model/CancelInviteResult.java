package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CancelInviteResult {
    public final Map<String, byte[]> extraItems;
    public final String logId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelInviteResult copy$default(CancelInviteResult cancelInviteResult, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cancelInviteResult.extraItems;
        }
        if ((i & 2) != 0) {
            str = cancelInviteResult.logId;
        }
        return cancelInviteResult.copy(map, str);
    }

    public final Map<String, byte[]> component1() {
        return this.extraItems;
    }

    public final String component2() {
        return this.logId;
    }

    public final CancelInviteResult copy(Map<String, byte[]> map, String logId) {
        o.LJIIIZ(logId, "logId");
        return new CancelInviteResult(map, logId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelInviteResult)) {
            return false;
        }
        CancelInviteResult cancelInviteResult = (CancelInviteResult) obj;
        return o.LJ(this.extraItems, cancelInviteResult.extraItems) && o.LJ(this.logId, cancelInviteResult.logId);
    }

    public int hashCode() {
        Map<String, byte[]> map = this.extraItems;
        return this.logId.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelInviteResult(extraItems=");
        LIZ.append(this.extraItems);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public CancelInviteResult(Map<String, byte[]> map, String logId) {
        o.LJIIIZ(logId, "logId");
        this.extraItems = map;
        this.logId = logId;
    }

    public /* synthetic */ CancelInviteResult(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? "" : str);
    }
}
