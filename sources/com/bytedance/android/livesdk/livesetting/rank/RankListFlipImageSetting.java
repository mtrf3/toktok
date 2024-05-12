package com.bytedance.android.livesdk.livesetting.rank;

import X.C221108m2;
import X.C58507Mxj;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("rank_list_flip_image_setting")
/* loaded from: classes11.dex */
public final class RankListFlipImageSetting {
    public static final RankListFlipImageSetting INSTANCE = new RankListFlipImageSetting();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final C5H3 configValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C58507Mxj.LJLIL);

    private final boolean getConfigValue() {
        return ((Boolean) configValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getConfigValue();
    }
}
