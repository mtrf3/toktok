package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("jato_gc_blocker_experiment")
/* loaded from: classes6.dex */
public final class JatoGcBlockerExperiment {

    @Group(isDefault = true, value = "disable")
    public static final int DEFAULT = 0;
    public static final JatoGcBlockerExperiment INSTANCE = new JatoGcBlockerExperiment();

    @Group("enable")
    public static final int ENABLE = 1;

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(JatoGcBlockerExperiment.class) == ENABLE) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE() {
        return ENABLE;
    }
}
