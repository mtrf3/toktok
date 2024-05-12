package com.ss.android.ugc.tiktok.location.popup.config;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FypPoiPermissionFrequencyConfig {

    @InterfaceC65349Pkn("enable")
    public final Boolean enable;

    @InterfaceC65349Pkn("is_only_once")
    public final boolean isOnlyOnce;

    @InterfaceC65349Pkn("is_poi_relevant_event")
    public final boolean isPoiEvent;

    @InterfaceC65349Pkn("time_gap")
    public final int timeGap;

    @InterfaceC65349Pkn("vv_count")
    public final int vvCount;

    @InterfaceC65349Pkn("waiting_threshold")
    public final long waitingThreshold;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FypPoiPermissionFrequencyConfig() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r8 = 63
            r0 = r10
            r3 = r2
            r4 = r2
            r5 = r2
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.location.popup.config.FypPoiPermissionFrequencyConfig.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FypPoiPermissionFrequencyConfig)) {
            return false;
        }
        FypPoiPermissionFrequencyConfig fypPoiPermissionFrequencyConfig = (FypPoiPermissionFrequencyConfig) obj;
        return o.LJ(this.enable, fypPoiPermissionFrequencyConfig.enable) && this.isOnlyOnce == fypPoiPermissionFrequencyConfig.isOnlyOnce && this.isPoiEvent == fypPoiPermissionFrequencyConfig.isPoiEvent && this.vvCount == fypPoiPermissionFrequencyConfig.vvCount && this.timeGap == fypPoiPermissionFrequencyConfig.timeGap && this.waitingThreshold == fypPoiPermissionFrequencyConfig.waitingThreshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Boolean bool = this.enable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z = this.isOnlyOnce;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return C16880lQ.LLJIJIL(this.waitingThreshold) + ((((((((hashCode + i) * 31) + (this.isPoiEvent ? 1 : 0)) * 31) + this.vvCount) * 31) + this.timeGap) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FypPoiPermissionFrequencyConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", isOnlyOnce=");
        LIZ.append(this.isOnlyOnce);
        LIZ.append(", isPoiEvent=");
        LIZ.append(this.isPoiEvent);
        LIZ.append(", vvCount=");
        LIZ.append(this.vvCount);
        LIZ.append(", timeGap=");
        LIZ.append(this.timeGap);
        LIZ.append(", waitingThreshold=");
        return C47135Ieh.LIZIZ(LIZ, this.waitingThreshold, ')', LIZ);
    }

    public FypPoiPermissionFrequencyConfig(Boolean bool, boolean z, boolean z2, int i, int i2, long j) {
        this.enable = bool;
        this.isOnlyOnce = z;
        this.isPoiEvent = z2;
        this.vvCount = i;
        this.timeGap = i2;
        this.waitingThreshold = j;
    }

    public /* synthetic */ FypPoiPermissionFrequencyConfig(Boolean bool, boolean z, boolean z2, int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : bool, (i3 & 2) != 0 ? false : z, (i3 & 4) == 0 ? z2 : false, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? -1L : j);
    }
}
