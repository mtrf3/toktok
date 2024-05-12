package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("go_live_memory_leak_opt")
/* loaded from: classes6.dex */
public final class GoLiveMemoryLeakOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final GoLiveMemoryLeakOptSetting INSTANCE = new GoLiveMemoryLeakOptSetting();

    public final boolean enable() {
        Integer num = (Integer) SettingsManager.INSTANCE.getValueSafely(GoLiveMemoryLeakOptSetting.class);
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
