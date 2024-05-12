package com.bytedance.android.livesdk.performance.config;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PerfItemConfig {

    @InterfaceC65349Pkn("b")
    public float base;

    @InterfaceC65349Pkn("p_list")
    public List<ScorePiecewise> pieces;

    @InterfaceC65349Pkn("w")
    public float weight;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PerfItemConfig() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r0 = r6
            r3 = r2
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.config.PerfItemConfig.<init>():void");
    }

    public final float getBase() {
        return this.base;
    }

    public final List<ScorePiecewise> getPieces() {
        return this.pieces;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setBase(float f) {
        this.base = f;
    }

    public final void setPieces(List<ScorePiecewise> list) {
        this.pieces = list;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public PerfItemConfig(List<ScorePiecewise> list, float f, float f2) {
        this.pieces = list;
        this.base = f;
        this.weight = f2;
    }

    public /* synthetic */ PerfItemConfig(List list, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
    }
}
