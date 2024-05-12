package com.bytedance.helios.api.config;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public class DefaultSampleRateConfig implements Serializable {

    @InterfaceC65349Pkn("intercept_error")
    public final double interceptError;

    @InterfaceC65349Pkn("local_sample_rate")
    public final double localSampleRate;

    @InterfaceC65349Pkn("monitor_error")
    public final double monitorError;

    @InterfaceC65349Pkn("monitor_normal")
    public final double monitorNormal;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DefaultSampleRateConfig() {
        /*
            r11 = this;
            r1 = 0
            r9 = 15
            r10 = 0
            r0 = r11
            r3 = r1
            r5 = r1
            r7 = r1
            r0.<init>(r1, r3, r5, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.DefaultSampleRateConfig.<init>():void");
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DefaultSampleRateConfig(monitorNormal=");
        LIZ.append(this.monitorNormal);
        LIZ.append(',');
        LIZ.append("monitorError=");
        LIZ.append(this.monitorError);
        LIZ.append(",interceptError=");
        LIZ.append(this.interceptError);
        LIZ.append(",localSampleRate=");
        return C07670Rv.LIZ(LIZ, this.localSampleRate, ')', LIZ);
    }

    public final double getInterceptError() {
        return this.interceptError;
    }

    public final double getLocalSampleRate() {
        return this.localSampleRate;
    }

    public final double getMonitorError() {
        return this.monitorError;
    }

    public final double getMonitorNormal() {
        return this.monitorNormal;
    }

    public DefaultSampleRateConfig(double d, double d2, double d3, double d4) {
        this.monitorNormal = d;
        this.monitorError = d2;
        this.interceptError = d3;
        this.localSampleRate = d4;
    }

    public /* synthetic */ DefaultSampleRateConfig(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 2) != 0 ? 0.01d : d2, (i & 4) != 0 ? 1.0d : d3, (i & 8) == 0 ? d4 : 1.0d);
    }
}
