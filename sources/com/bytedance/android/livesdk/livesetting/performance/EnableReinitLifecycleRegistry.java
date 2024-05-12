package com.bytedance.android.livesdk.livesetting.performance;

import X.BT3;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("enable_reinit_lifecycle_registry")
/* loaded from: classes6.dex */
public final class EnableReinitLifecycleRegistry {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final EnableReinitLifecycleRegistry INSTANCE = new EnableReinitLifecycleRegistry();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(BT3.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
