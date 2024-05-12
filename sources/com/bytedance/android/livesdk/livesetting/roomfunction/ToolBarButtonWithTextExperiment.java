package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.BN2;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_toolbar_with_title")
/* loaded from: classes6.dex */
public final class ToolBarButtonWithTextExperiment {

    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFAULT = false;

    @Group("experimental_group")
    public static final boolean HAS_TEXT = true;
    public static final ToolBarButtonWithTextExperiment INSTANCE = new ToolBarButtonWithTextExperiment();
    public static final C5H3 hasText$delegate = C221108m2.LIZIZ(BN2.LJLIL);

    private final boolean getHasText() {
        return ((Boolean) hasText$delegate.getValue()).booleanValue();
    }

    public static final boolean hasText() {
        if (INSTANCE.getHasText()) {
            return true;
        }
        return false;
    }
}
