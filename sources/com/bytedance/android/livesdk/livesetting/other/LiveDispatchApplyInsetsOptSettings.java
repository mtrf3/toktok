package com.bytedance.android.livesdk.livesetting.other;

import X.BZP;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_dispatch_apply_insets_opt")
/* loaded from: classes6.dex */
public final class LiveDispatchApplyInsetsOptSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveDispatchApplyInsetsOptSettings INSTANCE = new LiveDispatchApplyInsetsOptSettings();
    public static final C5H3 v$delegate = C221108m2.LIZIZ(BZP.LJLIL);

    public final boolean getV() {
        return ((Boolean) v$delegate.getValue()).booleanValue();
    }
}
