package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multiguest_prop_downgrade_score")
/* loaded from: classes6.dex */
public final class MultiGuestPropDowngradeDeviceScoreSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 5.0f;
    public static final MultiGuestPropDowngradeDeviceScoreSetting INSTANCE = new MultiGuestPropDowngradeDeviceScoreSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(MultiGuestPropDowngradeDeviceScoreSetting.class);
    }
}
