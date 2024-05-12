package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_cohost_micposition_fixed_map_bugfix")
/* loaded from: classes6.dex */
public final class LinkMicCohostMicPositionFixedMapBugFix {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicCohostMicPositionFixedMapBugFix INSTANCE = new LinkMicCohostMicPositionFixedMapBugFix();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicCohostMicPositionFixedMapBugFix.class);
    }
}
