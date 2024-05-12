package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_player_user_type_new")
/* loaded from: classes6.dex */
public final class LiveGiftPlayerUserTypeNewSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 4;
    public static final LiveGiftPlayerUserTypeNewSetting INSTANCE = new LiveGiftPlayerUserTypeNewSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftPlayerUserTypeNewSetting.class);
    }
}
