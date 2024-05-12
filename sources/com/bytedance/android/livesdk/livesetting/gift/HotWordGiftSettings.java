package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct;

@SettingsKey("hotword_gift")
/* loaded from: classes14.dex */
public final class HotWordGiftSettings {
    public static final HotWordGiftSettings INSTANCE = new HotWordGiftSettings();

    @Group(isDefault = true, value = "default group")
    public static final HotWordGiftStruct DEFAULT = new HotWordGiftStruct(false, 0, 0, 0, null, null, null, 127, null);

    private final HotWordGiftStruct getValue() {
        HotWordGiftStruct hotWordGiftStruct = (HotWordGiftStruct) SettingsManager.INSTANCE.getValueSafely(HotWordGiftSettings.class);
        if (hotWordGiftStruct == null) {
            return DEFAULT;
        }
        return hotWordGiftStruct;
    }

    public final String getEeaCoinsPolicyUrl() {
        return getValue().eeaCoinsPolicyUrl;
    }

    public final int getEeaPopupIntervalInHours() {
        return getValue().eeaPopupInterval;
    }

    public final int getExpensiveGiftPrice() {
        return getValue().expensiveGiftPrice;
    }

    public final HotWordGiftStruct.FrequencyControl getFrequencyControl() {
        return getValue().frequencyControl;
    }

    public final int getNonRechargeMaxPrice() {
        return getValue().nonRechargeMaxPrice;
    }

    public final String getRowCoinsPolicyUrl() {
        return getValue().rowCoinsPolicyUrl;
    }

    public final boolean isEnabled() {
        return getValue().enabled;
    }
}
