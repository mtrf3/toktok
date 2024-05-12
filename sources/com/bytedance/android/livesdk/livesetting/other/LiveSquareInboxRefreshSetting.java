package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_square_inbox_refresh")
/* loaded from: classes6.dex */
public final class LiveSquareInboxRefreshSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSquareInboxRefreshSetting INSTANCE = new LiveSquareInboxRefreshSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSquareInboxRefreshSetting.class);
    }
}
