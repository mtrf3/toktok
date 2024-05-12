package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_host_pre_join_fix_channel")
/* loaded from: classes11.dex */
public final class MultiHostPreJoinFixChannelSetting {
    public static final MultiHostPreJoinFixChannelSetting INSTANCE = new MultiHostPreJoinFixChannelSetting();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiHostPreJoinFixChannelSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
