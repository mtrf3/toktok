package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("limit_days_to_show_guideLS_once")
/* loaded from: classes6.dex */
public final class LiveStudioGuideLastShowLimit {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 7;
    public static final LiveStudioGuideLastShowLimit INSTANCE = new LiveStudioGuideLastShowLimit();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue(LiveStudioGuideLastShowLimit.class);
    }
}
