package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class CrpConfig extends F9E {

    @InterfaceC65349Pkn("event_timeout_mills")
    public final long eventTimeOutMills;

    @InterfaceC65349Pkn("report_delayed_mills")
    public final long reportDelayedMills;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CrpConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.CrpConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.eventTimeOutMills), Long.valueOf(this.reportDelayedMills)};
    }

    public CrpConfig(long j, long j2) {
        this.eventTimeOutMills = j;
        this.reportDelayedMills = j2;
    }

    public /* synthetic */ CrpConfig(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 100L : j, (i & 2) != 0 ? 50L : j2);
    }
}
