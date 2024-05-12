package com.bytedance.android.livesdk.game.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_ocr_to_client_cost_calculate")
/* loaded from: classes6.dex */
public final class EnableCalculateOcrToClientDurationSwitcher {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnableCalculateOcrToClientDurationSwitcher INSTANCE = new EnableCalculateOcrToClientDurationSwitcher();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(EnableCalculateOcrToClientDurationSwitcher.class) == 1) {
            return true;
        }
        return false;
    }
}
