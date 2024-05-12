package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_message_interval_setting")
/* loaded from: classes6.dex */
public final class LiveCenterMessageIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;
    public static final LiveCenterMessageIntervalSetting INSTANCE = new LiveCenterMessageIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCenterMessageIntervalSetting.class);
    }
}
