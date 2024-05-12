package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_multi_guest_show_beauty_on_low_score_device")
/* loaded from: classes6.dex */
public final class LiveMultiGuestShowBeautyOnLowScoreDeviceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMultiGuestShowBeautyOnLowScoreDeviceSetting INSTANCE = new LiveMultiGuestShowBeautyOnLowScoreDeviceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMultiGuestShowBeautyOnLowScoreDeviceSetting.class);
    }

    public final boolean enableBeautyOnLowScoreDevice() {
        return getValue();
    }
}
