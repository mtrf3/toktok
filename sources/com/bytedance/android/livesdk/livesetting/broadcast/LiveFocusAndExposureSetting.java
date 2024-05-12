package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_focus_and_exposure")
/* loaded from: classes6.dex */
public final class LiveFocusAndExposureSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveFocusAndExposureSetting INSTANCE = new LiveFocusAndExposureSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveFocusAndExposureSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
