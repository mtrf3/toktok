package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.ORY;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import ujb.o;

@SettingsKey("live_cohost_expand_layout_id")
/* loaded from: classes11.dex */
public final class MultiCohostExpandLayoutIdsSetting {
    public static final MultiCohostExpandLayoutIdsSetting INSTANCE = new MultiCohostExpandLayoutIdsSetting();

    @Group(isDefault = true, value = "default")
    public static final String[] DEFAULT = {"2002", "2011"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(MultiCohostExpandLayoutIdsSetting.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isLayoutIdExpanded(String str) {
        if (str == null || o.LJJJJJL(str)) {
            return false;
        }
        return ORY.LJJIJIIJIL(str, getValue());
    }
}
