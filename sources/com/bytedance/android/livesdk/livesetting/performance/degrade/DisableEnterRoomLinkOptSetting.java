package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.BM0;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("disable_enter_room_link_opt")
/* loaded from: classes6.dex */
public final class DisableEnterRoomLinkOptSetting {

    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFAULT = false;

    @Group("experimental_group")
    public static final boolean DISABLE = true;
    public static final DisableEnterRoomLinkOptSetting INSTANCE = new DisableEnterRoomLinkOptSetting();
    public static final C5H3 disable$delegate = C221108m2.LIZIZ(BM0.LJLIL);

    public final boolean getDisable() {
        return ((Boolean) disable$delegate.getValue()).booleanValue();
    }
}
