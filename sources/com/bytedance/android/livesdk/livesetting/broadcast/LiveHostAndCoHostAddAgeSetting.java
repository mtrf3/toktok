package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_host_and_co_host_add_age")
/* loaded from: classes6.dex */
public final class LiveHostAndCoHostAddAgeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveHostAndCoHostAddAgeSetting INSTANCE = new LiveHostAndCoHostAddAgeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHostAndCoHostAddAgeSetting.class);
    }
}
