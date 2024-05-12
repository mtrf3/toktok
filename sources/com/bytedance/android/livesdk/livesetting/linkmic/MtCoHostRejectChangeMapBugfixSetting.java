package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_reject_change_map_bugfix_enable")
/* loaded from: classes6.dex */
public final class MtCoHostRejectChangeMapBugfixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MtCoHostRejectChangeMapBugfixSetting INSTANCE = new MtCoHostRejectChangeMapBugfixSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostRejectChangeMapBugfixSetting.class);
    }

    public static final boolean isEnable() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }
}
