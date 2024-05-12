package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C30166Bsg;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("disslike_secondary_option")
/* loaded from: classes6.dex */
public final class LiveDislikeVersion {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;

    @Group("v1")
    public static final int ONLINE = 0;

    @Group("v2")
    public static final int VERSION_A = 1;

    @Group("v3")
    public static final int VERSION_B = 2;

    @Group("v4")
    public static final int VERSION_C = 3;
    public static final LiveDislikeVersion INSTANCE = new LiveDislikeVersion();
    public static final C5H3 dislikeVersion$delegate = C221108m2.LIZIZ(C30166Bsg.LJLIL);

    private final int getDislikeVersion() {
        return ((Number) dislikeVersion$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return getDislikeVersion();
    }
}
