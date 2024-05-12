package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_full_link_monitor_opt")
/* loaded from: classes11.dex */
public final class MtCoHostFullLinkMonitorSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MtCoHostFullLinkMonitorSetting INSTANCE = new MtCoHostFullLinkMonitorSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostFullLinkMonitorSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
