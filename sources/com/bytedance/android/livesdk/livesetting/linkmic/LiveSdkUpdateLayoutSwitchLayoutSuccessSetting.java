package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_update_layout_switch_layout_success")
/* loaded from: classes11.dex */
public final class LiveSdkUpdateLayoutSwitchLayoutSuccessSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSdkUpdateLayoutSwitchLayoutSuccessSetting INSTANCE = new LiveSdkUpdateLayoutSwitchLayoutSuccessSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkUpdateLayoutSwitchLayoutSuccessSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
