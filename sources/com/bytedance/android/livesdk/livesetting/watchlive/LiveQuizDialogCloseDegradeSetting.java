package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_quiz_dialog_close_degrade")
/* loaded from: classes6.dex */
public final class LiveQuizDialogCloseDegradeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveQuizDialogCloseDegradeSetting INSTANCE = new LiveQuizDialogCloseDegradeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveQuizDialogCloseDegradeSetting.class);
    }
}
