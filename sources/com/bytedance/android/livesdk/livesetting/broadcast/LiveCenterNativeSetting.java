package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C55;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_anchor_center_native_enable")
/* loaded from: classes6.dex */
public final class LiveCenterNativeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCenterNativeSetting INSTANCE = new LiveCenterNativeSetting();
    public static final C5H3 useNative$delegate = C221108m2.LIZIZ(C55.LJLIL);

    private final boolean getUseNative() {
        return ((Boolean) useNative$delegate.getValue()).booleanValue();
    }

    public final boolean useNative() {
        return getUseNative();
    }
}
