package com.ss.android.ugc.aweme.bullet.utils;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class PreloadVideoConfigSize extends F9E {

    @InterfaceC65349Pkn("high_level")
    public final long highLevel;

    @InterfaceC65349Pkn("low_level")
    public final long lowLevel;

    @InterfaceC65349Pkn("mid_level")
    public final long midLevel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreloadVideoConfigSize() {
        /*
            r9 = this;
            r1 = 0
            r7 = 7
            r8 = 0
            r0 = r9
            r3 = r1
            r5 = r1
            r0.<init>(r1, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.utils.PreloadVideoConfigSize.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.lowLevel), Long.valueOf(this.midLevel), Long.valueOf(this.highLevel)};
    }

    public PreloadVideoConfigSize(long j, long j2, long j3) {
        this.lowLevel = j;
        this.midLevel = j2;
        this.highLevel = j3;
    }

    public /* synthetic */ PreloadVideoConfigSize(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 102400L : j, (i & 2) != 0 ? 204800L : j2, (i & 4) != 0 ? 307200L : j3);
    }
}
