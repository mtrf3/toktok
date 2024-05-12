package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_cache_last_select_definition")
/* loaded from: classes6.dex */
public final class EnableCacheLastSelectDefinitionSetting {

    @Group("auto_tips_experiment_group")
    public static final int AUTO_TIPS = 0;

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = -1;

    @Group("experiment_group")
    public static final int ENABLE = 1;
    public static final EnableCacheLastSelectDefinitionSetting INSTANCE = new EnableCacheLastSelectDefinitionSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(EnableCacheLastSelectDefinitionSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isEnableAutoTips() {
        if (SettingsManager.INSTANCE.getIntValue(EnableCacheLastSelectDefinitionSetting.class) == 0) {
            return true;
        }
        return false;
    }
}
