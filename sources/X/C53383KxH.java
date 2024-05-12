package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KxH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53383KxH {
    public static C53382KxG LIZ() {
        if (C53382KxG.LIZJ == null || !o.LJ(C53382KxG.LIZIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
            synchronized (C53382KxG.class) {
                C53382KxG.LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
                C53382KxG.LIZJ = new C53382KxG();
            }
        }
        C53382KxG c53382KxG = C53382KxG.LIZJ;
        o.LJI(c53382KxG);
        return c53382KxG;
    }
}
