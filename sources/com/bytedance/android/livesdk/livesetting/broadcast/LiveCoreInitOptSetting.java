package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_core_init_opt")
/* loaded from: classes6.dex */
public final class LiveCoreInitOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoreInitOptSetting INSTANCE = new LiveCoreInitOptSetting();

    public final int liveCoreInitPriority() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoreInitOptSetting.class);
    }
}
