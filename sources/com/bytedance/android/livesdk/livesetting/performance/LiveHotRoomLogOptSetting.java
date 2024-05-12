package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C58479MxH;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_hot_room_log_opt")
/* loaded from: classes11.dex */
public final class LiveHotRoomLogOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveHotRoomLogOptSetting INSTANCE = new LiveHotRoomLogOptSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58479MxH.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
