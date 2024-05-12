package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_add_combo_duration")
/* loaded from: classes14.dex */
public final class LiveGiftAddComboDuration {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftAddComboDuration INSTANCE = new LiveGiftAddComboDuration();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftAddComboDuration.class);
    }

    public final boolean optimiseAllGiftCombo() {
        if (getValue() == 3) {
            return true;
        }
        return false;
    }

    public final boolean optimiseFirstBigGiftCombo3s() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean optimiseFirstBigGiftCombo4s() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
