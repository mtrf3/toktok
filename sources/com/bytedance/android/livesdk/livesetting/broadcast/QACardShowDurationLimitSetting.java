package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("qa_card_show_duration_limit")
/* loaded from: classes6.dex */
public final class QACardShowDurationLimitSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final QACardShowDurationLimitSetting INSTANCE = new QACardShowDurationLimitSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(QACardShowDurationLimitSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
