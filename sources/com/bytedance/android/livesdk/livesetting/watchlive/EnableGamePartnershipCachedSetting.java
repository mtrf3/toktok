package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "enable_game_partnership_cached")
/* loaded from: classes6.dex */
public final class EnableGamePartnershipCachedSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableGamePartnershipCachedSetting INSTANCE = new EnableGamePartnershipCachedSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableGamePartnershipCachedSetting.class);
    }
}
