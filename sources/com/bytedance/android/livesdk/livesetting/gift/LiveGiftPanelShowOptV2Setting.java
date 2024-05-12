package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_panel_show_optimize_v2")
/* loaded from: classes6.dex */
public final class LiveGiftPanelShowOptV2Setting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftPanelShowOptV2Setting INSTANCE = new LiveGiftPanelShowOptV2Setting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftPanelShowOptV2Setting.class);
    }
}
