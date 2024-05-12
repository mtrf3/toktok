package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_anchor_device_rating_high")
/* loaded from: classes6.dex */
public final class TTliveAnchorDeviceRatingHighSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 7.92f;
    public static final TTliveAnchorDeviceRatingHighSetting INSTANCE = new TTliveAnchorDeviceRatingHighSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(TTliveAnchorDeviceRatingHighSetting.class);
    }
}
