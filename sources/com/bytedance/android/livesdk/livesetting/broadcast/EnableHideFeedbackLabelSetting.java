package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "enable_hide_feedback_label")
/* loaded from: classes6.dex */
public final class EnableHideFeedbackLabelSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnableHideFeedbackLabelSetting INSTANCE = new EnableHideFeedbackLabelSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnableHideFeedbackLabelSetting.class);
    }

    public final boolean enable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
