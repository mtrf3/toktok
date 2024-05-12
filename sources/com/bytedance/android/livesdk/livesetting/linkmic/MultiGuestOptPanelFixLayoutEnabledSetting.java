package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_opt_panel_fix_layout")
/* loaded from: classes11.dex */
public final class MultiGuestOptPanelFixLayoutEnabledSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestOptPanelFixLayoutEnabledSetting INSTANCE = new MultiGuestOptPanelFixLayoutEnabledSetting();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getIntValue(MultiGuestOptPanelFixLayoutEnabledSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
