package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_use_frontier")
/* loaded from: classes6.dex */
public final class LiveMessageFrontierSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMessageFrontierSetting INSTANCE = new LiveMessageFrontierSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMessageFrontierSetting.class);
    }
}
