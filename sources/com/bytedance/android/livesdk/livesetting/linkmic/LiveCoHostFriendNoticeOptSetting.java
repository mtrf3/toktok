package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_friend_notice_optimize")
/* loaded from: classes6.dex */
public final class LiveCoHostFriendNoticeOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoHostFriendNoticeOptSetting INSTANCE = new LiveCoHostFriendNoticeOptSetting();

    @Group("both_the_strategies")
    public static final int STRATEGY_BOTH = 3;

    @Group("execute the strategy")
    public static final int STRATEGY_EXECUTION = 2;

    @Group("iterate the strategy")
    public static final int STRATEGY_ITERATION = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostFriendNoticeOptSetting.class);
    }
}
