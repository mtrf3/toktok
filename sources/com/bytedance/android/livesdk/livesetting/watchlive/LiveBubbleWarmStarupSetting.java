package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58466Mx4;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_bubble_warm_startup")
/* loaded from: classes11.dex */
public final class LiveBubbleWarmStarupSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveBubbleWarmStarupSetting INSTANCE = new LiveBubbleWarmStarupSetting();
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(C58466Mx4.LJLIL);

    private final boolean getSetting() {
        return ((Boolean) setting$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getSetting();
    }
}
