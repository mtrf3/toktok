package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_user_add_aboutme")
/* loaded from: classes6.dex */
public final class LiveSubsPrivilegeDetailAboutMeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSubsPrivilegeDetailAboutMeSetting INSTANCE = new LiveSubsPrivilegeDetailAboutMeSetting();

    public final int getValue() {
        Integer num = (Integer) SettingsManager.INSTANCE.getValueSafely(LiveSubsPrivilegeDetailAboutMeSetting.class);
        if (num != null) {
            return num.intValue();
        }
        return DEFAULT;
    }

    public final boolean enableAboutMe() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean enableNavigation() {
        if (getValue() == DEFAULT) {
            return true;
        }
        return false;
    }
}
