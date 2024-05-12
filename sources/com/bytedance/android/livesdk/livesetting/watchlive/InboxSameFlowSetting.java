package com.bytedance.android.livesdk.livesetting.watchlive;

import X.B6C;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_window_inner_outer_same_flow")
/* loaded from: classes6.dex */
public final class InboxSameFlowSetting {

    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFAULT = false;
    public static final InboxSameFlowSetting INSTANCE = new InboxSameFlowSetting();

    @Group("experimental_group")
    public static final boolean ENABLE = true;
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(B6C.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
