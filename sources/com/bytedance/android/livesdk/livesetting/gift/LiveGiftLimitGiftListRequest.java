package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_limit_gift_list_request")
/* loaded from: classes6.dex */
public final class LiveGiftLimitGiftListRequest {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftLimitGiftListRequest INSTANCE = new LiveGiftLimitGiftListRequest();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftLimitGiftListRequest.class);
    }

    public final boolean optimiseCancelBasedOnRoom() {
        if (getValue() == 2 || getValue() == 3) {
            return true;
        }
        return false;
    }

    public final boolean optimiseEnterRoom() {
        if (getValue() == 1 || getValue() == 3) {
            return true;
        }
        return false;
    }
}
