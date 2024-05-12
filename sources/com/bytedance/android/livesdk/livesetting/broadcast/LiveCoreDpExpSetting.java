package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_core_params_imigrate")
/* loaded from: classes6.dex */
public final class LiveCoreDpExpSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveCoreDpExpSetting INSTANCE = new LiveCoreDpExpSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCoreDpExpSetting.class);
    }
}
