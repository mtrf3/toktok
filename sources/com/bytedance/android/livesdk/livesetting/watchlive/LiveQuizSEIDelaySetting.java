package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_quiz_default_delay_time")
/* loaded from: classes6.dex */
public final class LiveQuizSEIDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 0;
    public static final LiveQuizSEIDelaySetting INSTANCE = new LiveQuizSEIDelaySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveQuizSEIDelaySetting.class);
    }
}
