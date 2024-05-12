package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_gift_rank_switcher")
/* loaded from: classes11.dex */
public final class MultiGuestGiftRankSwitcherSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestGiftRankSwitcherSetting INSTANCE = new MultiGuestGiftRankSwitcherSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestGiftRankSwitcherSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
