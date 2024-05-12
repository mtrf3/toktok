package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class Q9J {
    public static boolean LIZ(Q9H q9h) {
        int LJIIJ = q9h.LJIIJ();
        if (LJIIJ == 0) {
            return false;
        }
        if (LJIIJ == 1) {
            return true;
        }
        throw new IOException(C16880lQ.LLLZ("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(LJIIJ)}));
    }

    public static String LIZIZ(Q9H q9h) {
        return q9h.LIZ.LJJIFFI(q9h.LIZIZ());
    }

    public static void LIZJ(Q9H q9h) {
        int i = q9h.LJII;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        q9h.LJIIIIZZ();
                        return;
                    }
                    throw new IllegalStateException("Unexpected field encoding found!");
                }
                q9h.LJII();
                return;
            }
            q9h.LJIIIZ();
            return;
        }
        q9h.LJIIJJI();
    }
}
