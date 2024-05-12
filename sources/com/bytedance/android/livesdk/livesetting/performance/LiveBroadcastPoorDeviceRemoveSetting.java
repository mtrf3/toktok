package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30110Brm;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_broadcast_poor_device_remove")
/* loaded from: classes6.dex */
public final class LiveBroadcastPoorDeviceRemoveSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastPoorDeviceRemoveSetting INSTANCE = new LiveBroadcastPoorDeviceRemoveSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C30110Brm.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean disable() {
        return !getEnable();
    }

    public final boolean enable() {
        return getEnable();
    }
}
