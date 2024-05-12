package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class AutoSkipApiConfig extends F9E {

    @InterfaceC65349Pkn("average_cost")
    public final long averageCost;

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("skip_interval")
    public final long skipInterval;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoSkipApiConfig() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 7
            r7 = 0
            r0 = r8
            r4 = r2
            r0.<init>(r1, r2, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.AutoSkipApiConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.count), Long.valueOf(this.averageCost), Long.valueOf(this.skipInterval)};
    }

    public AutoSkipApiConfig(int i, long j, long j2) {
        this.count = i;
        this.averageCost = j;
        this.skipInterval = j2;
    }

    public /* synthetic */ AutoSkipApiConfig(int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i, (i2 & 2) != 0 ? 20L : j, (i2 & 4) != 0 ? 180000L : j2);
    }
}
