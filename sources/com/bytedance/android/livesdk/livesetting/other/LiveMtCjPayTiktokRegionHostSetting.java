package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mt_cj_pay_tiktok_region_host")
/* loaded from: classes6.dex */
public final class LiveMtCjPayTiktokRegionHostSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveMtCjPayTiktokRegionHostSetting INSTANCE = new LiveMtCjPayTiktokRegionHostSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMtCjPayTiktokRegionHostSetting.class);
    }
}
