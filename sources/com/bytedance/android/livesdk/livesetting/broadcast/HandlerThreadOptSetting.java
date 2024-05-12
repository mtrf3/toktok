package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C28589BJx;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("handler_thread_opt")
/* loaded from: classes6.dex */
public final class HandlerThreadOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final HandlerThreadOptSetting INSTANCE = new HandlerThreadOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C28589BJx.LJLIL);

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getValue();
    }
}
