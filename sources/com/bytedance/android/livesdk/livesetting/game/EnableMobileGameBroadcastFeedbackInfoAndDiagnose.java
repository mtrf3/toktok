package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_mobile_game_feedback_info_and_diagnose")
/* loaded from: classes6.dex */
public final class EnableMobileGameBroadcastFeedbackInfoAndDiagnose {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnableMobileGameBroadcastFeedbackInfoAndDiagnose INSTANCE = new EnableMobileGameBroadcastFeedbackInfoAndDiagnose();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(EnableMobileGameBroadcastFeedbackInfoAndDiagnose.class) == 1) {
            return true;
        }
        return false;
    }
}
