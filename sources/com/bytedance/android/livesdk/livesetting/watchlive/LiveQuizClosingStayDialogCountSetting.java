package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_quiz_closing_stay_dialog_count")
/* loaded from: classes6.dex */
public final class LiveQuizClosingStayDialogCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveQuizClosingStayDialogCountSetting INSTANCE = new LiveQuizClosingStayDialogCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveQuizClosingStayDialogCountSetting.class);
    }
}
