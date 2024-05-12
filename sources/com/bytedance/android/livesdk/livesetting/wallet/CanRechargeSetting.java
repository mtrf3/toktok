package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("can_recharge")
/* loaded from: classes6.dex */
public final class CanRechargeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final CanRechargeSetting INSTANCE = new CanRechargeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CanRechargeSetting.class);
    }
}
