package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("audience_ping_interval")
/* loaded from: classes6.dex */
public final class AudiencePingIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 60;
    public static final AudiencePingIntervalSetting INSTANCE = new AudiencePingIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(AudiencePingIntervalSetting.class);
    }
}
