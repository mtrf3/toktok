package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "travel_mask_fetch_timeout_enable")
/* loaded from: classes6.dex */
public final class TravelMaskFetchTimeoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TravelMaskFetchTimeoutSetting INSTANCE = new TravelMaskFetchTimeoutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(TravelMaskFetchTimeoutSetting.class);
    }
}
