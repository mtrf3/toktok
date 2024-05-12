package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C28258B7e;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_recycle")
/* loaded from: classes6.dex */
public final class LiveEnableRecycleSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableRecycleSetting INSTANCE = new LiveEnableRecycleSetting();
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(C28258B7e.LJLIL);

    private final boolean getSetting() {
        return ((Boolean) setting$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getSetting();
    }
}
