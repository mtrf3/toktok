package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UQ2 {
    public static UQ3 LIZ() {
        if (UQ3.LIZJ == null || !o.LJ(UQ3.LIZIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
            synchronized (UQ3.class) {
                UQ3.LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
                UQ3.LIZJ = new UQ3();
            }
        }
        UQ3 uq3 = UQ3.LIZJ;
        o.LJI(uq3);
        return uq3;
    }
}
