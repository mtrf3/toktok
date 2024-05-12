package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_anchor_mute_view_switcher")
/* loaded from: classes6.dex */
public final class MultiGuestAnchorMuteViewSwitcherSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestAnchorMuteViewSwitcherSetting INSTANCE = new MultiGuestAnchorMuteViewSwitcherSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestAnchorMuteViewSwitcherSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
