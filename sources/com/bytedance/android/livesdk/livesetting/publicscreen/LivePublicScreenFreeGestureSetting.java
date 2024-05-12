package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C5H3;
import X.C6W;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_public_screen_free_gesture")
/* loaded from: classes6.dex */
public final class LivePublicScreenFreeGestureSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePublicScreenFreeGestureSetting INSTANCE = new LivePublicScreenFreeGestureSetting();

    @Group("enable free")
    public static final int FREE = 1;

    @Group("enable free when input")
    public static final int FREE_WHEN_INPUT = 2;
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(C6W.LJLIL);

    public static final boolean enableFreeGesture() {
        if (INSTANCE.getValue() > 0) {
            return true;
        }
        return false;
    }

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean enableFreeGestureWhenInput() {
        if (getValue() == FREE_WHEN_INPUT) {
            return true;
        }
        return false;
    }
}
