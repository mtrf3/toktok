package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_e_commerce_rank_enabled")
/* loaded from: classes6.dex */
public final class ECRankSupportSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final ECRankSupportSetting INSTANCE = new ECRankSupportSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ECRankSupportSetting.class);
    }
}
