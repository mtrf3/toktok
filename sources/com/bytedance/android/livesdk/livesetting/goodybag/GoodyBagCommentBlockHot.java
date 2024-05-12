package com.bytedance.android.livesdk.livesetting.goodybag;

import X.C221108m2;
import X.C5H3;
import X.CIM;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_goody_bag_comment_block_hot_word_enable")
/* loaded from: classes6.dex */
public final class GoodyBagCommentBlockHot {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final GoodyBagCommentBlockHot INSTANCE = new GoodyBagCommentBlockHot();
    public static final C5H3 getStickValue$delegate = C221108m2.LIZIZ(CIM.LJLIL);

    public final boolean getGetStickValue() {
        return ((Boolean) getStickValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GoodyBagCommentBlockHot.class);
    }
}
