package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_level_save_entrance_click_times")
/* loaded from: classes6.dex */
public final class FansClubSaveClickTimesSettings {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 400;
    public static final FansClubSaveClickTimesSettings INSTANCE = new FansClubSaveClickTimesSettings();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(FansClubSaveClickTimesSettings.class);
    }
}
