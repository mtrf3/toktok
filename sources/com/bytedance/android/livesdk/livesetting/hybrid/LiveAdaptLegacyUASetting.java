package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_adapt_legacy_ua_android")
/* loaded from: classes6.dex */
public final class LiveAdaptLegacyUASetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveAdaptLegacyUASetting INSTANCE = new LiveAdaptLegacyUASetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAdaptLegacyUASetting.class);
    }
}
