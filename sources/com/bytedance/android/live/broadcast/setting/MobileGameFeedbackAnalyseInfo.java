package com.bytedance.android.live.broadcast.setting;

import X.C221108m2;
import X.C47011sv;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("mobile_game_feedback_analyse_info")
/* loaded from: classes.dex */
public final class MobileGameFeedbackAnalyseInfo {
    public static final MobileGameFeedbackAnalyseInfo INSTANCE = new MobileGameFeedbackAnalyseInfo();

    @Group(isDefault = true, value = "default group")
    public static final MobileGameBroadcastFeedbackConfig DEFAULT = new MobileGameBroadcastFeedbackConfig(0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 0, 0.0f, 0, 0, 0, 0.0f, 0, 0, 0, 65535, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C47011sv.LJLIL);
    public static final int $stable = 8;

    private final MobileGameBroadcastFeedbackConfig getSettingValue() {
        return (MobileGameBroadcastFeedbackConfig) settingValue$delegate.getValue();
    }

    public final MobileGameBroadcastFeedbackConfig getValue() {
        return getSettingValue();
    }
}
