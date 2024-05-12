package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("rtc_manager_fix_thread_switch")
/* loaded from: classes6.dex */
public final class RtcManagerFixThreadSwitch {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final RtcManagerFixThreadSwitch INSTANCE = new RtcManagerFixThreadSwitch();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(RtcManagerFixThreadSwitch.class);
    }
}
