package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.CKZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("webcast_live_sdk_ttls_disable_gpu_turbo_settings")
/* loaded from: classes6.dex */
public final class LiveTTLSGpuTurboSettings {
    public static final LiveTTLSGpuTurboSettings INSTANCE = new LiveTTLSGpuTurboSettings();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final C5H3 enabled$delegate = C221108m2.LIZIZ(CKZ.LJLIL);

    private final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean isGpuTurboDisabled() {
        return getEnabled();
    }
}
