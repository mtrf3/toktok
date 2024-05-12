package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("pay_methods_disabled_alert")
/* loaded from: classes6.dex */
public final class PayMethodsDisabledAlertSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final PayMethodsDisabledAlertSetting INSTANCE = new PayMethodsDisabledAlertSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(PayMethodsDisabledAlertSetting.class);
    }
}
