package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C31812Ce8;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_like_opt")
/* loaded from: classes6.dex */
public final class LiveLikeOptSetting {
    public static final LiveLikeOptSetting INSTANCE = new LiveLikeOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final LikeOptModel DEFAULT = new LikeOptModel();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C31812Ce8.LJLIL);

    public final LikeOptModel getValue() {
        return (LikeOptModel) value$delegate.getValue();
    }

    public final int getLikeQueueCapacity() {
        return getValue().likeQueueCapacity;
    }

    public final boolean isInterpolatorReuse() {
        return getValue().interpolatorReuse;
    }

    public final boolean isLikeNumTextviewSizeFixedAndDisappearOpt() {
        return getValue().likeNumTextviewSizeFixed;
    }

    public final boolean isLikeShareTransference() {
        return getValue().likeShareTransference;
    }

    public final boolean isOtherTextViewWidthOpt() {
        return getValue().otherTextViewWidthOpt;
    }
}
