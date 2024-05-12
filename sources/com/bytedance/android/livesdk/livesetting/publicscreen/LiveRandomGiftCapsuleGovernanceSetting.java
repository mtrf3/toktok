package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C30928CBw;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_message_list_random_gift_capsule_type")
/* loaded from: classes6.dex */
public final class LiveRandomGiftCapsuleGovernanceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveRandomGiftCapsuleGovernanceSetting INSTANCE = new LiveRandomGiftCapsuleGovernanceSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30928CBw.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean randomGiftCapsuleDefault() {
        if (INSTANCE.getValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean randomGiftCapsuleOpt() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean randomGiftCapsuleRollOff() {
        if (INSTANCE.getValue() == 2) {
            return true;
        }
        return false;
    }
}
