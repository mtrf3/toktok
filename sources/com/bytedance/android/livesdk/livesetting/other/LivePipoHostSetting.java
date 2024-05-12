package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_pipo_host")
/* loaded from: classes6.dex */
public final class LivePipoHostSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LivePipoHostSetting INSTANCE = new LivePipoHostSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePipoHostSetting.class);
    }
}
