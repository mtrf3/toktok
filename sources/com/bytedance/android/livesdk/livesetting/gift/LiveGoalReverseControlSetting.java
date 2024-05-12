package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_goal_reverse")
/* loaded from: classes6.dex */
public final class LiveGoalReverseControlSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGoalReverseControlSetting INSTANCE = new LiveGoalReverseControlSetting();

    public final boolean enableReverse() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGoalReverseControlSetting.class);
    }
}
