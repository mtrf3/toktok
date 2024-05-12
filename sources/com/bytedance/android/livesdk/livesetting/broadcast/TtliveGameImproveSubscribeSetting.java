package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_game_improve_subscribe")
/* loaded from: classes6.dex */
public final class TtliveGameImproveSubscribeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TtliveGameImproveSubscribeSetting INSTANCE = new TtliveGameImproveSubscribeSetting();

    public final boolean shouldImproveSubscribe() {
        if (SettingsManager.INSTANCE.getIntValue(TtliveGameImproveSubscribeSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
