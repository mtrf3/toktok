package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C30984CEa;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_panel_open_intention_settings")
/* loaded from: classes6.dex */
public final class LiveGiftPanelOpenIntentionSettings {
    public static final LiveGiftPanelOpenIntentionSettings INSTANCE = new LiveGiftPanelOpenIntentionSettings();

    @Group(isDefault = true, value = "default group")
    public static final LiveGiftPanelOpenIntentionParams DEFAULT = new LiveGiftPanelOpenIntentionParams(0, null, 3, null);
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30984CEa.LJLIL);

    private final LiveGiftPanelOpenIntentionParams getValue() {
        return (LiveGiftPanelOpenIntentionParams) value$delegate.getValue();
    }

    public final String businessName() {
        return getValue().businessName;
    }

    public final boolean enable() {
        if (getValue().enable > 0) {
            return true;
        }
        return false;
    }

    public final LiveGiftPanelOpenIntentionParams getDEFAULT$livesetting_release() {
        return DEFAULT;
    }
}
