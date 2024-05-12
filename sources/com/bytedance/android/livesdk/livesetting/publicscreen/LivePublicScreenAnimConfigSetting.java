package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C58534MyA;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_public_screen_anim_config")
/* loaded from: classes11.dex */
public final class LivePublicScreenAnimConfigSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePublicScreenAnimConfigSetting INSTANCE = new LivePublicScreenAnimConfigSetting();
    public static final C5H3 v$delegate = C221108m2.LIZIZ(C58534MyA.LJLIL);

    private final int getV() {
        return ((Number) v$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePublicScreenAnimConfigSetting.class);
    }

    public final boolean isItemSortEnabled() {
        if ((getV() & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isMoveCheckEnabled() {
        if ((getV() & 4) == 4) {
            return true;
        }
        return false;
    }

    public final boolean isRemoveDelayEnabled() {
        if ((getV() & 2) == 2) {
            return true;
        }
        return false;
    }
}
