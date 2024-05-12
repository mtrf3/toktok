package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_linkmic_enable_audience_disconnect_conclusion_panel")
/* loaded from: classes14.dex */
public final class LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting INSTANCE = new LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting();

    public final boolean isEnabled() {
        if (SettingsManager.INSTANCE.getIntValue(LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
