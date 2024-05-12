package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_timeout_strategy_group")
/* loaded from: classes11.dex */
public final class LiveCoHosTimeoutStrategyGroup {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoHosTimeoutStrategyGroup INSTANCE = new LiveCoHosTimeoutStrategyGroup();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHosTimeoutStrategyGroup.class);
    }

    public final boolean isDefaultGroup() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
