package com.bytedance.android.livesdk.livesetting.performance;

import X.BM6;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("collect_performance_after_first_screen")
/* loaded from: classes6.dex */
public final class CollectPerformanceAfterEnterRoomSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final CollectPerformanceAfterEnterRoomSetting INSTANCE = new CollectPerformanceAfterEnterRoomSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(BM6.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
