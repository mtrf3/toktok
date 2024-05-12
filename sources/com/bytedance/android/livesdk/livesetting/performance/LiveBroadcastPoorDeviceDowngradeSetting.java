package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C35;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_broadcast_poor_device_downgrade")
/* loaded from: classes6.dex */
public final class LiveBroadcastPoorDeviceDowngradeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastPoorDeviceDowngradeSetting INSTANCE = new LiveBroadcastPoorDeviceDowngradeSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C35.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getEnable();
    }
}
