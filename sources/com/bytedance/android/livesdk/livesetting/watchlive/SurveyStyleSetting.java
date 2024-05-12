package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("survey_style_setting")
/* loaded from: classes6.dex */
public final class SurveyStyleSetting {

    @Group(isDefault = true, value = "v1")
    public static final int DEFAULT = 2;

    @Group("default group")
    public static final int HALF_SCREEN = 1;
    public static final SurveyStyleSetting INSTANCE = new SurveyStyleSetting();

    public final boolean isFullScreenStyle() {
        if (SettingsManager.INSTANCE.getIntValue(SurveyStyleSetting.class) == 2) {
            return true;
        }
        return false;
    }
}
