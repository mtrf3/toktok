package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fluency_support_sample_v1")
/* loaded from: classes17.dex */
public final class LiveFluencySupportSampleSetting {

    @Group(isDefault = true, value = "default group")
    public static final LiveFluencySupportSample DEFAULT;
    public static final LiveFluencySupportSampleSetting INSTANCE = new LiveFluencySupportSampleSetting();
    public static LiveFluencySupportSample liveFluencySupportSample;

    static {
        LiveFluencySupportSample liveFluencySupportSample2 = new LiveFluencySupportSample(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 67108863, null);
        DEFAULT = liveFluencySupportSample2;
        LiveFluencySupportSample liveFluencySupportSample3 = (LiveFluencySupportSample) SettingsManager.INSTANCE.getValueSafely(LiveFluencySupportSampleSetting.class);
        if (liveFluencySupportSample3 != null) {
            liveFluencySupportSample2 = liveFluencySupportSample3;
        }
        liveFluencySupportSample = liveFluencySupportSample2;
    }

    public final int getAudienceLinkPeriodSamplingRate() {
        return liveFluencySupportSample.audienceLinkPeriod;
    }

    public final int getBroadcastEnterSamplingRate() {
        return liveFluencySupportSample.broadcastEnter;
    }

    public final int getBroadcastLinkPeriodSamplingRate() {
        return liveFluencySupportSample.broadcastLinkPeriod;
    }

    public final int getBroadcastPeriodSamplingRate() {
        return liveFluencySupportSample.broadcastLinkPeriod;
    }

    public final int getEffectPanelSlideSamplingRate() {
        return liveFluencySupportSample.panelEffectSlide;
    }

    public final int getGiftPlaySamplingRate() {
        return liveFluencySupportSample.giftPlay;
    }

    public final int getLinkMicRolePeriodSamplingRate() {
        return liveFluencySupportSample.linkMicRolePeriod;
    }

    public final int getPanelBeautySlideSamplingRate() {
        return liveFluencySupportSample.panelBeautySlide;
    }

    public final int getPanelBroadcastLinkSlideSamplingRate() {
        return liveFluencySupportSample.panelBroadcastLinkSlide;
    }

    public final int getPanelExtendedPublicScreenAutoSlideSamplingRate() {
        return liveFluencySupportSample.panelExtendedPublicScreenAutoSlide;
    }

    public final int getPanelExtendedPublicScreenSlideSamplingRate() {
        return liveFluencySupportSample.panelExtendedPublicScreenSlide;
    }

    public final int getPanelFilterSlideSamplingRate() {
        return liveFluencySupportSample.panelFilterSlide;
    }

    public final int getPanelGiftSlideSamplingRate() {
        return liveFluencySupportSample.panelGiftSlide;
    }

    public final int getPanelHourlyRankSlideSamplingRate() {
        return liveFluencySupportSample.panelHourlyRankSlide;
    }

    public final int getPanelPublicScreenAutoSlideSamplingRate() {
        return liveFluencySupportSample.panelPublicScreenAutoSlide;
    }

    public final int getPanelPublicScreenSlideSamplingRate() {
        return liveFluencySupportSample.panelPublicScreenSlide;
    }

    public final int getPanelSoundSlideSamplingRate() {
        return liveFluencySupportSample.panelSoundSlide;
    }

    public final int getPanelStickerSlideSamplingRate() {
        return liveFluencySupportSample.panelStickerSlide;
    }

    public final int getPannelMultiGuestSamplingRate() {
        return liveFluencySupportSample.panelMultiGuest;
    }

    public final int getPkPeriodSamplingRate() {
        return liveFluencySupportSample.pkPeriod;
    }

    public final int getPreviewEnterSamplingRate() {
        return liveFluencySupportSample.previewEnter;
    }

    public final int getPreviewPeriodSamplingRate() {
        return liveFluencySupportSample.previewPeriod;
    }

    public final int getRankShowSamplingRate() {
        return liveFluencySupportSample.rankShow;
    }

    public final int getWatchEnterSamplingRate() {
        return liveFluencySupportSample.watchEnter;
    }

    public final int getWatchPeriodSamplingRate() {
        return liveFluencySupportSample.watchPeriod;
    }

    public final int getWatchSlideSamplingRate() {
        return liveFluencySupportSample.watchSlide;
    }
}
