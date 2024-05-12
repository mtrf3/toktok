package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.GiftPlayerAutoReleaseSwitch;

@SettingsKey("gift_player_auto_release_switch")
/* loaded from: classes6.dex */
public final class GiftPlayerAutoReleaseSwitchSetting {
    public static final GiftPlayerAutoReleaseSwitchSetting INSTANCE = new GiftPlayerAutoReleaseSwitchSetting();

    @Group(isDefault = true, value = "default group")
    public static final GiftPlayerAutoReleaseSwitch DEFAULT = new GiftPlayerAutoReleaseSwitch();

    public final GiftPlayerAutoReleaseSwitch getValue() {
        GiftPlayerAutoReleaseSwitch giftPlayerAutoReleaseSwitch = (GiftPlayerAutoReleaseSwitch) SettingsManager.INSTANCE.getValueSafely(GiftPlayerAutoReleaseSwitchSetting.class);
        if (giftPlayerAutoReleaseSwitch == null) {
            return DEFAULT;
        }
        return giftPlayerAutoReleaseSwitch;
    }
}
