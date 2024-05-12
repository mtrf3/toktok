package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_combo_insufficient_type")
/* loaded from: classes6.dex */
public final class LiveGiftComboInsufficientTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftComboInsufficientTypeSetting INSTANCE = new LiveGiftComboInsufficientTypeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftComboInsufficientTypeSetting.class);
    }
}
