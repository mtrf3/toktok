package com.bytedance.android.livesdk.livesetting.level;

import X.C221108m2;
import X.C32554Cq6;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_privilege_center_cache")
/* loaded from: classes6.dex */
public final class PrivilegeCenterEntranceCacheSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PrivilegeCenterEntranceCacheSetting INSTANCE = new PrivilegeCenterEntranceCacheSetting();
    public static final C5H3 mSettingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C32554Cq6.LJLIL);

    private final boolean getMSettingValue() {
        return ((Boolean) mSettingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getMSettingValue();
    }
}
