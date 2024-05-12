package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_guest_mic_effect")
/* loaded from: classes6.dex */
public final class LinkMicGuestMicEffectSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 100;
    public static final LinkMicGuestMicEffectSetting INSTANCE = new LinkMicGuestMicEffectSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicGuestMicEffectSetting.class);
    }
}
