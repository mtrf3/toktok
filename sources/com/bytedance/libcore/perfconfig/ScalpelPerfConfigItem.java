package com.bytedance.libcore.perfconfig;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class ScalpelPerfConfigItem {

    @InterfaceC65349Pkn("min_cpu_time")
    public long minCpuTime;

    @InterfaceC65349Pkn("min_wall_time")
    public long minWallTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ScalpelPerfConfigItem() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.libcore.perfconfig.ScalpelPerfConfigItem.<init>():void");
    }

    public final long getMinCpuTime() {
        return this.minCpuTime;
    }

    public final long getMinWallTime() {
        return this.minWallTime;
    }

    public final void setMinCpuTime(long j) {
        this.minCpuTime = j;
    }

    public final void setMinWallTime(long j) {
        this.minWallTime = j;
    }

    public ScalpelPerfConfigItem(long j, long j2) {
        this.minWallTime = j;
        this.minCpuTime = j2;
    }

    public /* synthetic */ ScalpelPerfConfigItem(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Long.MAX_VALUE : j, (i & 2) != 0 ? Long.MAX_VALUE : j2);
    }
}
