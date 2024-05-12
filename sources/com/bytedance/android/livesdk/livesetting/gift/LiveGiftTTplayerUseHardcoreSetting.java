package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_ttplayer_use_hardcore")
/* loaded from: classes6.dex */
public final class LiveGiftTTplayerUseHardcoreSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftTTplayerUseHardcoreSetting INSTANCE = new LiveGiftTTplayerUseHardcoreSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftTTplayerUseHardcoreSetting.class);
    }
}
