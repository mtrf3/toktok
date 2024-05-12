package com.bytedance.android.livesdk.livesetting.message;

import X.C221108m2;
import X.C5H3;
import X.UYD;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.model.LiveUplinkConfig;
import java.util.Map;

@SettingsKey("live_uplink_strategy")
/* loaded from: classes14.dex */
public final class LiveUplinkStrategySetting {
    public static final LiveUplinkStrategySetting INSTANCE = new LiveUplinkStrategySetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveUplinkConfig DEFAULT = new LiveUplinkConfig();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(UYD.LJLIL);

    private final LiveUplinkConfig getSettingValue() {
        return (LiveUplinkConfig) settingValue$delegate.getValue();
    }

    public final Map<String, Map<String, Long>> getUplinkApiAllowedList() {
        return getSettingValue().uplinkApiAllowedList;
    }

    public final boolean getWsFailFallbackToHttp() {
        return getSettingValue().wsFailFallbackToHttp;
    }

    public final long getWsUplinkWaitTimeout() {
        return getSettingValue().wsUplinkWaitTimeout;
    }

    public final boolean supportHttpUplink() {
        if (getSettingValue().uplinkStrategy == 0) {
            return true;
        }
        return false;
    }

    public final boolean supportUplink() {
        return getSettingValue().enable;
    }

    public final boolean supportWSUplink() {
        if (getSettingValue().uplinkStrategy != 2) {
            return true;
        }
        return false;
    }

    public final Map<String, Map<String, Long>> uplinkApiAlternativeServiceIdList() {
        return getSettingValue().uplinkApiAlternativeServiceIdList;
    }
}
