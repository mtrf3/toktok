package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("donation_h5_url")
/* loaded from: classes6.dex */
public final class DonationH5UrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final DonationH5UrlSetting INSTANCE = new DonationH5UrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(DonationH5UrlSetting.class);
    }
}
