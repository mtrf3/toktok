package com.bytedance.android.livesdk.performance.config;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ScorePiecewise {

    @InterfaceC65349Pkn("e")
    public float edge;

    @InterfaceC65349Pkn("f")
    public float factor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ScorePiecewise() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.config.ScorePiecewise.<init>():void");
    }

    public final float getEdge() {
        return this.edge;
    }

    public final float getFactor() {
        return this.factor;
    }

    public final void setEdge(float f) {
        this.edge = f;
    }

    public final void setFactor(float f) {
        this.factor = f;
    }

    public ScorePiecewise(float f, float f2) {
        this.edge = f;
        this.factor = f2;
    }

    public /* synthetic */ ScorePiecewise(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
