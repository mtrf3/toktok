package com.bytedance.android.livesdk.livesetting.toolbar;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("toolbar_loading_timing")
/* loaded from: classes6.dex */
public final class ToolbarLoadingTimingSetting {

    @Group(isDefault = true, value = "Control group")
    public static final int DEFAULT = 0;
    public static final ToolbarLoadingTimingSetting INSTANCE = new ToolbarLoadingTimingSetting();

    @Group("Experiment group v1")
    public static final int V1 = 1;

    @Group("Experiment group v2")
    public static final int V2 = 2;

    @Group("Experiment group v3")
    public static final int V3 = 3;

    private final int group() {
        return SettingsManager.INSTANCE.getIntValue(ToolbarLoadingTimingSetting.class);
    }

    public final boolean isV1() {
        if (group() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isV2() {
        if (group() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isV3() {
        if (group() == 3) {
            return true;
        }
        return false;
    }
}
