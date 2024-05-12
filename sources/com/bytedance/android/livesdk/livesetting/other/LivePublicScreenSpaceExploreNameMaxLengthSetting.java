package com.bytedance.android.livesdk.livesetting.other;

import X.C31299CQd;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_comment_user_name_max_length")
/* loaded from: classes6.dex */
public final class LivePublicScreenSpaceExploreNameMaxLengthSetting {
    public static final LivePublicScreenSpaceExploreNameMaxLengthSetting INSTANCE = new LivePublicScreenSpaceExploreNameMaxLengthSetting();
    public static final C5H3 v$delegate = C78996UzQ.LJJIJIIJI(C31299CQd.LJLIL);

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 15;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePublicScreenSpaceExploreNameMaxLengthSetting.class);
    }

    public final int getV() {
        return ((Number) v$delegate.getValue()).intValue();
    }

    public final int getNameMaxLength() {
        return getV();
    }
}
