package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_intercept_invalid_qa")
/* loaded from: classes6.dex */
public final class LiveCheckQuestionTooShortSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCheckQuestionTooShortSetting INSTANCE = new LiveCheckQuestionTooShortSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveCheckQuestionTooShortSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
