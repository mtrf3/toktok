package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C30986CEc;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.model.CpuMemoryOptList;

@SettingsKey("live_cpu_memory_opt")
/* loaded from: classes6.dex */
public final class LiveCpuMemoryOptSetting {
    public static final LiveCpuMemoryOptSetting INSTANCE = new LiveCpuMemoryOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final CpuMemoryOptList DEFAULT = new CpuMemoryOptList();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C30986CEc.LJLIL);

    private final CpuMemoryOptList getSettingValue() {
        return (CpuMemoryOptList) settingValue$delegate.getValue();
    }

    public final CpuMemoryOptList getValue() {
        return getSettingValue();
    }
}
