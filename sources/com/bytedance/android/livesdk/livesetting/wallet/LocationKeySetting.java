package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("location_request_key")
/* loaded from: classes6.dex */
public final class LocationKeySetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "5a337ec671a26fea653b1c1c8e3d06c3";
    public static final LocationKeySetting INSTANCE = new LocationKeySetting();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue(LocationKeySetting.class);
        if (stringValue.length() == 0) {
            return DEFAULT;
        }
        return stringValue;
    }
}
