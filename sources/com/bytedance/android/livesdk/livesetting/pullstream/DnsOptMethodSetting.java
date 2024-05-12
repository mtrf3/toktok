package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("dns_opt_method")
/* loaded from: classes11.dex */
public final class DnsOptMethodSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final DnsOptMethodSetting INSTANCE = new DnsOptMethodSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(DnsOptMethodSetting.class);
    }
}
