package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_memory_opt")
/* loaded from: classes6.dex */
public final class LiveMemoryOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMemoryOptSetting INSTANCE = new LiveMemoryOptSetting();

    public final boolean enableMemoryOpt() {
        if (SettingsManager.INSTANCE.getIntValue(LiveMemoryOptSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
