package com.bytedance.android.livesdk.performance.config;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class RealtimePerfScoreConfig {

    @InterfaceC65349Pkn("battery_temp")
    public PerfItemConfig batteryTemperature;

    @InterfaceC65349Pkn("cpu_speed")
    public PerfItemConfig cpuSpeed;

    @InterfaceC65349Pkn("fps")
    public PerfItemConfig fps;

    @InterfaceC65349Pkn("is_enabled")
    public boolean isEnabled;

    @InterfaceC65349Pkn("is_report_all")
    public boolean isReportAll;

    @InterfaceC65349Pkn("jvm_heap_usage")
    public PerfItemConfig jvmHeapUsage;

    @InterfaceC65349Pkn("max_score")
    public float maxScore;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RealtimePerfScoreConfig() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r5 = r4
            r6 = r4
            r7 = r4
            r9 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.config.RealtimePerfScoreConfig.<init>():void");
    }

    public final PerfItemConfig getBatteryTemperature() {
        return this.batteryTemperature;
    }

    public final PerfItemConfig getCpuSpeed() {
        return this.cpuSpeed;
    }

    public final PerfItemConfig getFps() {
        return this.fps;
    }

    public final PerfItemConfig getJvmHeapUsage() {
        return this.jvmHeapUsage;
    }

    public final float getMaxScore() {
        return this.maxScore;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isReportAll() {
        return this.isReportAll;
    }

    public final void setBatteryTemperature(PerfItemConfig perfItemConfig) {
        this.batteryTemperature = perfItemConfig;
    }

    public final void setCpuSpeed(PerfItemConfig perfItemConfig) {
        this.cpuSpeed = perfItemConfig;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setFps(PerfItemConfig perfItemConfig) {
        this.fps = perfItemConfig;
    }

    public final void setJvmHeapUsage(PerfItemConfig perfItemConfig) {
        this.jvmHeapUsage = perfItemConfig;
    }

    public final void setMaxScore(float f) {
        this.maxScore = f;
    }

    public final void setReportAll(boolean z) {
        this.isReportAll = z;
    }

    public RealtimePerfScoreConfig(boolean z, boolean z2, float f, PerfItemConfig perfItemConfig, PerfItemConfig perfItemConfig2, PerfItemConfig perfItemConfig3, PerfItemConfig perfItemConfig4) {
        this.isEnabled = z;
        this.isReportAll = z2;
        this.maxScore = f;
        this.cpuSpeed = perfItemConfig;
        this.fps = perfItemConfig2;
        this.batteryTemperature = perfItemConfig3;
        this.jvmHeapUsage = perfItemConfig4;
    }

    public /* synthetic */ RealtimePerfScoreConfig(boolean z, boolean z2, float f, PerfItemConfig perfItemConfig, PerfItemConfig perfItemConfig2, PerfItemConfig perfItemConfig3, PerfItemConfig perfItemConfig4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? null : perfItemConfig, (i & 16) != 0 ? null : perfItemConfig2, (i & 32) != 0 ? null : perfItemConfig3, (i & 64) == 0 ? perfItemConfig4 : null);
    }
}
