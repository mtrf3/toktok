package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("two_match_progress_option")
/* loaded from: classes11.dex */
public final class TwoMatchProgressOptionalSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TwoMatchProgressOptionalSetting INSTANCE = new TwoMatchProgressOptionalSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(TwoMatchProgressOptionalSetting.class);
    }
}
