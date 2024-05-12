package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gurd_patterns")
/* loaded from: classes6.dex */
public final class LiveGurdPatternsSetting {
    public static final LiveGurdPatternsSetting INSTANCE = new LiveGurdPatternsSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {".tiktokv.com/falcon/", ".akamaized.net/ies/resource/falcon/", ".tiktokcdn.com/ies/resource/falcon/"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveGurdPatternsSetting.class);
    }
}
