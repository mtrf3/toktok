package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.BKT;
import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_jit_block_setting")
/* loaded from: classes6.dex */
public final class LiveJitBlockSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveJitBlockSetting INSTANCE = new LiveJitBlockSetting();
    public static final C5H3 configValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, BKT.LJLIL);

    private final boolean getConfigValue() {
        return ((Boolean) configValue$delegate.getValue()).booleanValue();
    }

    public final boolean isEnable() {
        return getConfigValue();
    }
}
