package com.bytedance.android.livesdk.livesetting.performance;

import X.C31367CSt;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_delete_useless_preload")
/* loaded from: classes6.dex */
public final class LiveDeleteUselessPreloadSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "delete")
    public static final int OPT = 1;
    public static final LiveDeleteUselessPreloadSetting INSTANCE = new LiveDeleteUselessPreloadSetting();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(C31367CSt.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public static final boolean preloadAble() {
        if (INSTANCE.getValue() == 0) {
            return true;
        }
        return false;
    }
}
