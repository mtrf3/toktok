package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("show_audience_definition_selection")
/* loaded from: classes6.dex */
public final class ShowAudienceDefinitionSelectionSetting {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int ENABLE = 1;
    public static final ShowAudienceDefinitionSelectionSetting INSTANCE = new ShowAudienceDefinitionSelectionSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(ShowAudienceDefinitionSelectionSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
