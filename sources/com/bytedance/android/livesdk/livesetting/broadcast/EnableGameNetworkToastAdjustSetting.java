package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "enable_game_network_toast_adjust")
/* loaded from: classes6.dex */
public final class EnableGameNetworkToastAdjustSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnableGameNetworkToastAdjustSetting INSTANCE = new EnableGameNetworkToastAdjustSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(EnableGameNetworkToastAdjustSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
