package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("full_screen_survey_style_setting")
/* loaded from: classes6.dex */
public final class FullScreenSurveyStyleSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final FullScreenSurveyStyleSetting INSTANCE = new FullScreenSurveyStyleSetting();

    @Group("v1")
    public static final int LIVE_STREAM = 2;

    public final boolean useLiveStreaming() {
        if (!SurveyStyleSetting.INSTANCE.isFullScreenStyle() || SettingsManager.INSTANCE.getIntValue(FullScreenSurveyStyleSetting.class) != 2) {
            return false;
        }
        return true;
    }
}
