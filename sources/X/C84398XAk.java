package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XAk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84398XAk {
    public static C84397XAj LIZ() {
        Object obj = C84397XAj.LJIIIZ.LIZ;
        if (obj != null) {
            return (C84397XAj) obj;
        }
        throw new RuntimeException("Please initialize AlgorithmRepository first!");
    }

    public static C84397XAj LIZIZ(XCG effectConfig) {
        o.LJIIJ(effectConfig, "effectConfig");
        C0FT c0ft = C84397XAj.LJIIIZ;
        if (c0ft.LIZ == null) {
            c0ft.LIZ = new C84397XAj(effectConfig);
        }
        return LIZ();
    }
}
