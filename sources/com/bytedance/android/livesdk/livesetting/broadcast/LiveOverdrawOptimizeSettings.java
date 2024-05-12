package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("overdraw_optimization")
/* loaded from: classes6.dex */
public final class LiveOverdrawOptimizeSettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveOverdrawOptimizeSettings INSTANCE = new LiveOverdrawOptimizeSettings();

    @Group("optimize")
    public static final int SETTING1 = 1;

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveOverdrawOptimizeSettings.class) == 1) {
            return true;
        }
        return false;
    }
}
