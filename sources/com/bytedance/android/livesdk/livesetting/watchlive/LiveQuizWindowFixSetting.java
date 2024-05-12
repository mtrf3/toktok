package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_quiz_window_fix_setting")
/* loaded from: classes6.dex */
public final class LiveQuizWindowFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveQuizWindowFixSetting INSTANCE = new LiveQuizWindowFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveQuizWindowFixSetting.class);
    }
}
