package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_env_light_capture")
/* loaded from: classes6.dex */
public final class LiveEnvLightCaptureSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEnvLightCaptureSetting INSTANCE = new LiveEnvLightCaptureSetting();

    public final boolean enableControlGroup() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEnvLightCaptureSetting.class) == 0) {
            return true;
        }
        return false;
    }

    public final boolean enableGroup1() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEnvLightCaptureSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final boolean enableGroup2() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEnvLightCaptureSetting.class) == 2) {
            return true;
        }
        return false;
    }

    public final boolean enableGroup3() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEnvLightCaptureSetting.class) == 3) {
            return true;
        }
        return false;
    }

    public final boolean enableGroup4() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEnvLightCaptureSetting.class) == 4) {
            return true;
        }
        return false;
    }
}
