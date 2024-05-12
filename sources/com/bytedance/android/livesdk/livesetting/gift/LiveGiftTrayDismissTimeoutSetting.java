package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_tray_dismiss_timeout")
/* loaded from: classes6.dex */
public final class LiveGiftTrayDismissTimeoutSetting {
    public static final LiveGiftTrayDismissTimeoutSetting INSTANCE = new LiveGiftTrayDismissTimeoutSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 600;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftTrayDismissTimeoutSetting.class);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
