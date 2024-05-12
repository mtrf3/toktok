package X;

import kotlin.jvm.internal.o;

/* renamed from: X.58p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1300758p {
    public static int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final boolean LJI;
    public static final int LJII;
    public static final int LJIIIIZZ;
    public static final int LJIIIZ;

    static {
        int i;
        int LIZ2;
        Integer num;
        Integer num2;
        int LIZ3 = C134845Qy.LIZ(48.0f);
        LIZ = 1000;
        LIZIZ = C134845Qy.LIZ(18.0f);
        Integer num3 = null;
        if (C1291054w.LJ().LJIJJLI != null && Integer.valueOf(C134855Qz.LIZ(r0.intValue())) != null) {
            if (C1291054w.LJ().LJIJJLI != null) {
                num2 = Integer.valueOf(C134855Qz.LIZ(r0.intValue()));
            } else {
                num2 = null;
            }
            o.LJI(num2);
            LIZ3 = num2.intValue();
        }
        LIZJ = LIZ3;
        if (C1291054w.LJ().LJIJJ != null && Integer.valueOf(C134855Qz.LIZ(r0.intValue())) != null) {
            if (C1291054w.LJ().LJIJJ != null) {
                num = Integer.valueOf(C134855Qz.LIZ(r0.intValue()));
            } else {
                num = null;
            }
            o.LJI(num);
            i = num.intValue();
        } else {
            i = LIZ3;
        }
        LIZLLL = i;
        C134845Qy.LIZ(20.0f);
        C134845Qy.LIZ(1.0f);
        C134845Qy.LIZ(26.0f);
        C134845Qy.LIZ(50.0f);
        if (C1291054w.LJ().LJJI != null && Integer.valueOf(C134855Qz.LIZ(r0.intValue())) != null) {
            if (C1291054w.LJ().LJJI != null) {
                num3 = Integer.valueOf(C134855Qz.LIZ(r0.intValue()));
            }
            o.LJI(num3);
            LIZ2 = num3.intValue();
        } else {
            LIZ2 = C134845Qy.LIZ(32.0f);
        }
        LJ = LIZ2;
        LJFF = C134845Qy.LIZ(C1291054w.LJ().LJIJI);
        C134845Qy.LIZ(3.0f);
        LJI = true;
        LJII = C134845Qy.LIZ(5.0f);
        LJIIIIZZ = (int) (LIZ3 * 1.5d);
        LJIIIZ = C134845Qy.LIZJ(C58S.LIZ());
    }

    public static float LIZIZ() {
        return LIZJ / LIZ;
    }

    public static float LIZ(float f, int i) {
        if (f >= i / 2) {
            f = i - f;
        }
        float f2 = LJIIIIZZ;
        if (f >= f2) {
            return 1.0f;
        }
        return 1.0f + (((f2 - f) / f2) * 4);
    }
}
