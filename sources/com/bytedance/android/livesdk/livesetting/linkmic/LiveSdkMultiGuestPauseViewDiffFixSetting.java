package com.bytedance.android.livesdk.livesetting.linkmic;

import X.B6D;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_pause_view_diff_fix")
/* loaded from: classes6.dex */
public final class LiveSdkMultiGuestPauseViewDiffFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveSdkMultiGuestPauseViewDiffFixSetting INSTANCE = new LiveSdkMultiGuestPauseViewDiffFixSetting();
    public static final C5H3 fix$delegate = C221108m2.LIZIZ(B6D.LJLIL);

    private final boolean getFix() {
        return ((Boolean) fix$delegate.getValue()).booleanValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkMultiGuestPauseViewDiffFixSetting.class);
    }

    public final boolean isFix() {
        return getFix();
    }
}
