package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_host_pre_joinchannel_setting")
/* loaded from: classes14.dex */
public final class MultiHostPreJoinChannelSetting {
    public static final MultiHostPreJoinChannelSetting INSTANCE = new MultiHostPreJoinChannelSetting();

    @Group(isDefault = true, value = "default group")
    public static final MultiHostPreJoinChannelConf DEFAULT = new MultiHostPreJoinChannelConf(false, false, false, 7, null);

    public final MultiHostPreJoinChannelConf getValue() {
        MultiHostPreJoinChannelConf multiHostPreJoinChannelConf = (MultiHostPreJoinChannelConf) SettingsManager.INSTANCE.getValueSafely(MultiHostPreJoinChannelSetting.class);
        if (multiHostPreJoinChannelConf == null) {
            return DEFAULT;
        }
        return multiHostPreJoinChannelConf;
    }
}
