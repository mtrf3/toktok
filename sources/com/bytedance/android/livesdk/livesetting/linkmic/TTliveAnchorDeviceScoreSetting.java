package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_anchor_device_score")
/* loaded from: classes6.dex */
public final class TTliveAnchorDeviceScoreSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = -1.0f;
    public static final TTliveAnchorDeviceScoreSetting INSTANCE = new TTliveAnchorDeviceScoreSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(TTliveAnchorDeviceScoreSetting.class);
    }
}
