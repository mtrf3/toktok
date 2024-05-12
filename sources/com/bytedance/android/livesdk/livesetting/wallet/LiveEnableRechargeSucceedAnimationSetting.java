package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_recharge_succeed_animation")
/* loaded from: classes6.dex */
public final class LiveEnableRechargeSucceedAnimationSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableRechargeSucceedAnimationSetting INSTANCE = new LiveEnableRechargeSucceedAnimationSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableRechargeSucceedAnimationSetting.class);
    }
}
