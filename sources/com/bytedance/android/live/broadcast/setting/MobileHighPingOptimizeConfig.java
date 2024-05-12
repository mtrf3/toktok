package com.bytedance.android.live.broadcast.setting;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class MobileHighPingOptimizeConfig {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("high_ping_tips_trigger_count")
    public int high_ping_tips_trigger_count;

    @InterfaceC65349Pkn("high_ping_value")
    public int high_ping_value;

    @InterfaceC65349Pkn("ping_confidence")
    public float ping_confidence;

    @InterfaceC65349Pkn("valid_high_ping_reference_count")
    public int valid_high_ping_reference_count;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MobileHighPingOptimizeConfig() {
        /*
            r7 = this;
            r1 = 0
            r4 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.setting.MobileHighPingOptimizeConfig.<init>():void");
    }

    public final int getHigh_ping_tips_trigger_count() {
        return this.high_ping_tips_trigger_count;
    }

    public final int getHigh_ping_value() {
        return this.high_ping_value;
    }

    public final float getPing_confidence() {
        return this.ping_confidence;
    }

    public final int getValid_high_ping_reference_count() {
        return this.valid_high_ping_reference_count;
    }

    public final void setHigh_ping_tips_trigger_count(int i) {
        this.high_ping_tips_trigger_count = i;
    }

    public final void setHigh_ping_value(int i) {
        this.high_ping_value = i;
    }

    public final void setPing_confidence(float f) {
        this.ping_confidence = f;
    }

    public final void setValid_high_ping_reference_count(int i) {
        this.valid_high_ping_reference_count = i;
    }

    public MobileHighPingOptimizeConfig(int i, int i2, int i3, float f) {
        this.valid_high_ping_reference_count = i;
        this.high_ping_tips_trigger_count = i2;
        this.high_ping_value = i3;
        this.ping_confidence = f;
    }

    public /* synthetic */ MobileHighPingOptimizeConfig(int i, int i2, int i3, float f, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 15 : i, (i4 & 2) != 0 ? 5 : i2, (i4 & 4) != 0 ? 100 : i3, (i4 & 8) != 0 ? 0.95f : f);
    }
}
