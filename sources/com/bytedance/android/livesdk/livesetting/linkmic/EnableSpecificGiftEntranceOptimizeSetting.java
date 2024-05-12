package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_specific_gift_entrance_optimize")
/* loaded from: classes11.dex */
public final class EnableSpecificGiftEntranceOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableSpecificGiftEntranceOptimizeSetting INSTANCE = new EnableSpecificGiftEntranceOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableSpecificGiftEntranceOptimizeSetting.class);
    }
}
