package com.ss.android.ugc.aweme.bullet.utils;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class PreloadVideoConfigAndroidScore extends F9E {

    @InterfaceC65349Pkn("high_level")
    public final float highLevel;

    @InterfaceC65349Pkn("low_level")
    public final float lowLevel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreloadVideoConfigAndroidScore() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.utils.PreloadVideoConfigAndroidScore.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.lowLevel), Float.valueOf(this.highLevel)};
    }

    public PreloadVideoConfigAndroidScore(float f, float f2) {
        this.lowLevel = f;
        this.highLevel = f2;
    }

    public /* synthetic */ PreloadVideoConfigAndroidScore(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 6.0f : f, (i & 2) != 0 ? 8.0f : f2);
    }
}
