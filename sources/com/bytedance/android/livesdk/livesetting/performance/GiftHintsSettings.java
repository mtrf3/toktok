package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_hints_switch")
/* loaded from: classes6.dex */
public final class GiftHintsSettings {

    @Group(isDefault = true, value = "Default value (Off)")
    public static final boolean DEFAULT = false;
    public static final GiftHintsSettings INSTANCE = new GiftHintsSettings();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(GiftHintsSettings.class);
    }
}
