package com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("disable_sub_spotlight")
/* loaded from: classes6.dex */
public final class SpotlightFeatureDisable {
    public static final int $stable = 0;

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SpotlightFeatureDisable INSTANCE = new SpotlightFeatureDisable();

    public final boolean isDisable() {
        return SettingsManager.INSTANCE.getBooleanValue(SpotlightFeatureDisable.class);
    }
}
