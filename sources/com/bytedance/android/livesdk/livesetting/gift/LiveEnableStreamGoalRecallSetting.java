package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_stream_goal_recall")
/* loaded from: classes6.dex */
public final class LiveEnableStreamGoalRecallSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveEnableStreamGoalRecallSetting INSTANCE = new LiveEnableStreamGoalRecallSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableStreamGoalRecallSetting.class);
    }
}
