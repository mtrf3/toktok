package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_linkmic_fps")
/* loaded from: classes6.dex */
public final class MultiGuestV3FpsSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestV3FpsSetting INSTANCE = new MultiGuestV3FpsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestV3FpsSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }
}
