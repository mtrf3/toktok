package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C31327CRf;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_public_screen_on_message_opt")
/* loaded from: classes6.dex */
public final class LivePublicScreenOnMessageOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenOnMessageOptSetting INSTANCE = new LivePublicScreenOnMessageOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C31327CRf.LJLIL);

    public static final boolean enable() {
        return INSTANCE.getValue();
    }

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
