package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("recharge_email_auth")
/* loaded from: classes6.dex */
public final class LiveRechargeEmailUgConsentRegionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRechargeEmailUgConsentRegionSetting INSTANCE = new LiveRechargeEmailUgConsentRegionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRechargeEmailUgConsentRegionSetting.class);
    }
}
