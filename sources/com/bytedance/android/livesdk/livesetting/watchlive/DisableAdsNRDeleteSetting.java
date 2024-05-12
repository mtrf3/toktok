package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("disable_ads_nr_delete")
/* loaded from: classes6.dex */
public final class DisableAdsNRDeleteSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("v1")
    public static final int ENABLE_VALUE = 1;
    public static final DisableAdsNRDeleteSetting INSTANCE = new DisableAdsNRDeleteSetting();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getIntValue(DisableAdsNRDeleteSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
