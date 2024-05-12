package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_recharge_contact_us_url")
/* loaded from: classes6.dex */
public final class LiveRechargeContactUsUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2ffe_tiktok_common%2ffaq%2ffeedback%2f%3Fhide_nav_bar%3D1%26feedback_id%3D13012&hide_nav_bar=1";
    public static final LiveRechargeContactUsUrlSetting INSTANCE = new LiveRechargeContactUsUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveRechargeContactUsUrlSetting.class);
    }
}
