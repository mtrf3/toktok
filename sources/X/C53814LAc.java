package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LAc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53814LAc {
    public static C53813LAb LIZ() {
        if (C53813LAb.LIZJ == null || !o.LJ(C53813LAb.LIZIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
            synchronized (C53813LAb.class) {
                C53813LAb.LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
                C53813LAb.LIZJ = new C53813LAb();
            }
        }
        C53813LAb c53813LAb = C53813LAb.LIZJ;
        o.LJI(c53813LAb);
        return c53813LAb;
    }
}
