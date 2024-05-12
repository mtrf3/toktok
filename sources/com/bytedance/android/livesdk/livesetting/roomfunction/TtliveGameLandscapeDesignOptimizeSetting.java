package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_landscape_design_optimize")
/* loaded from: classes6.dex */
public final class TtliveGameLandscapeDesignOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("group1")
    public static final int GROUP1 = 1;

    @Group("group2")
    public static final int GROUP2 = 2;

    @Group("group3")
    public static final int GROUP3 = 3;

    @Group("group4")
    public static final int GROUP4 = 4;
    public static final TtliveGameLandscapeDesignOptimizeSetting INSTANCE = new TtliveGameLandscapeDesignOptimizeSetting();

    public final boolean isGroup3() {
        if (SettingsManager.INSTANCE.getIntValue(TtliveGameLandscapeDesignOptimizeSetting.class) == 3) {
            return true;
        }
        return false;
    }

    public final boolean isGroup4() {
        if (SettingsManager.INSTANCE.getIntValue(TtliveGameLandscapeDesignOptimizeSetting.class) == 4) {
            return true;
        }
        return false;
    }

    public final boolean shouldOptimize() {
        if (SettingsManager.INSTANCE.getIntValue(TtliveGameLandscapeDesignOptimizeSetting.class) != 0) {
            return true;
        }
        return false;
    }

    public final boolean shouldAddIconBackground() {
        if (shouldOptimize() && SettingsManager.INSTANCE.getIntValue(TtliveGameLandscapeDesignOptimizeSetting.class) != 1) {
            return true;
        }
        return false;
    }
}
