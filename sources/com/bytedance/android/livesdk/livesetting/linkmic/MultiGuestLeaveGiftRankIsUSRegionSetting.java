package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_gift_rank_is_us_region")
/* loaded from: classes11.dex */
public final class MultiGuestLeaveGiftRankIsUSRegionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestLeaveGiftRankIsUSRegionSetting INSTANCE = new MultiGuestLeaveGiftRankIsUSRegionSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestLeaveGiftRankIsUSRegionSetting.class);
    }

    public final boolean isInUS() {
        return getValue();
    }
}
