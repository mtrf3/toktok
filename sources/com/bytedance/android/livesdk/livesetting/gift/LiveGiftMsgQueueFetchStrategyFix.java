package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C58477MxF;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_msg_queue_fetch_strategy_fix")
/* loaded from: classes11.dex */
public final class LiveGiftMsgQueueFetchStrategyFix {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftMsgQueueFetchStrategyFix INSTANCE = new LiveGiftMsgQueueFetchStrategyFix();
    public static final C5H3 settings$delegate = C221108m2.LIZIZ(C58477MxF.LJLIL);

    private final int getSettings() {
        return ((Number) settings$delegate.getValue()).intValue();
    }

    public final boolean enable() {
        if (getSettings() > 0) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
