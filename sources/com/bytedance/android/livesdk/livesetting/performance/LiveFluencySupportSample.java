package com.bytedance.android.livesdk.livesetting.performance;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public final class LiveFluencySupportSample {

    @InterfaceC65349Pkn("audience_link_period")
    public int audienceLinkPeriod;

    @InterfaceC65349Pkn("broadcast_enter")
    public int broadcastEnter;

    @InterfaceC65349Pkn("broadcast_link_period")
    public int broadcastLinkPeriod;

    @InterfaceC65349Pkn("broadcast_period")
    public int broadcastPeriod;

    @InterfaceC65349Pkn("gift_play")
    public int giftPlay;

    @InterfaceC65349Pkn("link_mic_role_period")
    public int linkMicRolePeriod;

    @InterfaceC65349Pkn("panel_beauty_slide")
    public int panelBeautySlide;

    @InterfaceC65349Pkn("panel_broadcast_link_slide")
    public int panelBroadcastLinkSlide;

    @InterfaceC65349Pkn("panel_effect_slide")
    public int panelEffectSlide;

    @InterfaceC65349Pkn("panel_extended_public_screen_auto_slide")
    public int panelExtendedPublicScreenAutoSlide;

    @InterfaceC65349Pkn("panel_extended_public_screen_slide")
    public int panelExtendedPublicScreenSlide;

    @InterfaceC65349Pkn("panel_filter_slide")
    public int panelFilterSlide;

    @InterfaceC65349Pkn("panel_gift_slide")
    public int panelGiftSlide;

    @InterfaceC65349Pkn("panel_hourly_rank_slide")
    public int panelHourlyRankSlide;

    @InterfaceC65349Pkn("panel_multi_guest")
    public int panelMultiGuest;

    @InterfaceC65349Pkn("panel_public_screen_auto_slide")
    public int panelPublicScreenAutoSlide;

    @InterfaceC65349Pkn("panel_public_screen_slide")
    public int panelPublicScreenSlide;

    @InterfaceC65349Pkn("panel_sound_slide")
    public int panelSoundSlide;

    @InterfaceC65349Pkn("panel_sticker_slide")
    public int panelStickerSlide;

    @InterfaceC65349Pkn("pk_period")
    public int pkPeriod;

    @InterfaceC65349Pkn("preview_enter")
    public int previewEnter;

    @InterfaceC65349Pkn("preview_period")
    public int previewPeriod;

    @InterfaceC65349Pkn("rank_show")
    public int rankShow;

    @InterfaceC65349Pkn("watch_enter")
    public int watchEnter;

    @InterfaceC65349Pkn("watch_period")
    public int watchPeriod;

    @InterfaceC65349Pkn("watch_slide")
    public int watchSlide;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveFluencySupportSample() {
        /*
            r29 = this;
            r1 = 0
            r27 = 67108863(0x3ffffff, float:1.5046327E-36)
            r28 = 0
            r0 = r29
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSample.<init>():void");
    }

    public LiveFluencySupportSample(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
        this.watchEnter = i;
        this.watchSlide = i2;
        this.watchPeriod = i3;
        this.broadcastEnter = i4;
        this.broadcastPeriod = i5;
        this.previewEnter = i6;
        this.previewPeriod = i7;
        this.broadcastLinkPeriod = i8;
        this.audienceLinkPeriod = i9;
        this.pkPeriod = i10;
        this.giftPlay = i11;
        this.panelGiftSlide = i12;
        this.panelHourlyRankSlide = i13;
        this.panelBroadcastLinkSlide = i14;
        this.panelPublicScreenSlide = i15;
        this.panelPublicScreenAutoSlide = i16;
        this.panelExtendedPublicScreenSlide = i17;
        this.panelExtendedPublicScreenAutoSlide = i18;
        this.panelBeautySlide = i19;
        this.panelFilterSlide = i20;
        this.panelStickerSlide = i21;
        this.panelSoundSlide = i22;
        this.panelMultiGuest = i23;
        this.linkMicRolePeriod = i24;
        this.rankShow = i25;
        this.panelEffectSlide = i26;
    }

    public /* synthetic */ LiveFluencySupportSample(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, DefaultConstructorMarker defaultConstructorMarker) {
        this((i27 & 1) != 0 ? 10 : i, (i27 & 2) != 0 ? 10 : i2, (i27 & 4) != 0 ? 10 : i3, (i27 & 8) != 0 ? 10 : i4, (i27 & 16) != 0 ? 10 : i5, (i27 & 32) != 0 ? 10 : i6, (i27 & 64) != 0 ? 10 : i7, (i27 & 128) != 0 ? 10 : i8, (i27 & 256) != 0 ? 10 : i9, (i27 & 512) != 0 ? 10 : i10, (i27 & 1024) != 0 ? 10 : i11, (i27 & 2048) != 0 ? 10 : i12, (i27 & 4096) != 0 ? 10 : i13, (i27 & FileUtils.BUFFER_SIZE) != 0 ? 10 : i14, (i27 & 16384) != 0 ? 10 : i15, (32768 & i27) != 0 ? 10 : i16, (65536 & i27) != 0 ? 10 : i17, (131072 & i27) != 0 ? 10 : i18, (262144 & i27) != 0 ? 10 : i19, (524288 & i27) != 0 ? 10 : i20, (1048576 & i27) != 0 ? 10 : i21, (2097152 & i27) != 0 ? 10 : i22, (4194304 & i27) != 0 ? 10 : i23, (8388608 & i27) != 0 ? 10 : i24, (16777216 & i27) != 0 ? 10 : i25, (i27 & 33554432) != 0 ? 10 : i26);
    }
}
