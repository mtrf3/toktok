package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58465Mx3;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_bubble_switch_page")
/* loaded from: classes11.dex */
public final class LiveBubbleSwitchPageSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBubbleSwitchPageSetting INSTANCE = new LiveBubbleSwitchPageSetting();
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(C58465Mx3.LJLIL);

    private final boolean getSetting() {
        return ((Boolean) setting$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getSetting();
    }
}
