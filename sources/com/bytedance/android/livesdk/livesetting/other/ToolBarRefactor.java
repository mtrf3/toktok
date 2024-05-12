package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C5H3;
import X.C5K;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_toolbar_refactor")
/* loaded from: classes6.dex */
public final class ToolBarRefactor {

    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFAULT = false;
    public static final ToolBarRefactor INSTANCE = new ToolBarRefactor();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C5K.LJLIL);

    public static final boolean enable() {
        return INSTANCE.getEnable();
    }

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
