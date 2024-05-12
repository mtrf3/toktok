package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveKaraokeVocal {

    /* renamed from: default, reason: not valid java name */
    @InterfaceC65349Pkn("default")
    public float f8default;

    @InterfaceC65349Pkn("max")
    public float max;

    @InterfaceC65349Pkn("min")
    public float min;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveKaraokeVocal() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeVocal.<init>():void");
    }

    public LiveKaraokeVocal(float f, float f2, float f3) {
        this.max = f;
        this.min = f2;
        this.f8default = f3;
    }

    public /* synthetic */ LiveKaraokeVocal(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.5f : f3);
    }
}
