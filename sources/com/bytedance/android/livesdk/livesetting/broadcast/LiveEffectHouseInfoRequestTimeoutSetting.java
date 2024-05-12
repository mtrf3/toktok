package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_report_delay_time")
/* loaded from: classes6.dex */
public final class LiveEffectHouseInfoRequestTimeoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 1.5f;
    public static final LiveEffectHouseInfoRequestTimeoutSetting INSTANCE = new LiveEffectHouseInfoRequestTimeoutSetting();
    public static final float settingValue = SettingsManager.INSTANCE.getFloatValue(LiveEffectHouseInfoRequestTimeoutSetting.class);

    public final long getTimeoutMs() {
        return settingValue * 1000;
    }
}
