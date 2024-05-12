package com.bytedance.android.livesdk.livesetting.performance.degrade;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_resource_delay")
/* loaded from: classes6.dex */
public final class LiveGiftResourceDelay {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = false;

    @Group("experiment_group")
    public static final boolean ENABLE = true;
    public static final LiveGiftResourceDelay INSTANCE = new LiveGiftResourceDelay();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveGiftResourceDelay.class)) {
            return true;
        }
        return false;
    }
}
