package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C28961BYf;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("subonly_popup_window")
/* loaded from: classes6.dex */
public final class SubOnlyLiveGuideSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final SubOnlyLiveGuideSetting INSTANCE = new SubOnlyLiveGuideSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C28961BYf.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final int getGuideIgnoreMaxTime() {
        if (getValue() == 2) {
            return 2;
        }
        if (getValue() == 1) {
            return 10;
        }
        return 0;
    }
}
