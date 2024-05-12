package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_tracker_switch")
/* loaded from: classes6.dex */
public final class LiveMessageTrackerSwitchSetting {
    public static final LiveMessageTrackerSwitchSetting INSTANCE = new LiveMessageTrackerSwitchSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveMessageTrackerSwitchSetting.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
