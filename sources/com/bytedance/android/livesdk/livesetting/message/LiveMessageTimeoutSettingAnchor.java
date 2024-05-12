package com.bytedance.android.livesdk.livesetting.message;

import X.C221108m2;
import X.C32081CiT;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.model.LiveMessageTimeoutConfig;

@SettingsKey("live_message_timeout_anchor")
/* loaded from: classes6.dex */
public final class LiveMessageTimeoutSettingAnchor {
    public static final LiveMessageTimeoutSettingAnchor INSTANCE = new LiveMessageTimeoutSettingAnchor();

    @Group(isDefault = true, value = "default group")
    public static final LiveMessageTimeoutConfig DEFAULT = new LiveMessageTimeoutConfig();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C32081CiT.LJLIL);

    private final LiveMessageTimeoutConfig getSettingValue() {
        return (LiveMessageTimeoutConfig) settingValue$delegate.getValue();
    }

    public final long getHttpFetchMonitorTimeout() {
        return getSettingValue().httpFetchMonitorTimeout;
    }

    public final long getHttpFetchRequestTimeout() {
        return getSettingValue().httpFetchRequestTimeout;
    }

    public final long getWsConnectTimeout() {
        return getSettingValue().wsConnectTimeout;
    }
}
