package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("max_show_guideLS_times")
/* loaded from: classes6.dex */
public final class LiveStudioGuideShowMaxTimesSetting {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 1;
    public static final LiveStudioGuideShowMaxTimesSetting INSTANCE = new LiveStudioGuideShowMaxTimesSetting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue(LiveStudioGuideShowMaxTimesSetting.class);
    }
}
