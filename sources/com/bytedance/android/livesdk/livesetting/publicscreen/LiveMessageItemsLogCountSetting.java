package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_items_log_count")
/* loaded from: classes6.dex */
public final class LiveMessageItemsLogCountSetting {
    public static final LiveMessageItemsLogCountSetting INSTANCE = new LiveMessageItemsLogCountSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 100;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMessageItemsLogCountSetting.class);
    }
}
