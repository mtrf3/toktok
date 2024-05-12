package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_co_host_create_channel_retry")
/* loaded from: classes6.dex */
public final class LinkmicCoHostCreateChannelRetrySetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 5;
    public static final LinkmicCoHostCreateChannelRetrySetting INSTANCE = new LinkmicCoHostCreateChannelRetrySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LinkmicCoHostCreateChannelRetrySetting.class);
    }
}
