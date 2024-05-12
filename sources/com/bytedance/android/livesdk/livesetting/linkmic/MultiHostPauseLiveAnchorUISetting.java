package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_pause_live_anchor_ui_enable")
/* loaded from: classes6.dex */
public final class MultiHostPauseLiveAnchorUISetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiHostPauseLiveAnchorUISetting INSTANCE = new MultiHostPauseLiveAnchorUISetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiHostPauseLiveAnchorUISetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
