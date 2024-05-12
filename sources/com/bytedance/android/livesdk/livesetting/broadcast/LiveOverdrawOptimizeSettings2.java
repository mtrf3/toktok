package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("overdraw_optimization2")
/* loaded from: classes6.dex */
public final class LiveOverdrawOptimizeSettings2 {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveOverdrawOptimizeSettings2 INSTANCE = new LiveOverdrawOptimizeSettings2();

    @Group("optimize")
    public static final int SETTING1 = 1;

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveOverdrawOptimizeSettings2.class) == 1) {
            return true;
        }
        return false;
    }
}
