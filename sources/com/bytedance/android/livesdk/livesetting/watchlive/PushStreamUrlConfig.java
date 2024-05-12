package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("push_stream_url_config")
/* loaded from: classes6.dex */
public final class PushStreamUrlConfig {
    public static final PushStreamUrlConfig INSTANCE = new PushStreamUrlConfig();

    @Group(isDefault = true, value = "default")
    public static final PushStreamUrlConfigData DEFAULT = PushStreamUrlConfigData.LIZ;

    public final PushStreamUrlConfigData getValue() {
        return (PushStreamUrlConfigData) SettingsManager.INSTANCE.getValueSafely(PushStreamUrlConfig.class);
    }

    public final int getCacheSize() {
        PushStreamUrlConfigData value = getValue();
        if (value == null) {
            value = PushStreamUrlConfigData.LIZ;
        }
        return value.cacheSize;
    }

    public final int getExpireTime() {
        PushStreamUrlConfigData value = getValue();
        if (value == null) {
            value = PushStreamUrlConfigData.LIZ;
        }
        return value.expireTime;
    }

    public final PushStreamUrlConfigData getDEFAULT() {
        return DEFAULT;
    }
}
