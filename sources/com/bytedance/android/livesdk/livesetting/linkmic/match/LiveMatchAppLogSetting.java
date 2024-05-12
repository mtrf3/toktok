package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("cohost_match_monitor_add_to_tea_enable")
/* loaded from: classes6.dex */
public final class LiveMatchAppLogSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMatchAppLogSetting INSTANCE = new LiveMatchAppLogSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchAppLogSetting.class);
    }
}
