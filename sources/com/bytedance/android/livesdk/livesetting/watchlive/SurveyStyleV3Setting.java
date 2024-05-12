package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "survey_style_v3")
/* loaded from: classes11.dex */
public final class SurveyStyleV3Setting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final SurveyStyleV3Setting INSTANCE = new SurveyStyleV3Setting();

    @Group("v2")
    public static final int V2 = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(SurveyStyleV3Setting.class);
    }

    public final boolean hasSecondSurvey() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
