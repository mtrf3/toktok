package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_match_tray_setting")
/* loaded from: classes6.dex */
public final class LiveGiftMatchTraySetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveGiftMatchTraySetting INSTANCE = new LiveGiftMatchTraySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftMatchTraySetting.class);
    }
}
