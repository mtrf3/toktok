package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C31151CKl;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlivestreamer_enable_localtest_throw_exception")
/* loaded from: classes6.dex */
public final class LiveTTLSThrowExceptionSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveTTLSThrowExceptionSettings INSTANCE = new LiveTTLSThrowExceptionSettings();
    public static final C5H3 enabled$delegate = C221108m2.LIZIZ(C31151CKl.LJLIL);

    private final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean canThrowException() {
        return getEnabled();
    }
}
