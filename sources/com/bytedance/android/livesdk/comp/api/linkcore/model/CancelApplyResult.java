package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CancelApplyResult {
    public final Map<String, byte[]> extraItems;
    public final String logId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelApplyResult copy$default(CancelApplyResult cancelApplyResult, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cancelApplyResult.extraItems;
        }
        if ((i & 2) != 0) {
            str = cancelApplyResult.logId;
        }
        return cancelApplyResult.copy(map, str);
    }

    public final Map<String, byte[]> component1() {
        return this.extraItems;
    }

    public final String component2() {
        return this.logId;
    }

    public final CancelApplyResult copy(Map<String, byte[]> map, String logId) {
        o.LJIIIZ(logId, "logId");
        return new CancelApplyResult(map, logId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelApplyResult)) {
            return false;
        }
        CancelApplyResult cancelApplyResult = (CancelApplyResult) obj;
        return o.LJ(this.extraItems, cancelApplyResult.extraItems) && o.LJ(this.logId, cancelApplyResult.logId);
    }

    public int hashCode() {
        Map<String, byte[]> map = this.extraItems;
        return this.logId.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelApplyResult(extraItems=");
        LIZ.append(this.extraItems);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public CancelApplyResult(Map<String, byte[]> map, String logId) {
        o.LJIIIZ(logId, "logId");
        this.extraItems = map;
        this.logId = logId;
    }

    public /* synthetic */ CancelApplyResult(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? "" : str);
    }
}
