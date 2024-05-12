package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58512Mxo;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_sdk_multi_guest_icon_opt")
/* loaded from: classes11.dex */
public final class LiveSdkMultiGuestIconOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestIconOptSetting INSTANCE = new LiveSdkMultiGuestIconOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C58512Mxo.LJLIL);

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean isEnable() {
        return getValue();
    }
}
