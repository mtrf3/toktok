package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C31807Ce3;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_log_deep_copy_opt")
/* loaded from: classes6.dex */
public final class LiveLogDeepCopySetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveLogDeepCopySetting INSTANCE = new LiveLogDeepCopySetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C31807Ce3.LJLIL);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
