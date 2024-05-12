package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("landscape_audience_auto_rotate")
/* loaded from: classes6.dex */
public final class GameLiveAutoRotateSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "exp v3")
    public static final int ENABLE_ALL = 3;

    @Group(isDefault = false, value = "exp v1")
    public static final int ENABLE_L2L = 1;

    @Group(isDefault = false, value = "exp v2")
    public static final int ENABLE_P2L = 2;
    public static final GameLiveAutoRotateSetting INSTANCE = new GameLiveAutoRotateSetting();

    private final boolean enableAll() {
        if (SettingsManager.INSTANCE.getIntValue(GameLiveAutoRotateSetting.class) == 3) {
            return true;
        }
        return false;
    }

    public final boolean disable() {
        if (SettingsManager.INSTANCE.getIntValue(GameLiveAutoRotateSetting.class) == 0) {
            return true;
        }
        return false;
    }

    public final boolean enableL2L() {
        if (SettingsManager.INSTANCE.getIntValue(GameLiveAutoRotateSetting.class) == 1 || enableAll()) {
            return true;
        }
        return false;
    }

    public final boolean enableP2L() {
        if (SettingsManager.INSTANCE.getIntValue(GameLiveAutoRotateSetting.class) == 2 || enableAll()) {
            return true;
        }
        return false;
    }
}
