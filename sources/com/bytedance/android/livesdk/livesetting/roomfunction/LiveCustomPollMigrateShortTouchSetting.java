package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C30641C0v;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_custom_poll_migrate_short_touch")
/* loaded from: classes6.dex */
public final class LiveCustomPollMigrateShortTouchSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "lynx short touch")
    public static final int LYNX = 2;

    @Group(isDefault = false, value = "native short touch")
    public static final int NATIVE = 1;
    public static final LiveCustomPollMigrateShortTouchSetting INSTANCE = new LiveCustomPollMigrateShortTouchSetting();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(C30641C0v.LJLIL);

    public static final boolean enableMigrate() {
        LiveCustomPollMigrateShortTouchSetting liveCustomPollMigrateShortTouchSetting = INSTANCE;
        if (liveCustomPollMigrateShortTouchSetting.getValue() == 1 || liveCustomPollMigrateShortTouchSetting.getValue() == 2) {
            return true;
        }
        return false;
    }

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public static final boolean lynx() {
        if (INSTANCE.getValue() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: native, reason: not valid java name */
    public static final boolean m64native() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }
}
