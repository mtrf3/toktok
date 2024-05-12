package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("location_service_url")
/* loaded from: classes6.dex */
public final class LocationHostSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LocationHostSetting INSTANCE = new LocationHostSetting();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue(LocationHostSetting.class);
        if (stringValue.length() == 0) {
            return "";
        }
        return stringValue;
    }
}
