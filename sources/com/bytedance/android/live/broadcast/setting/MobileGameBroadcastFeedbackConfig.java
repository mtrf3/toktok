package com.bytedance.android.live.broadcast.setting;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class MobileGameBroadcastFeedbackConfig {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("battery_temp_android")
    public int battery_temp_android;

    @InterfaceC65349Pkn("battery_temp_lasting")
    public int battery_temp_lasting;

    @InterfaceC65349Pkn("livecore_data_sample_interval")
    public int livecore_data_sample_interval;

    @InterfaceC65349Pkn("ping_high_proportion")
    public float ping_high_proportion;

    @InterfaceC65349Pkn("ping_number")
    public int ping_number;

    @InterfaceC65349Pkn("ping_value")
    public int ping_value;

    @InterfaceC65349Pkn("power_low")
    public int power_low;

    @InterfaceC65349Pkn("power_low_proportion")
    public float power_low_proportion;

    @InterfaceC65349Pkn("power_save_mode_proportion")
    public float power_save_mode_proportion;

    @InterfaceC65349Pkn("real_bitrate_less_min_lasting")
    public int real_bitrate_less_min_lasting;

    @InterfaceC65349Pkn("real_bitrate_less_min_proportion")
    public float real_bitrate_less_min_proportion;

    @InterfaceC65349Pkn("real_fps_lasting")
    public int real_fps_lasting;

    @InterfaceC65349Pkn("real_fps_proportion")
    public float real_fps_proportion;

    @InterfaceC65349Pkn("real_fps_size")
    public int real_fps_size;

    @InterfaceC65349Pkn("rtt_lasting")
    public int rtt_lasting;

    @InterfaceC65349Pkn("rtt_size")
    public int rtt_size;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MobileGameBroadcastFeedbackConfig() {
        /*
            r19 = this;
            r1 = 0
            r4 = 0
            r17 = 65535(0xffff, float:9.1834E-41)
            r18 = 0
            r0 = r19
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r1
            r7 = r4
            r8 = r1
            r9 = r4
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r4
            r14 = r1
            r15 = r1
            r16 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.setting.MobileGameBroadcastFeedbackConfig.<init>():void");
    }

    public final int getBattery_temp_android() {
        return this.battery_temp_android;
    }

    public final int getBattery_temp_lasting() {
        return this.battery_temp_lasting;
    }

    public final int getLivecore_data_sample_interval() {
        return this.livecore_data_sample_interval;
    }

    public final float getPing_high_proportion() {
        return this.ping_high_proportion;
    }

    public final int getPing_number() {
        return this.ping_number;
    }

    public final int getPing_value() {
        return this.ping_value;
    }

    public final int getPower_low() {
        return this.power_low;
    }

    public final float getPower_low_proportion() {
        return this.power_low_proportion;
    }

    public final float getPower_save_mode_proportion() {
        return this.power_save_mode_proportion;
    }

    public final int getReal_bitrate_less_min_lasting() {
        return this.real_bitrate_less_min_lasting;
    }

    public final float getReal_bitrate_less_min_proportion() {
        return this.real_bitrate_less_min_proportion;
    }

    public final int getReal_fps_lasting() {
        return this.real_fps_lasting;
    }

    public final float getReal_fps_proportion() {
        return this.real_fps_proportion;
    }

    public final int getReal_fps_size() {
        return this.real_fps_size;
    }

    public final int getRtt_lasting() {
        return this.rtt_lasting;
    }

    public final int getRtt_size() {
        return this.rtt_size;
    }

    public final void setBattery_temp_android(int i) {
        this.battery_temp_android = i;
    }

    public final void setBattery_temp_lasting(int i) {
        this.battery_temp_lasting = i;
    }

    public final void setLivecore_data_sample_interval(int i) {
        this.livecore_data_sample_interval = i;
    }

    public final void setPing_high_proportion(float f) {
        this.ping_high_proportion = f;
    }

    public final void setPing_number(int i) {
        this.ping_number = i;
    }

    public final void setPing_value(int i) {
        this.ping_value = i;
    }

    public final void setPower_low(int i) {
        this.power_low = i;
    }

    public final void setPower_low_proportion(float f) {
        this.power_low_proportion = f;
    }

    public final void setPower_save_mode_proportion(float f) {
        this.power_save_mode_proportion = f;
    }

    public final void setReal_bitrate_less_min_lasting(int i) {
        this.real_bitrate_less_min_lasting = i;
    }

    public final void setReal_bitrate_less_min_proportion(float f) {
        this.real_bitrate_less_min_proportion = f;
    }

    public final void setReal_fps_lasting(int i) {
        this.real_fps_lasting = i;
    }

    public final void setReal_fps_proportion(float f) {
        this.real_fps_proportion = f;
    }

    public final void setReal_fps_size(int i) {
        this.real_fps_size = i;
    }

    public final void setRtt_lasting(int i) {
        this.rtt_lasting = i;
    }

    public final void setRtt_size(int i) {
        this.rtt_size = i;
    }

    public MobileGameBroadcastFeedbackConfig(int i, int i2, int i3, float f, float f2, int i4, float f3, int i5, float f4, int i6, int i7, int i8, float f5, int i9, int i10, int i11) {
        this.battery_temp_android = i;
        this.battery_temp_lasting = i2;
        this.power_low = i3;
        this.power_low_proportion = f;
        this.power_save_mode_proportion = f2;
        this.real_bitrate_less_min_lasting = i4;
        this.real_bitrate_less_min_proportion = f3;
        this.real_fps_lasting = i5;
        this.real_fps_proportion = f4;
        this.real_fps_size = i6;
        this.rtt_lasting = i7;
        this.rtt_size = i8;
        this.ping_high_proportion = f5;
        this.ping_number = i9;
        this.ping_value = i10;
        this.livecore_data_sample_interval = i11;
    }

    public /* synthetic */ MobileGameBroadcastFeedbackConfig(int i, int i2, int i3, float f, float f2, int i4, float f3, int i5, float f4, int i6, int i7, int i8, float f5, int i9, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 45 : i, (i12 & 2) != 0 ? 300 : i2, (i12 & 4) != 0 ? 20 : i3, (i12 & 8) != 0 ? 0.7f : f, (i12 & 16) != 0 ? 0.9f : f2, (i12 & 32) != 0 ? 60 : i4, (i12 & 64) != 0 ? 0.4f : f3, (i12 & 128) == 0 ? i5 : 60, (i12 & 256) == 0 ? f4 : 0.4f, (i12 & 512) == 0 ? i6 : 20, (i12 & 1024) != 0 ? LiveTryModeCountDownThresholdSetting.DEFAULT : i7, (i12 & 2048) != 0 ? 100 : i8, (i12 & 4096) != 0 ? 0.3f : f5, (i12 & FileUtils.BUFFER_SIZE) != 0 ? 10 : i9, (i12 & 16384) != 0 ? 100 : i10, (i12 & 32768) != 0 ? 5 : i11);
    }
}
