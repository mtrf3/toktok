package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_broadcast_game_count_down_num")
/* loaded from: classes6.dex */
public final class BroadcastGameCountDownNum {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 90;
    public static final BroadcastGameCountDownNum INSTANCE = new BroadcastGameCountDownNum();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(BroadcastGameCountDownNum.class);
    }

    public final boolean isNeedCountDown() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }
}
