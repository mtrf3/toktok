package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30683C2l;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_broadcast_poor_device_delay_duration")
/* loaded from: classes6.dex */
public final class LiveBroadcastPoorDeviceDelayDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 10000;
    public static final LiveBroadcastPoorDeviceDelayDurationSetting INSTANCE = new LiveBroadcastPoorDeviceDelayDurationSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30683C2l.LJLIL);

    private final long getValue() {
        return ((Number) value$delegate.getValue()).longValue();
    }

    public final long value() {
        return getValue();
    }
}
