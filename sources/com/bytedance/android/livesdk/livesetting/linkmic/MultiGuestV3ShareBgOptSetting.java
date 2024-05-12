package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_opt_share_bg")
/* loaded from: classes6.dex */
public final class MultiGuestV3ShareBgOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestV3ShareBgOptSetting INSTANCE = new MultiGuestV3ShareBgOptSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(MultiGuestV3ShareBgOptSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
