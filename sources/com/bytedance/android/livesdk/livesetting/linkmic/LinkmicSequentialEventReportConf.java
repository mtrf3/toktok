package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class LinkmicSequentialEventReportConf {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("expire_time")
    public long expireTime;

    @InterfaceC65349Pkn("loop_duration")
    public long loopDuration;

    @InterfaceC65349Pkn("mem_caches")
    public long memCaches;

    @InterfaceC65349Pkn("start_up_trigger_duration")
    public long startUpTriggerDuration;

    @InterfaceC65349Pkn("time_slice")
    public long timeSlice;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkmicSequentialEventReportConf() {
        /*
            r14 = this;
            r1 = 0
            r2 = 0
            r12 = 63
            r13 = 0
            r0 = r14
            r4 = r2
            r6 = r2
            r8 = r2
            r10 = r2
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSequentialEventReportConf.<init>():void");
    }

    public LinkmicSequentialEventReportConf(boolean z, long j, long j2, long j3, long j4, long j5) {
        this.enable = z;
        this.loopDuration = j;
        this.memCaches = j2;
        this.expireTime = j3;
        this.timeSlice = j4;
        this.startUpTriggerDuration = j5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LinkmicSequentialEventReportConf(boolean r13, long r14, long r16, long r18, long r20, long r22, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r10 = r22
            r4 = r16
            r8 = r20
            r1 = r13
            r2 = r14
            r0 = r24 & 1
            if (r0 == 0) goto Ld
            r1 = 0
        Ld:
            r0 = r24 & 2
            r6 = 300000(0x493e0, double:1.482197E-318)
            if (r0 == 0) goto L17
            r2 = 300000(0x493e0, double:1.482197E-318)
        L17:
            r0 = r24 & 4
            if (r0 == 0) goto L1d
            r4 = 2048(0x800, double:1.012E-320)
        L1d:
            r0 = r24 & 8
            if (r0 == 0) goto L35
        L21:
            r0 = r24 & 16
            if (r0 == 0) goto L2a
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2a:
            r0 = r24 & 32
            if (r0 == 0) goto L30
            r10 = 0
        L30:
            r0 = r12
            r0.<init>(r1, r2, r4, r6, r8, r10)
            return
        L35:
            r6 = r18
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSequentialEventReportConf.<init>(boolean, long, long, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
