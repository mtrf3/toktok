package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C58478MxG;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_queue_new_sort_of_price_enable")
/* loaded from: classes11.dex */
public final class LiveGiftTrayNewSortSettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftTrayNewSortSettings INSTANCE = new LiveGiftTrayNewSortSettings();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58478MxG.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
