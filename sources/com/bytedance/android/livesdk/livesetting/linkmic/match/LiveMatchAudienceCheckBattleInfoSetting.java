package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("audience_battleinfo_delay_policy")
/* loaded from: classes14.dex */
public final class LiveMatchAudienceCheckBattleInfoSetting {
    public static final LiveMatchAudienceCheckBattleInfoSetting INSTANCE = new LiveMatchAudienceCheckBattleInfoSetting();

    @Group(isDefault = true, value = "default group")
    public static final CheckBattleInfoConfig DEFAULT = new CheckBattleInfoConfig(false, 0.0f, 0, 0, 0, 0, 63, null);

    private final CheckBattleInfoConfig getConfig() {
        CheckBattleInfoConfig checkBattleInfoConfig = (CheckBattleInfoConfig) SettingsManager.INSTANCE.getValueSafely(LiveMatchAudienceCheckBattleInfoSetting.class);
        if (checkBattleInfoConfig == null) {
            return DEFAULT;
        }
        return checkBattleInfoConfig;
    }

    public final int getEnterRetryCount() {
        return getConfig().retry_count_when_enter;
    }

    public final int getEnterRetryDuration() {
        return getConfig().retry_duration_when_enter;
    }

    public final int getFinishRetryCount() {
        return getConfig().retry_count_when_finish;
    }

    public final int getFinishRetryDuration() {
        return getConfig().retry_duration_when_finish;
    }

    public final boolean getSettlingCost() {
        return getConfig().avg_settling_cost;
    }

    public final float getSettlingMessageCost() {
        return getConfig().avg_settling_message_cost;
    }
}
