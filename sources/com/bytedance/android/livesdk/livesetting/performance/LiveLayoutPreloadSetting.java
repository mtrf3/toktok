package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30262BuE;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_layout_preload")
/* loaded from: classes6.dex */
public final class LiveLayoutPreloadSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveLayoutPreloadSetting INSTANCE = new LiveLayoutPreloadSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C30262BuE.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getEnable();
    }
}
