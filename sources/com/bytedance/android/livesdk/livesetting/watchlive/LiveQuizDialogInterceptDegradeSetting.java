package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_quiz_dialog_intercept_degrade")
/* loaded from: classes6.dex */
public final class LiveQuizDialogInterceptDegradeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveQuizDialogInterceptDegradeSetting INSTANCE = new LiveQuizDialogInterceptDegradeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveQuizDialogInterceptDegradeSetting.class);
    }
}
