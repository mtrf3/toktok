package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("open_live_icon_reset_switch")
/* loaded from: classes6.dex */
public final class OpenLiveIconResetSwitch {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final OpenLiveIconResetSwitch INSTANCE = new OpenLiveIconResetSwitch();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(OpenLiveIconResetSwitch.class);
    }
}
