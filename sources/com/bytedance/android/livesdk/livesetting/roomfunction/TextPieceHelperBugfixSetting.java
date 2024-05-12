package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C221108m2;
import X.C5H3;
import X.CXN;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("text_piece_helper_bugfix_setting")
/* loaded from: classes6.dex */
public final class TextPieceHelperBugfixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TextPieceHelperBugfixSetting INSTANCE = new TextPieceHelperBugfixSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CXN.LJLIL);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
