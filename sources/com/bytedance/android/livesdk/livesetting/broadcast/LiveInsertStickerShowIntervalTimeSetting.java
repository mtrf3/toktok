package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_insert_sticker_show_interval_time")
/* loaded from: classes6.dex */
public final class LiveInsertStickerShowIntervalTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 259200;
    public static final LiveInsertStickerShowIntervalTimeSetting INSTANCE = new LiveInsertStickerShowIntervalTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveInsertStickerShowIntervalTimeSetting.class);
    }
}
