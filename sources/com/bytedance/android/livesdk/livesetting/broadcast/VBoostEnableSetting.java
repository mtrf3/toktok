package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_vboost_enable")
/* loaded from: classes6.dex */
public final class VBoostEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final VBoostEnableSetting INSTANCE = new VBoostEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(VBoostEnableSetting.class);
    }
}
