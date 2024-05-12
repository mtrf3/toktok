package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_panel_manual_sort")
/* loaded from: classes6.dex */
public final class LiveGiftPanelManualSortSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftPanelManualSortSetting INSTANCE = new LiveGiftPanelManualSortSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftPanelManualSortSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }
}
