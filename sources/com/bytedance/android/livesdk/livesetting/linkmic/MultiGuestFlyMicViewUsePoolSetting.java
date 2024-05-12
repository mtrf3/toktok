package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_fly_mic_view_use_pool")
/* loaded from: classes14.dex */
public final class MultiGuestFlyMicViewUsePoolSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestFlyMicViewUsePoolSetting INSTANCE = new MultiGuestFlyMicViewUsePoolSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestFlyMicViewUsePoolSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
