package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_charge_panel_add_lackcoincount")
/* loaded from: classes6.dex */
public final class LiveChargePanelPositionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveChargePanelPositionSetting INSTANCE = new LiveChargePanelPositionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveChargePanelPositionSetting.class);
    }
}
