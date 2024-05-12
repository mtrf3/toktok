package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_enable_rxbus_wrapper")
/* loaded from: classes6.dex */
public final class EnableRxBusWrapperSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnableRxBusWrapperSetting INSTANCE = new EnableRxBusWrapperSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(EnableRxBusWrapperSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
