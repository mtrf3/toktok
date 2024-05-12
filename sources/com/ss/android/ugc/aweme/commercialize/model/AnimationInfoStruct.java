package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AnimationInfoStruct implements Serializable {

    @InterfaceC65349Pkn("animation_seconds")
    public final int animationSeconds;

    @InterfaceC65349Pkn("target_height")
    public final int targetHeight;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnimationInfoStruct() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.AnimationInfoStruct.<init>():void");
    }

    public final int getAnimationSeconds() {
        return this.animationSeconds;
    }

    public final int getTargetHeight() {
        return this.targetHeight;
    }

    public AnimationInfoStruct(int i, int i2) {
        this.animationSeconds = i;
        this.targetHeight = i2;
    }

    public /* synthetic */ AnimationInfoStruct(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
