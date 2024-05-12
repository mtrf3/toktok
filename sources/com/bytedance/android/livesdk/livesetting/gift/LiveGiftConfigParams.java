package com.bytedance.android.livesdk.livesetting.gift;

import X.C0K2;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_msg_config_strategy")
/* loaded from: classes14.dex */
public final class LiveGiftConfigParams {
    public static final LiveGiftConfigParams INSTANCE = new LiveGiftConfigParams();

    @Group(isDefault = true, value = "default group")
    public static final GiftConfigParams DEFAULT = new GiftConfigParams();

    public final GiftConfigParams getValue() {
        GiftConfigParams giftConfigParams = (GiftConfigParams) SettingsManager.INSTANCE.getValueSafely(LiveGiftConfigParams.class);
        if (giftConfigParams == null) {
            C0K2.LIZ("Invalid JSON Config for gift_msg_config_strategy", new Throwable("Invalid JSON Config for gift_msg_config_strategy"));
            return DEFAULT;
        }
        return giftConfigParams;
    }
}
