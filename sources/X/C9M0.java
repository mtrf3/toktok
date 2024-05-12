package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9M0, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9M0 {
    public static C235479Lz LIZ() {
        if (C235479Lz.LIZLLL == null || !o.LJ(C235479Lz.LIZJ, ((RBX) HG3.LJIILL()).getCurUserId())) {
            synchronized (C235479Lz.class) {
                C235479Lz.LIZJ = ((RBX) HG3.LJIILL()).getCurUserId();
                C235479Lz.LIZLLL = new C235479Lz();
            }
        }
        C235479Lz c235479Lz = C235479Lz.LIZLLL;
        if (c235479Lz != null) {
            return c235479Lz;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
