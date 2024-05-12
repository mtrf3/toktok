package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_gift_panel")
/* loaded from: classes6.dex */
public final class UserLevelGiftPanelEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final UserLevelGiftPanelEnableSetting INSTANCE = new UserLevelGiftPanelEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelGiftPanelEnableSetting.class);
    }
}
