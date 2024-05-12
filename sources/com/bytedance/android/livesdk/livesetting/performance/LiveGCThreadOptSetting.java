package com.bytedance.android.livesdk.livesetting.performance;

import X.C025908h;
import X.C221108m2;
import X.C28734BPm;
import X.C29044Baa;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

@SettingsKey("live_gc_thread_opt_v1")
/* loaded from: classes6.dex */
public final class LiveGCThreadOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGCThreadOptSetting INSTANCE = new LiveGCThreadOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C28734BPm.LJLIL);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final boolean disableAlogInBgThread() {
        return INSTANCE.isPositionEnable(2);
    }

    public static final boolean enableAppLogOpt() {
        return INSTANCE.isPositionEnable(1);
    }

    public static final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    private final boolean isAnchor() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || room.getOwnerUserId() != C025908h.LIZ()) {
            return false;
        }
        return true;
    }

    private final boolean disableInAnchor() {
        if ((getValue() & 4) == 4) {
            return true;
        }
        return false;
    }

    private final boolean disableInAudience() {
        if ((getValue() & 8) == 8) {
            return true;
        }
        return false;
    }

    private final boolean isPositionEnable(int i) {
        boolean z;
        if ((getValue() & i) == i) {
            z = true;
        } else {
            z = false;
        }
        boolean isAnchor = isAnchor();
        if (!z) {
            return false;
        }
        if (!disableInAnchor() && !disableInAudience()) {
            return true;
        }
        if (!disableInAnchor() && isAnchor) {
            return true;
        }
        if (!disableInAudience() && !isAnchor) {
            return true;
        }
        return false;
    }
}
