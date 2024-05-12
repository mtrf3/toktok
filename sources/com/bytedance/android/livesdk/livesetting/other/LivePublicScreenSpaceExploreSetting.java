package com.bytedance.android.livesdk.livesetting.other;

import X.C31300CQe;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_comment_opt_field_enable")
/* loaded from: classes6.dex */
public final class LivePublicScreenSpaceExploreSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenSpaceExploreSetting INSTANCE = new LivePublicScreenSpaceExploreSetting();
    public static final C5H3 v$delegate = C78996UzQ.LJJIJIIJI(C31300CQe.LJLIL);

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePublicScreenSpaceExploreSetting.class);
    }

    public final boolean getV() {
        return ((Boolean) v$delegate.getValue()).booleanValue();
    }

    public final boolean optEnable() {
        return getV();
    }
}
