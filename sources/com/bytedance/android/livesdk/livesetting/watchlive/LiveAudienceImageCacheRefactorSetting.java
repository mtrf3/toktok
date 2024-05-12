package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C31297CQb;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("audience_image_cache_refactor_enable")
/* loaded from: classes6.dex */
public final class LiveAudienceImageCacheRefactorSetting {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveAudienceImageCacheRefactorSetting INSTANCE = new LiveAudienceImageCacheRefactorSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C31297CQb.LJLIL);
    public static int avatarHeight = -1;
    public static int avatarHeightExtendedScreen = -1;

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final int getAvatarHeight() {
        return avatarHeight;
    }

    public final int getAvatarHeightExtendedScreen() {
        return avatarHeightExtendedScreen;
    }

    public final void setAvatarHeight(int i) {
        avatarHeight = i;
    }

    public final void setAvatarHeightExtendedScreen(int i) {
        avatarHeightExtendedScreen = i;
    }
}
