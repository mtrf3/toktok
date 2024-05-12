package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_mix_stream_independent_android_switch")
/* loaded from: classes6.dex */
public final class LinkMicMixStreamIndependentAndroidSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicMixStreamIndependentAndroidSwitchSetting INSTANCE = new LinkMicMixStreamIndependentAndroidSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMixStreamIndependentAndroidSwitchSetting.class);
    }
}
