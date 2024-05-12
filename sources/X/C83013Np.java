package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Np, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83013Np {
    public static final C83003No LIZ = C83003No.LJLIL;

    public static void LIZ() {
        boolean z;
        C96423qQ.LIZ();
        if (C4Z2.LJIIZILJ()) {
            boolean LIZIZ = C92333jp.LIZIZ();
            if (((Number) C3QY.LIZ.getValue()).intValue() == 0 || C3P4.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            boolean LIZ2 = C83403Pc.LIZ();
            List LJJIJIL = C47261Igj.LJJIJIL(0);
            if (LIZIZ) {
                LJJIJIL.add(1);
            }
            if (z) {
                LJJIJIL.add(2);
            }
            if (LIZ2) {
                LJJIJIL.add(3);
            }
            int[] LLJ = ORZ.LLJ(LJJIJIL);
            int[] oldInbox = C82873Nb.LJIIIZ().LIZ;
            C3QU LJIIIZ = C82873Nb.LJIIIZ();
            LJIIIZ.getClass();
            LJIIIZ.LIZ = LLJ;
            C3QU LJIIIZ2 = C82873Nb.LJIIIZ();
            LJIIIZ2.getClass();
            LJIIIZ2.LIZIZ = LLJ;
            C96423qQ.LIZ();
            C4Z2.LJIL(LLJ);
            C96423qQ.LIZ();
            C4Z2.LJJI(LLJ);
            o.LJIIIZ(oldInbox, "oldInbox");
            if (LLJ.length == 0 || oldInbox.length == 0) {
                return;
            }
            for (int i : LLJ) {
                if (i == 2) {
                    for (int i2 : oldInbox) {
                        if (i2 == 2) {
                            return;
                        }
                    }
                    ((C4Z2) C96423qQ.LIZ()).LJIJJ();
                    return;
                }
            }
        }
    }
}
