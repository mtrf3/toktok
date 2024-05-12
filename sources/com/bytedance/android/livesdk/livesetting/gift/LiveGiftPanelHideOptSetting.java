package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_panel_hide_optimize")
/* loaded from: classes6.dex */
public final class LiveGiftPanelHideOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftPanelHideOptSetting INSTANCE = new LiveGiftPanelHideOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftPanelHideOptSetting.class);
    }
}
