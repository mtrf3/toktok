package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_panel_preload_view")
/* loaded from: classes6.dex */
public final class LiveGiftPanelPreLoadViewSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveGiftPanelPreLoadViewSetting INSTANCE = new LiveGiftPanelPreLoadViewSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftPanelPreLoadViewSetting.class);
    }
}
