package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_event_detail")
/* loaded from: classes6.dex */
public final class LiveEventDetailSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveEventDetailSetting INSTANCE = new LiveEventDetailSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveEventDetailSetting.class);
    }
}
