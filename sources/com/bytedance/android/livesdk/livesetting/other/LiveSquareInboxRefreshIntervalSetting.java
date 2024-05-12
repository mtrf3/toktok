package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_square_inbox_refresh_interval")
/* loaded from: classes6.dex */
public final class LiveSquareInboxRefreshIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 300;
    public static final LiveSquareInboxRefreshIntervalSetting INSTANCE = new LiveSquareInboxRefreshIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSquareInboxRefreshIntervalSetting.class);
    }
}
