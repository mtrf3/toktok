package com.bytedance.android.livesdk.livesetting.subscription;

import X.C221108m2;
import X.C29233Bdd;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_subscription_room_position")
/* loaded from: classes6.dex */
public final class SubscribeRoomPositionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final SubscribeRoomPositionSetting INSTANCE = new SubscribeRoomPositionSetting();
    public static final C5H3 lazyValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C29233Bdd.LJLIL);

    private final int getLazyValue() {
        return ((Number) lazyValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return getLazyValue();
    }

    public final boolean isNewPosition() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }
}
