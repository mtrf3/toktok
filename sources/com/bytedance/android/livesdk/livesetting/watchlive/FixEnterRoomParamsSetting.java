package com.bytedance.android.livesdk.livesetting.watchlive;

import X.BKR;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("fix_enter_room_params_setting")
/* loaded from: classes6.dex */
public final class FixEnterRoomParamsSetting {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = true;

    @Group("v1")
    public static final boolean ENABLE = false;
    public static final FixEnterRoomParamsSetting INSTANCE = new FixEnterRoomParamsSetting();
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(BKR.LJLIL);

    public final boolean getCurrentValue() {
        return ((Boolean) currentValue$delegate.getValue()).booleanValue();
    }
}
