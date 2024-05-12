package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C5H3;
import X.CBA;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_message_list_sub_capsule_type")
/* loaded from: classes6.dex */
public final class LiveSubCapsuleGovernanceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSubCapsuleGovernanceSetting INSTANCE = new LiveSubCapsuleGovernanceSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(CBA.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean subCapsuleDefault() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean subCapsuleRollOff() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean subCapsuleOpt(boolean z) {
        if (z) {
            if (getValue() != 2 && getValue() != 1) {
                return false;
            }
        } else if (getValue() != 1) {
            return false;
        }
        return true;
    }
}
