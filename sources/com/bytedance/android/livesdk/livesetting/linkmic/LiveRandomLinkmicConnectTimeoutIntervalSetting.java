package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_random_linkmic_connect_timeout_interval")
/* loaded from: classes6.dex */
public final class LiveRandomLinkmicConnectTimeoutIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;
    public static final LiveRandomLinkmicConnectTimeoutIntervalSetting INSTANCE = new LiveRandomLinkmicConnectTimeoutIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRandomLinkmicConnectTimeoutIntervalSetting.class);
    }
}
