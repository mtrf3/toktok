package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_room_age_restriction_show_type")
/* loaded from: classes6.dex */
public final class LiveMatureEntranceShowSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMatureEntranceShowSetting INSTANCE = new LiveMatureEntranceShowSetting();

    public final boolean show() {
        if (SettingsManager.INSTANCE.getIntValue(LiveMatureEntranceShowSetting.class) != 0) {
            return true;
        }
        return false;
    }
}