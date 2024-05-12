package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("host_side_multi_guest_switch")
/* loaded from: classes6.dex */
public final class MultiGuestHostSideSwitchSetting {

    @Group(isDefault = true, value = "close ui in anchorListDialog")
    public static final int DEFAULT = 0;

    @Group("close ui in setting dialog")
    public static final int ENABLE = 1;
    public static final MultiGuestHostSideSwitchSetting INSTANCE = new MultiGuestHostSideSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestHostSideSwitchSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
