package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C29578BjC;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_message_list_cohost_match_capsule_type")
/* loaded from: classes6.dex */
public final class LiveCoHostMatchCapsuleGovernanceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoHostMatchCapsuleGovernanceSetting INSTANCE = new LiveCoHostMatchCapsuleGovernanceSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C29578BjC.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean coHostMatchCapsuleDefault() {
        if (INSTANCE.getValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean coHostMatchCapsuleRollOff() {
        if (INSTANCE.getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean coHostMatchCapsuleOpt(boolean z) {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }
}
