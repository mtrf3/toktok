package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_items_alog_enabled")
/* loaded from: classes6.dex */
public final class LiveMessageItemsAlogEnabledSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMessageItemsAlogEnabledSetting INSTANCE = new LiveMessageItemsAlogEnabledSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMessageItemsAlogEnabledSetting.class);
    }
}
