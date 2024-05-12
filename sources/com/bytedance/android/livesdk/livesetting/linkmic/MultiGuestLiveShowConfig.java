package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MultiGuestLiveShowConfig {

    @InterfaceC65349Pkn("animation_downgrade_enabled")
    public int animationDowngradeEnabled;

    @InterfaceC65349Pkn("audience_main_switch")
    public int audienceMainSwitch;

    @InterfaceC65349Pkn("banner_refresh_shuffle_time")
    public int bannerRefreshShuffleTime;

    @InterfaceC65349Pkn("calibrate_content_time")
    public int calibrateContentTime;

    @InterfaceC65349Pkn("enable_calibrate_content")
    public int enableCalibrateContent;

    @InterfaceC65349Pkn("initial_allow_open_mic")
    public int initialAllowOpenMic;

    @InterfaceC65349Pkn("mute_audio_im_back_up")
    public int muteAudioImBackUp;

    @InterfaceC65349Pkn("new_version")
    public int newVersion;

    @InterfaceC65349Pkn("start_animation_duration")
    public int startAnimationDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiGuestLiveShowConfig() {
        /*
            r12 = this;
            r1 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r11 = 0
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfig.<init>():void");
    }

    public MultiGuestLiveShowConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.audienceMainSwitch = i;
        this.initialAllowOpenMic = i2;
        this.newVersion = i3;
        this.bannerRefreshShuffleTime = i4;
        this.calibrateContentTime = i5;
        this.animationDowngradeEnabled = i6;
        this.startAnimationDuration = i7;
        this.enableCalibrateContent = i8;
        this.muteAudioImBackUp = i9;
    }

    public /* synthetic */ MultiGuestLiveShowConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1 : i, (i10 & 2) != 0 ? 0 : i2, (i10 & 4) != 0 ? 2870 : i3, (i10 & 8) != 0 ? 4 : i4, (i10 & 16) != 0 ? 5 : i5, (i10 & 32) != 0 ? 0 : i6, (i10 & 64) == 0 ? i7 : 4, (i10 & 128) == 0 ? i8 : 0, (i10 & 256) != 0 ? -1 : i9);
    }
}
