package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JDu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48814JDu {
    public static int LIZ() {
        return ((Number) C48812JDs.LJFF.getValue()).intValue();
    }

    public static C48812JDs LIZIZ(JE0 mode) {
        o.LJIIIZ(mode, "mode");
        int i = C48815JDv.LIZ[mode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (JDE.LIZIZ()) {
                    return new C48812JDs(JE0.SMALL, Integer.valueOf(Math.min(O6R.LJJIIZ(C32151Nz.LJIIZILJ(352)), (int) (LIZ() * 0.6f))), Integer.valueOf(Math.min(C7MY.LIZIZ(346), (int) (LIZ() * 0.6f))), 18);
                }
                return new C48812JDs(JE0.SMALL, AnonymousClass391.LIZJ(220), AnonymousClass391.LIZJ(220), 18);
            }
            throw new C162476Zf();
        }
        if (JDE.LIZIZ()) {
            return new C48812JDs(JE0.DEFAULT, Integer.valueOf(Math.min(C7MY.LIZIZ(598), LIZ())), Integer.valueOf(Math.min(C7MY.LIZIZ(588), LIZ())), 18);
        }
        return new C48812JDs(JE0.DEFAULT, C1FJ.LIZIZ(352), null, 26);
    }
}
