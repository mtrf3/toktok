package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_bytevc1_opt_enable")
/* loaded from: classes6.dex */
public final class LiveGiftByteVC1OptResourceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftByteVC1OptResourceSetting INSTANCE = new LiveGiftByteVC1OptResourceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftByteVC1OptResourceSetting.class);
    }
}
