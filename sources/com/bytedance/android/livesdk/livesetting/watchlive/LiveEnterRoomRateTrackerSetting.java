package com.bytedance.android.livesdk.livesetting.watchlive;

import X.B67;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enter_room_rate")
/* loaded from: classes6.dex */
public final class LiveEnterRoomRateTrackerSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveEnterRoomRateTrackerSetting INSTANCE = new LiveEnterRoomRateTrackerSetting();
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(B67.LJLIL);

    private final boolean getSetting() {
        return ((Boolean) setting$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getSetting();
    }
}
