package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C31150CKk;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("webcast_live_sdk_ttls_enable_debug_log_settings")
/* loaded from: classes6.dex */
public final class LiveTTLSDebugLogEnableSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveTTLSDebugLogEnableSettings INSTANCE = new LiveTTLSDebugLogEnableSettings();
    public static final C5H3 enabled$delegate = C221108m2.LIZIZ(C31150CKk.LJLIL);

    private final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean isDebugLogEnabled() {
        return getEnabled();
    }
}
