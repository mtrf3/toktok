package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C31030CFu;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_gpu_opt")
/* loaded from: classes6.dex */
public final class LiveGpuOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveGpuOptSetting INSTANCE = new LiveGpuOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C31030CFu.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
