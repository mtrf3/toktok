package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mt_tikcast_switcher_param")
/* loaded from: classes6.dex */
public final class LiveMtTikcastSwitcherParamSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMtTikcastSwitcherParamSetting INSTANCE = new LiveMtTikcastSwitcherParamSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMtTikcastSwitcherParamSetting.class);
    }
}
