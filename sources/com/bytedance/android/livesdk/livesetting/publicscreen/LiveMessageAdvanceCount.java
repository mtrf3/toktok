package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_advance_count")
/* loaded from: classes6.dex */
public final class LiveMessageAdvanceCount {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMessageAdvanceCount INSTANCE = new LiveMessageAdvanceCount();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMessageAdvanceCount.class);
    }
}
