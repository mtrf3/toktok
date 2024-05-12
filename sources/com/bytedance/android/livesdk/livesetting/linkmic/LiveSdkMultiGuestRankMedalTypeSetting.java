package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_rank_medal_type")
/* loaded from: classes14.dex */
public final class LiveSdkMultiGuestRankMedalTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkMultiGuestRankMedalTypeSetting INSTANCE = new LiveSdkMultiGuestRankMedalTypeSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkMultiGuestRankMedalTypeSetting.class);
    }

    public final boolean noMedal() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean onlyShowSubscribeMedal() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean showAllMedal() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
