package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235239Lb {
    public static C235229La LIZ() {
        if (C235229La.LIZJ == null || !o.LJ(C235229La.LIZIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
            synchronized (C235229La.class) {
                C235229La.LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
                C235229La.LIZJ = new C235229La();
            }
        }
        C235229La c235229La = C235229La.LIZJ;
        o.LJI(c235229La);
        return c235229La;
    }
}
