package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_tray_multi_host_opt_switch")
/* loaded from: classes11.dex */
public final class MultiHostGiftTrayOptForHostSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiHostGiftTrayOptForHostSetting INSTANCE = new MultiHostGiftTrayOptForHostSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiHostGiftTrayOptForHostSetting.class);
    }
}
