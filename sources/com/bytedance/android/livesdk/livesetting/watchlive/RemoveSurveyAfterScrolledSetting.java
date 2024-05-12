package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "remove_survey_after_scrolled")
/* loaded from: classes6.dex */
public final class RemoveSurveyAfterScrolledSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final RemoveSurveyAfterScrolledSetting INSTANCE = new RemoveSurveyAfterScrolledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(RemoveSurveyAfterScrolledSetting.class);
    }
}
