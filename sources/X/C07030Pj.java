package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07030Pj {
    public static <V extends C0Q9> long LIZ(C1J0<V> c1j0, V initialValue, V targetValue, V initialVelocity) {
        o.LJIIIZ(c1j0, "this");
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        return (c1j0.LJI() + c1j0.LJFF()) * 1000000;
    }

    public static <V extends C0Q9> V LIZIZ(C1J0<V> c1j0, V initialValue, V targetValue, V initialVelocity) {
        o.LJIIIZ(c1j0, "this");
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        return (V) C0QE.LIZ(c1j0, initialValue, targetValue, initialVelocity);
    }
}
