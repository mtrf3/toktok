package com.bytedance.android.livesdk.live.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SpeakingVoiceConfig {

    @InterfaceC65349Pkn("voice_high_value")
    public int high;

    @InterfaceC65349Pkn("voice_low_value")
    public int low;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SpeakingVoiceConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.live.model.SpeakingVoiceConfig.<init>():void");
    }

    public final int getHigh() {
        return this.high;
    }

    public final int getLow() {
        return this.low;
    }

    public final void setHigh(int i) {
        this.high = i;
    }

    public final void setLow(int i) {
        this.low = i;
    }

    public SpeakingVoiceConfig(int i, int i2) {
        this.low = i;
        this.high = i2;
    }

    public /* synthetic */ SpeakingVoiceConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? LiveTryModeCountDownThresholdSetting.DEFAULT : i, (i3 & 2) != 0 ? 180 : i2);
    }
}
