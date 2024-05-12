package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import X.C221108m2;
import X.C29124Bbs;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("add_live_slardar_tag")
/* loaded from: classes6.dex */
public final class LiveSlardarTagSetting {
    public static final LiveSlardarTagSetting INSTANCE = new LiveSlardarTagSetting();

    @Group(isDefault = true, value = "default group")
    public static final SlardarTagData DEFAULT = new SlardarTagData(false, 0, 0, 7, null);
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(C29124Bbs.LJLIL);

    public final SlardarTagData getCurrentValue() {
        return (SlardarTagData) currentValue$delegate.getValue();
    }

    public final SlardarTagData getDEFAULT() {
        return DEFAULT;
    }
}
