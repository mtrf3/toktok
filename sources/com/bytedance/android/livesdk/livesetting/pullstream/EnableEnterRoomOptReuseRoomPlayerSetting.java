package com.bytedance.android.livesdk.livesetting.pullstream;

import X.B6H;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("enable_enter_room_opt_reuse_room_player")
/* loaded from: classes6.dex */
public final class EnableEnterRoomOptReuseRoomPlayerSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final EnableEnterRoomOptReuseRoomPlayerSetting INSTANCE = new EnableEnterRoomOptReuseRoomPlayerSetting();
    public static final C5H3 settingVal$delegate = C221108m2.LIZIZ(B6H.LJLIL);

    private final boolean getSettingVal() {
        return ((Boolean) settingVal$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettingVal();
    }
}
