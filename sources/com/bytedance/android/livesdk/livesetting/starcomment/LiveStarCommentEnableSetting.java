package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C221108m2;
import X.C5H3;
import X.CVD;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_star_comment_enable_setting")
/* loaded from: classes6.dex */
public final class LiveStarCommentEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveStarCommentEnableSetting INSTANCE = new LiveStarCommentEnableSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CVD.LJLIL);

    public final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }
}
