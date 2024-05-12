package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MessageMonitorSamplingConfig {

    @InterfaceC65349Pkn("log_sampling")
    public double logSamplingRate;

    @InterfaceC65349Pkn("zstd_compress_samping")
    public double zstdSamplingRate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MessageMonitorSamplingConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.message.MessageMonitorSamplingConfig.<init>():void");
    }

    public final double getLogSamplingRate() {
        return this.logSamplingRate;
    }

    public final double getZstdSamplingRate() {
        return this.zstdSamplingRate;
    }

    public final void setLogSamplingRate(double d) {
        this.logSamplingRate = d;
    }

    public final void setZstdSamplingRate(double d) {
        this.zstdSamplingRate = d;
    }

    public MessageMonitorSamplingConfig(double d, double d2) {
        this.zstdSamplingRate = d;
        this.logSamplingRate = d2;
    }

    public /* synthetic */ MessageMonitorSamplingConfig(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.001d : d, (i & 2) != 0 ? 1.0d : d2);
    }
}
