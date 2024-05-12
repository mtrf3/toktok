package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_pk_connect_timeout_interval")
/* loaded from: classes11.dex */
public final class LivePkConnectTimeoutIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 20;
    public static final LivePkConnectTimeoutIntervalSetting INSTANCE = new LivePkConnectTimeoutIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePkConnectTimeoutIntervalSetting.class);
    }
}
