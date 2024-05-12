package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cover_min_size")
/* loaded from: classes6.dex */
public final class LiveCoverMinSizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 250;
    public static final LiveCoverMinSizeSetting INSTANCE = new LiveCoverMinSizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoverMinSizeSetting.class);
    }
}
