package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.ORY;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_short_touch_type_priority")
/* loaded from: classes6.dex */
public final class ShortTouchPriority {
    public static final ShortTouchPriority INSTANCE = new ShortTouchPriority();

    @Group(isDefault = true, value = "default")
    public static final String[] DEFAULT = {"shortTouchEcommerceLuckyBag", "shortTouchEcommerceUg", "shortTouchEcommerceVoucher", "shortTouchMatchItemsStrike", "shortTouchMatchItemsSmoke", "shortTouchActivityShell", "shortTouchTreasureBox", "shortTouchCustomPoll"};

    private final String[] getPriorityArray() {
        return SettingsManager.INSTANCE.getStringArrayValue(ShortTouchPriority.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final int getPriority(String str) {
        String[] priorityArray = getPriorityArray();
        if (TextUtils.isEmpty(str) || priorityArray.length == 0 || !ORY.LJJIJIIJIL(str, priorityArray)) {
            return Integer.MAX_VALUE;
        }
        return ORY.LJJJJIZL(str, priorityArray);
    }
}
