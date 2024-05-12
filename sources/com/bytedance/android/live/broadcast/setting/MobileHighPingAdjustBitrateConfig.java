package com.bytedance.android.live.broadcast.setting;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class MobileHighPingAdjustBitrateConfig {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("high_ping_adjust_bitrate_decline_range")
    public float high_ping_adjust_bitrate_decline_range;

    @InterfaceC65349Pkn("high_ping_adjust_bitrate_scope")
    public int high_ping_adjust_bitrate_scope;

    @InterfaceC65349Pkn("high_ping_adjust_bitrate_trigger_continue_high_ping_count")
    public int high_ping_adjust_bitrate_trigger_continue_high_ping_count;

    @InterfaceC65349Pkn("high_ping_adjust_bitrate_trigger_continue_not_high_ping_count")
    public int high_ping_adjust_bitrate_trigger_continue_not_high_ping_count;

    @InterfaceC65349Pkn("high_ping_limit_bitrate_allow_range")
    public float high_ping_limit_bitrate_allow_range;

    @InterfaceC65349Pkn("ping_confidence")
    public float ping_confidence;

    @InterfaceC65349Pkn("ping_value")
    public int ping_value;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MobileHighPingAdjustBitrateConfig() {
        /*
            r10 = this;
            r1 = 0
            r5 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 0
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.setting.MobileHighPingAdjustBitrateConfig.<init>():void");
    }

    public final float getHigh_ping_adjust_bitrate_decline_range() {
        return this.high_ping_adjust_bitrate_decline_range;
    }

    public final int getHigh_ping_adjust_bitrate_scope() {
        return this.high_ping_adjust_bitrate_scope;
    }

    public final int getHigh_ping_adjust_bitrate_trigger_continue_high_ping_count() {
        return this.high_ping_adjust_bitrate_trigger_continue_high_ping_count;
    }

    public final int getHigh_ping_adjust_bitrate_trigger_continue_not_high_ping_count() {
        return this.high_ping_adjust_bitrate_trigger_continue_not_high_ping_count;
    }

    public final float getHigh_ping_limit_bitrate_allow_range() {
        return this.high_ping_limit_bitrate_allow_range;
    }

    public final float getPing_confidence() {
        return this.ping_confidence;
    }

    public final int getPing_value() {
        return this.ping_value;
    }

    public final void setHigh_ping_adjust_bitrate_decline_range(float f) {
        this.high_ping_adjust_bitrate_decline_range = f;
    }

    public final void setHigh_ping_adjust_bitrate_scope(int i) {
        this.high_ping_adjust_bitrate_scope = i;
    }

    public final void setHigh_ping_adjust_bitrate_trigger_continue_high_ping_count(int i) {
        this.high_ping_adjust_bitrate_trigger_continue_high_ping_count = i;
    }

    public final void setHigh_ping_adjust_bitrate_trigger_continue_not_high_ping_count(int i) {
        this.high_ping_adjust_bitrate_trigger_continue_not_high_ping_count = i;
    }

    public final void setHigh_ping_limit_bitrate_allow_range(float f) {
        this.high_ping_limit_bitrate_allow_range = f;
    }

    public final void setPing_confidence(float f) {
        this.ping_confidence = f;
    }

    public final void setPing_value(int i) {
        this.ping_value = i;
    }

    public MobileHighPingAdjustBitrateConfig(int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this.high_ping_adjust_bitrate_scope = i;
        this.high_ping_adjust_bitrate_trigger_continue_high_ping_count = i2;
        this.high_ping_adjust_bitrate_trigger_continue_not_high_ping_count = i3;
        this.ping_value = i4;
        this.ping_confidence = f;
        this.high_ping_adjust_bitrate_decline_range = f2;
        this.high_ping_limit_bitrate_allow_range = f3;
    }

    public /* synthetic */ MobileHighPingAdjustBitrateConfig(int i, int i2, int i3, int i4, float f, float f2, float f3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 1 : i2, (i5 & 4) != 0 ? 3 : i3, (i5 & 8) != 0 ? 100 : i4, (i5 & 16) != 0 ? 0.95f : f, (i5 & 32) != 0 ? 0.8f : f2, (i5 & 64) != 0 ? 0.1f : f3);
    }
}
