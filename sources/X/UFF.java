package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UFF<T1, T2, R> implements RTU {
    public static final UFF<T1, T2, R> LJLIL = new UFF<>();

    @Override // X.RTU
    public final Object apply(Object obj, Object obj2) {
        String t1 = (String) obj;
        String t2 = (String) obj2;
        o.LJIIIZ(t1, "t1");
        o.LJIIIZ(t2, "t2");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(t1);
        LIZ.append(t2);
        return X1D.LIZIZ(LIZ);
    }
}
