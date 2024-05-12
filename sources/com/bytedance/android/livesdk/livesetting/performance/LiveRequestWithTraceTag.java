package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_request_with_tracetag")
/* loaded from: classes6.dex */
public final class LiveRequestWithTraceTag {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveRequestWithTraceTag INSTANCE = new LiveRequestWithTraceTag();

    public final boolean hasTraceTag() {
        if (SettingsManager.INSTANCE.getIntValue(LiveRequestWithTraceTag.class) == 1) {
            return true;
        }
        return false;
    }
}
