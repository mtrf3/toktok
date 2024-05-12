package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C221108m2;
import X.C30318Bv8;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_widget_slardar")
/* loaded from: classes6.dex */
public final class LiveWidgetSlardarSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveWidgetSlardarSetting INSTANCE = new LiveWidgetSlardarSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30318Bv8.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
