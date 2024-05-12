package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_shared_bg_guest_enabled")
/* loaded from: classes6.dex */
public final class LinkMicSharedBgGuestSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LinkMicSharedBgGuestSetting INSTANCE = new LinkMicSharedBgGuestSetting();

    public static final boolean isEnable() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicSharedBgGuestSetting.class);
    }
}
