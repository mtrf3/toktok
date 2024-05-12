package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("personal_homepage_return_live")
/* loaded from: classes6.dex */
public final class PersonalHomepageReturnLive {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final PersonalHomepageReturnLive INSTANCE = new PersonalHomepageReturnLive();

    @Group("V1")
    public static final int V1 = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(PersonalHomepageReturnLive.class);
    }
}
