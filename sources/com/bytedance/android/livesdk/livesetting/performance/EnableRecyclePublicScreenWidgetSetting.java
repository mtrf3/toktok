package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30178Bss;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("enable_recycle_public_screen_widget")
/* loaded from: classes6.dex */
public final class EnableRecyclePublicScreenWidgetSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableRecyclePublicScreenWidgetSetting INSTANCE = new EnableRecyclePublicScreenWidgetSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30178Bss.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
