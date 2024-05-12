package com.bytedance.android.livesdk.livesetting.performance;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LikeAnimationOptModel {

    @InterfaceC65349Pkn("like_animation_dynamic_adjust")
    public boolean likeAnimationDynamicAdjust;

    @InterfaceC65349Pkn("like_animation_fluency_opt")
    public boolean likeAnimationFluencyOpt;

    @InterfaceC65349Pkn("like_animation_fps")
    public int likeAnimationFps;

    /* JADX WARN: Multi-variable type inference failed */
    public LikeAnimationOptModel() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    public LikeAnimationOptModel(boolean z, int i, boolean z2) {
        this.likeAnimationFluencyOpt = z;
        this.likeAnimationFps = i;
        this.likeAnimationDynamicAdjust = z2;
    }

    public /* synthetic */ LikeAnimationOptModel(boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 60 : i, (i2 & 4) != 0 ? false : z2);
    }
}
