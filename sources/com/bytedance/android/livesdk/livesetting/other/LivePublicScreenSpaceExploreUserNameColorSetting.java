package com.bytedance.android.livesdk.livesetting.other;

import X.C15380j0;
import X.C5H3;
import X.C6V;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_comment_user_name_color")
/* loaded from: classes6.dex */
public final class LivePublicScreenSpaceExploreUserNameColorSetting {
    public static final int defaultColor = 0;
    public static final LivePublicScreenSpaceExploreUserNameColorSetting INSTANCE = new LivePublicScreenSpaceExploreUserNameColorSetting();
    public static final C5H3 v$delegate = C78996UzQ.LJJIJIIJI(C6V.LJLIL);

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "#FFADAD";

    public static final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePublicScreenSpaceExploreUserNameColorSetting.class);
    }

    public final String getV() {
        return (String) v$delegate.getValue();
    }

    public final int getNameColor() {
        return C15380j0.LIZJ(defaultColor, getV());
    }
}
