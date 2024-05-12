package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_lynx_debug_badge")
/* loaded from: classes6.dex */
public final class EnableLynxDebugBadgeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableLynxDebugBadgeSetting INSTANCE = new EnableLynxDebugBadgeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableLynxDebugBadgeSetting.class);
    }
}
