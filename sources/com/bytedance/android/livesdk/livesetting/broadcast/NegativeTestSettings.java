package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class NegativeTestSettings {

    @InterfaceC65349Pkn("cpu_cycle")
    public long cpuCycle;

    @InterfaceC65349Pkn("cpu_load_rate")
    public long cpuLoadRate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NegativeTestSettings() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.broadcast.NegativeTestSettings.<init>():void");
    }

    public NegativeTestSettings(long j, long j2) {
        this.cpuLoadRate = j;
        this.cpuCycle = j2;
    }

    public /* synthetic */ NegativeTestSettings(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}
