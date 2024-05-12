package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mt_mock_landscape")
/* loaded from: classes6.dex */
public final class LiveMtMockLandscapeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMtMockLandscapeSetting INSTANCE = new LiveMtMockLandscapeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtMockLandscapeSetting.class);
    }
}
