package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_valid_period_of_insert_sticker")
/* loaded from: classes6.dex */
public final class LiveValidPeriodOfInsertStickerSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 7776000;
    public static final LiveValidPeriodOfInsertStickerSetting INSTANCE = new LiveValidPeriodOfInsertStickerSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveValidPeriodOfInsertStickerSetting.class);
    }
}
