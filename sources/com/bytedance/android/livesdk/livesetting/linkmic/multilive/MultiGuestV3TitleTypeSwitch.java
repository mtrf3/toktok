package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_title_type_switch")
/* loaded from: classes6.dex */
public final class MultiGuestV3TitleTypeSwitch {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestV3TitleTypeSwitch INSTANCE = new MultiGuestV3TitleTypeSwitch();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestV3TitleTypeSwitch.class);
    }
}
