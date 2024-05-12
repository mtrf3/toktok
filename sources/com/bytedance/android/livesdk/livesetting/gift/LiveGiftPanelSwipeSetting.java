package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_gift_panel_swipe")
/* loaded from: classes6.dex */
public final class LiveGiftPanelSwipeSetting {

    @Group(isDefault = true, value = "Disable Swipe")
    public static final boolean DEFAULT = false;

    @Group("Enable Swipe")
    public static final boolean ENABLE = true;
    public static final LiveGiftPanelSwipeSetting INSTANCE = new LiveGiftPanelSwipeSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftPanelSwipeSetting.class);
    }
}
