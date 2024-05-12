package com.ss.android.ugc.aweme.video.preload.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class BufferThreshold extends F9E {

    @InterfaceC65349Pkn("cache_duration")
    public final int cacheDuration;

    @InterfaceC65349Pkn("net_speed_factor")
    public final float netSpeedFactor;

    @InterfaceC65349Pkn("preload_safe_pos_offset")
    public final long preloadSafePosOffset;

    @InterfaceC65349Pkn("remain_to_start")
    public final long remainToStart;

    @InterfaceC65349Pkn("remain_to_stop")
    public final long remainToStop;

    @InterfaceC65349Pkn("video_duration_from")
    public final long videoDurationFrom;

    @InterfaceC65349Pkn("video_duration_to")
    public final long videoDurationTo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BufferThreshold() {
        /*
            r15 = this;
            r1 = 0
            r11 = 0
            r12 = 0
            r13 = 127(0x7f, float:1.78E-43)
            r14 = 0
            r0 = r15
            r3 = r1
            r5 = r1
            r7 = r1
            r9 = r1
            r0.<init>(r1, r3, r5, r7, r9, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.model.BufferThreshold.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.videoDurationFrom), Long.valueOf(this.videoDurationTo), Long.valueOf(this.remainToStop), Long.valueOf(this.remainToStart), Long.valueOf(this.preloadSafePosOffset), Integer.valueOf(this.cacheDuration), Float.valueOf(this.netSpeedFactor)};
    }

    public BufferThreshold(long j, long j2, long j3, long j4, long j5, int i, float f) {
        this.videoDurationFrom = j;
        this.videoDurationTo = j2;
        this.remainToStop = j3;
        this.remainToStart = j4;
        this.preloadSafePosOffset = j5;
        this.cacheDuration = i;
        this.netSpeedFactor = f;
    }

    public /* synthetic */ BufferThreshold(long j, long j2, long j3, long j4, long j5, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 10000L : j3, (i2 & 8) != 0 ? LivePlayEnforceIntervalSetting.DEFAULT : j4, (i2 & 16) == 0 ? j5 : 0L, (i2 & 32) != 0 ? 15 : i, (i2 & 64) != 0 ? 3.0f : f);
    }
}
