package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C29950BpC;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_message_list_live_goal_capsule_type")
/* loaded from: classes6.dex */
public final class LiveStreamGoalCapsuleGovernanceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveStreamGoalCapsuleGovernanceSetting INSTANCE = new LiveStreamGoalCapsuleGovernanceSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C29950BpC.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean streamLiveGoalCapsuleDefault() {
        if (INSTANCE.getValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean streamLiveGoalCapsuleOpt() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean streamLiveGoalCapsuleRollOff() {
        if (INSTANCE.getValue() == 2) {
            return true;
        }
        return false;
    }
}
