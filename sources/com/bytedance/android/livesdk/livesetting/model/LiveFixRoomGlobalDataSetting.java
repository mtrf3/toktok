package com.bytedance.android.livesdk.livesetting.model;

import X.BM2;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_fix_room_global_data")
/* loaded from: classes6.dex */
public final class LiveFixRoomGlobalDataSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    @Group("v1")
    public static final boolean DISABLE = false;
    public static final LiveFixRoomGlobalDataSetting INSTANCE = new LiveFixRoomGlobalDataSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(BM2.LJLIL);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettingValue();
    }
}
