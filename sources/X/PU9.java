package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PU9 {
    public static PUA LIZ() {
        PUA pua = PUA.LJIIIZ;
        if (pua != null) {
            PUA pua2 = pua.LJFF;
            if (pua2 == null) {
                long nanoTime = System.nanoTime();
                PUA.class.wait(PUA.LJII);
                PUA pua3 = PUA.LJIIIZ;
                if (pua3 != null) {
                    if (pua3.LJFF != null || System.nanoTime() - nanoTime < PUA.LJIIIIZZ) {
                        return null;
                    }
                    return PUA.LJIIIZ;
                }
                o.LJIIZILJ();
                throw null;
            }
            long nanoTime2 = pua2.LJI - System.nanoTime();
            if (nanoTime2 > 0) {
                long j = nanoTime2 / 1000000;
                PUA.class.wait(j, (int) (nanoTime2 - (1000000 * j)));
                return null;
            }
            PUA pua4 = PUA.LJIIIZ;
            if (pua4 != null) {
                pua4.LJFF = pua2.LJFF;
                pua2.LJFF = null;
                return pua2;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }
}
