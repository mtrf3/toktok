package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C30463BxT;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("tt_live_background")
/* loaded from: classes6.dex */
public final class TtLiveBackgroundSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TtLiveBackgroundSetting INSTANCE = new TtLiveBackgroundSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C30463BxT.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getEnable();
    }
}
