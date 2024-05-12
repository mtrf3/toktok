package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C15890jp;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChangePositionResult {
    public final Map<String, byte[]> extraItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangePositionResult copy$default(ChangePositionResult changePositionResult, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = changePositionResult.extraItems;
        }
        return changePositionResult.copy(map);
    }

    public final Map<String, byte[]> component1() {
        return this.extraItems;
    }

    public final ChangePositionResult copy(Map<String, byte[]> map) {
        return new ChangePositionResult(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangePositionResult) && o.LJ(this.extraItems, ((ChangePositionResult) obj).extraItems);
    }

    public int hashCode() {
        Map<String, byte[]> map = this.extraItems;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangePositionResult(extraItems=");
        return C15890jp.LIZ(LIZ, this.extraItems, ')', LIZ);
    }

    public ChangePositionResult(Map<String, byte[]> map) {
        this.extraItems = map;
    }
}
