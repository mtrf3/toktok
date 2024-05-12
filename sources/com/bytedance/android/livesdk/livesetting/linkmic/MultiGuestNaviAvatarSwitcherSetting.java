package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_adapt_avatar_effect")
/* loaded from: classes14.dex */
public final class MultiGuestNaviAvatarSwitcherSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestNaviAvatarSwitcherSetting INSTANCE = new MultiGuestNaviAvatarSwitcherSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestNaviAvatarSwitcherSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
