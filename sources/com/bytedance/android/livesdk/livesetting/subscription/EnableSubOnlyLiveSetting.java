package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_subscribers_only_live")
/* loaded from: classes6.dex */
public final class EnableSubOnlyLiveSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableSubOnlyLiveSetting INSTANCE = new EnableSubOnlyLiveSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableSubOnlyLiveSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
