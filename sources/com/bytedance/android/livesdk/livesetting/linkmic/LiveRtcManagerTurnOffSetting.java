package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_rtc_manager_turnoffengine_isrtclocked")
/* loaded from: classes6.dex */
public final class LiveRtcManagerTurnOffSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRtcManagerTurnOffSetting INSTANCE = new LiveRtcManagerTurnOffSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRtcManagerTurnOffSetting.class);
    }
}
