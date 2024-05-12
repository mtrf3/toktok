package com.bytedance.android.livesdk.livesetting.subscription;

import X.C221108m2;
import X.C5H3;
import X.C7A;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_subscribe_create_tools_entrance_new")
/* loaded from: classes6.dex */
public final class LiveSubCreateToolsEntranceNewSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSubCreateToolsEntranceNewSetting INSTANCE = new LiveSubCreateToolsEntranceNewSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C7A.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
