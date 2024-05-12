package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_link_state_skip_enable")
/* loaded from: classes6.dex */
public final class MultiHostPauseLiveAnchorSkipEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiHostPauseLiveAnchorSkipEnableSetting INSTANCE = new MultiHostPauseLiveAnchorSkipEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiHostPauseLiveAnchorSkipEnableSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
