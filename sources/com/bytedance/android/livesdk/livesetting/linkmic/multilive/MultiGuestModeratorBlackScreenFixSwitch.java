package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_moderator_black_screen_fix")
/* loaded from: classes6.dex */
public final class MultiGuestModeratorBlackScreenFixSwitch {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestModeratorBlackScreenFixSwitch INSTANCE = new MultiGuestModeratorBlackScreenFixSwitch();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestModeratorBlackScreenFixSwitch.class);
    }
}
