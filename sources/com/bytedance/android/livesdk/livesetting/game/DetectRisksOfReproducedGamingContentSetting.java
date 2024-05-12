package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_detect_risks_of_reproduced_gaming_content")
/* loaded from: classes6.dex */
public final class DetectRisksOfReproducedGamingContentSetting {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int ENABLE = 1;
    public static final DetectRisksOfReproducedGamingContentSetting INSTANCE = new DetectRisksOfReproducedGamingContentSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(DetectRisksOfReproducedGamingContentSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
