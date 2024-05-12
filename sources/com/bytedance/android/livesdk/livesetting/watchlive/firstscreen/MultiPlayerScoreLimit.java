package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MultiPlayerScoreLimit {

    @InterfaceC65349Pkn("score_high")
    public float scoreHigh;

    @InterfaceC65349Pkn("score_low")
    public float scoreLow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiPlayerScoreLimit() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.MultiPlayerScoreLimit.<init>():void");
    }

    public MultiPlayerScoreLimit(float f, float f2) {
        this.scoreHigh = f;
        this.scoreLow = f2;
    }

    public /* synthetic */ MultiPlayerScoreLimit(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1.0f : f, (i & 2) != 0 ? -1.0f : f2);
    }
}
