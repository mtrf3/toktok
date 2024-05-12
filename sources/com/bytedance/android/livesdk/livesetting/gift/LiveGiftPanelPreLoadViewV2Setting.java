package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_panel_preload_view_v2")
/* loaded from: classes6.dex */
public final class LiveGiftPanelPreLoadViewV2Setting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftPanelPreLoadViewV2Setting INSTANCE = new LiveGiftPanelPreLoadViewV2Setting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftPanelPreLoadViewV2Setting.class);
    }
}
