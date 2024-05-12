package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.b0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class KickOutAllData {
    public final Map<String, String> customData;
    public final int kickOutReason;

    /* JADX WARN: Multi-variable type inference failed */
    public KickOutAllData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KickOutAllData copy$default(KickOutAllData kickOutAllData, Map map, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = kickOutAllData.customData;
        }
        if ((i2 & 2) != 0) {
            i = kickOutAllData.kickOutReason;
        }
        return kickOutAllData.copy(map, i);
    }

    public final KickOutAllData copy(Map<String, String> map, int i) {
        return new KickOutAllData(map, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KickOutAllData)) {
            return false;
        }
        KickOutAllData kickOutAllData = (KickOutAllData) obj;
        return o.LJ(this.customData, kickOutAllData.customData) && this.kickOutReason == kickOutAllData.kickOutReason;
    }

    public int hashCode() {
        Map<String, String> map = this.customData;
        return ((map == null ? 0 : map.hashCode()) * 31) + this.kickOutReason;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KickOutAllData(customData=");
        LIZ.append(this.customData);
        LIZ.append(", kickOutReason=");
        return b0.LIZJ(LIZ, this.kickOutReason, ')', LIZ);
    }

    public final Map<String, String> getCustomData() {
        return this.customData;
    }

    public final int getKickOutReason() {
        return this.kickOutReason;
    }

    public KickOutAllData(Map<String, String> map, int i) {
        this.customData = map;
        this.kickOutReason = i;
    }

    public /* synthetic */ KickOutAllData(Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : map, (i2 & 2) != 0 ? 2 : i);
    }
}
