package com.bytedance.android.livesdk.live.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class VolumeDetectConfig {

    @InterfaceC65349Pkn("count_threshold")
    public int countThreshold;

    @InterfaceC65349Pkn("detect_interval_seconds")
    public int detectIntervalSeconds;

    @InterfaceC65349Pkn("first_count_down_duration_minutes")
    public int firstCountDownDurationMinutes;

    @InterfaceC65349Pkn("pause_prompt_duration_minutes")
    public int pausePromptDurationMinutes;

    @InterfaceC65349Pkn("volume_threshold")
    public int volumeThreshold;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VolumeDetectConfig() {
        /*
            r8 = this;
            r1 = 0
            r6 = 31
            r7 = 0
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.live.model.VolumeDetectConfig.<init>():void");
    }

    public final int getCountThreshold() {
        return this.countThreshold;
    }

    public final int getDetectIntervalSeconds() {
        return this.detectIntervalSeconds;
    }

    public final int getFirstCountDownDurationMinutes() {
        return this.firstCountDownDurationMinutes;
    }

    public final int getPausePromptDurationMinutes() {
        return this.pausePromptDurationMinutes;
    }

    public final int getVolumeThreshold() {
        return this.volumeThreshold;
    }

    public final void setCountThreshold(int i) {
        this.countThreshold = i;
    }

    public final void setDetectIntervalSeconds(int i) {
        this.detectIntervalSeconds = i;
    }

    public final void setFirstCountDownDurationMinutes(int i) {
        this.firstCountDownDurationMinutes = i;
    }

    public final void setPausePromptDurationMinutes(int i) {
        this.pausePromptDurationMinutes = i;
    }

    public final void setVolumeThreshold(int i) {
        this.volumeThreshold = i;
    }

    public VolumeDetectConfig(int i, int i2, int i3, int i4, int i5) {
        this.firstCountDownDurationMinutes = i;
        this.detectIntervalSeconds = i2;
        this.volumeThreshold = i3;
        this.countThreshold = i4;
        this.pausePromptDurationMinutes = i5;
    }

    public /* synthetic */ VolumeDetectConfig(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 3 : i, (i6 & 2) != 0 ? 3 : i2, (i6 & 4) != 0 ? 3 : i3, (i6 & 8) != 0 ? 3 : i4, (i6 & 16) != 0 ? 3 : i5);
    }
}
