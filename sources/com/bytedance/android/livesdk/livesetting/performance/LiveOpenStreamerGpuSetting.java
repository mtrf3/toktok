package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C31031CFv;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_open_streamer_gpu")
/* loaded from: classes6.dex */
public final class LiveOpenStreamerGpuSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveOpenStreamerGpuSetting INSTANCE = new LiveOpenStreamerGpuSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C31031CFv.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
