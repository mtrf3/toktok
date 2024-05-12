package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("rtc_ab_label")
/* loaded from: classes11.dex */
public final class RtcAbLabelSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final RtcAbLabelSetting INSTANCE = new RtcAbLabelSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(RtcAbLabelSetting.class);
    }
}
