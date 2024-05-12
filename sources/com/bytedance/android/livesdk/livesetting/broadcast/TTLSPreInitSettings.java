package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C29167BcZ;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlivestreamer_pre_load_settings")
/* loaded from: classes6.dex */
public final class TTLSPreInitSettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TTLSPreInitSettings INSTANCE = new TTLSPreInitSettings();
    public static final int ENABLE_PRELOAD = 1;
    public static final int ENABLE_PRE_LOAD_THREADS = 2;
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C29167BcZ.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean enablePreLoad() {
        int value = getValue();
        int i = ENABLE_PRELOAD;
        if ((value & i) == i) {
            return true;
        }
        return false;
    }

    public final boolean enablePreLoadThreads() {
        int value = getValue();
        int i = ENABLE_PRE_LOAD_THREADS;
        if ((value & i) == i) {
            return true;
        }
        return false;
    }
}
