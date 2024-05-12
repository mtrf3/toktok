package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_pause_live_anchor_enable")
/* loaded from: classes11.dex */
public final class MultiHostPauseLiveAnchorEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiHostPauseLiveAnchorEnableSetting INSTANCE = new MultiHostPauseLiveAnchorEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiHostPauseLiveAnchorEnableSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
