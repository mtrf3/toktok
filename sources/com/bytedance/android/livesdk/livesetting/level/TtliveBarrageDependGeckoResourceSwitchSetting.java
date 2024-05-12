package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_barrage_depend_gecko_resource_switch")
/* loaded from: classes6.dex */
public final class TtliveBarrageDependGeckoResourceSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TtliveBarrageDependGeckoResourceSwitchSetting INSTANCE = new TtliveBarrageDependGeckoResourceSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(TtliveBarrageDependGeckoResourceSwitchSetting.class);
    }
}
