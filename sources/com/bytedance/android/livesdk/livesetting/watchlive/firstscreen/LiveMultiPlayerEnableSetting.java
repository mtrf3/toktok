package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_multi_player_enable")
/* loaded from: classes6.dex */
public final class LiveMultiPlayerEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final LiveMultiPlayerEnableSetting INSTANCE = new LiveMultiPlayerEnableSetting();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveMultiPlayerEnableSetting.class) && LiveMultiPlayerDeviceScore.INSTANCE.isEnable() && FirstScreenOptSwitcher.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }
}
