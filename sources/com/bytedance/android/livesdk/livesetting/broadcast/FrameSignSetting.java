package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_frame_sign_setting")
/* loaded from: classes6.dex */
public final class FrameSignSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final FrameSignSetting INSTANCE = new FrameSignSetting();

    public final boolean isDisable() {
        if (SettingsManager.INSTANCE.getIntValue(FrameSignSetting.class) == 0) {
            return true;
        }
        return false;
    }
}
