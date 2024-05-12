package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_crop_transcode_strategy_android")
/* loaded from: classes6.dex */
public final class LiveGiftCropTranscodeResourceSetting {

    @Group("Crop")
    public static final int CROP = 1;

    @Group("Crop & Transcode")
    public static final int CROP_TRANSCODE = 3;

    @Group(isDefault = true, value = "Default")
    public static final int DEFAULT = 0;
    public static final LiveGiftCropTranscodeResourceSetting INSTANCE = new LiveGiftCropTranscodeResourceSetting();

    @Group("Transcode")
    public static final int TRANSCODE = 2;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftCropTranscodeResourceSetting.class);
    }

    public final boolean shouldCrop() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean shouldCropTranscode() {
        if (getValue() == 3) {
            return true;
        }
        return false;
    }

    public final boolean shouldTranscode() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
