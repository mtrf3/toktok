package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multiguest_play_ad_switch")
/* loaded from: classes11.dex */
public final class MultiGuestPlayAdSwitch {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestPlayAdSwitch INSTANCE = new MultiGuestPlayAdSwitch();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestPlayAdSwitch.class);
    }
}
