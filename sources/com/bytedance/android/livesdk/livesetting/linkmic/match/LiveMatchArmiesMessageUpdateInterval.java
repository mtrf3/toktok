package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("match_armies_message_update_interval")
/* loaded from: classes6.dex */
public final class LiveMatchArmiesMessageUpdateInterval {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 400;
    public static final LiveMatchArmiesMessageUpdateInterval INSTANCE = new LiveMatchArmiesMessageUpdateInterval();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveMatchArmiesMessageUpdateInterval.class);
    }
}
