package com.bytedance.android.livesdk.broadcast.interaction.toolbar.behavior.experiment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_offline_sub_only_live_entrance")
/* loaded from: classes6.dex */
public final class LiveOfflineSubOnlyLiveEntranceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveOfflineSubOnlyLiveEntranceSetting INSTANCE = new LiveOfflineSubOnlyLiveEntranceSetting();

    @Group("remove old entrance")
    public static final int SETTING1 = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveOfflineSubOnlyLiveEntranceSetting.class);
    }

    public final boolean enable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
