package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.BWR;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_anchor_more_panel_layout_opt")
/* loaded from: classes6.dex */
public final class LiveToolbarMoreConfig {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveToolbarMoreConfig INSTANCE = new LiveToolbarMoreConfig();
    public static final C5H3 group$delegate = C221108m2.LIZIZ(BWR.LJLIL);

    private final int getGroup() {
        return ((Number) group$delegate.getValue()).intValue();
    }

    public final boolean enableInteractionPanelOptimize() {
        if (getGroup() > 1) {
            return true;
        }
        return false;
    }

    public final boolean enableInteractionPanelOptimizeByLine() {
        if (getGroup() > 2) {
            return true;
        }
        return false;
    }

    public final boolean enableMorePanelOptimize() {
        if (getGroup() == 1) {
            return true;
        }
        return false;
    }
}
