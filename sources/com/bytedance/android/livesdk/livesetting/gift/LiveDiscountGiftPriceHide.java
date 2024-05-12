package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_discount_gift_price_hide")
/* loaded from: classes6.dex */
public final class LiveDiscountGiftPriceHide {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("exp group")
    public static final int EXPERIMENT = 1;
    public static final LiveDiscountGiftPriceHide INSTANCE = new LiveDiscountGiftPriceHide();

    public final int getValue() {
        try {
            return SettingsManager.INSTANCE.getIntValue(LiveDiscountGiftPriceHide.class);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final boolean newUi() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }
}
