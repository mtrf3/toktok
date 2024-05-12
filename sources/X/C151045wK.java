package X;

import android.graphics.Rect;

/* renamed from: X.5wK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151045wK {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZIZ(int i) {
        float f;
        if (i != -1 && i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 1.0f;
                }
                if (i != 3) {
                    if (i != 4) {
                        return 0.0f;
                    }
                    f = C151105wQ.LJIIIZ;
                } else {
                    return 0.75f;
                }
            } else {
                return 1.3333334f;
            }
        } else {
            f = C151105wQ.LIZJ;
        }
        return 1.0f / f;
    }

    public static Rect LIZ(float f, float f2, int i, int i2) {
        int i3;
        int LIZJ = (i2 - C151105wQ.LJFF) - ((int) KL2.LIZJ(C60903NvH.LJ, 190.0f));
        int LIZJ2 = i - ((int) KL2.LIZJ(C60903NvH.LJ, 32.0f));
        float f3 = LIZJ2;
        float f4 = LIZJ;
        if (f2 > f3 / f4) {
            i3 = (int) (f3 / f2);
        } else {
            LIZJ2 = (int) (f4 * f2);
            i3 = LIZJ;
        }
        if (f > f2) {
            i3 = (int) (LIZJ2 / f);
        } else {
            LIZJ2 = (int) (f * i3);
        }
        int i4 = (i - LIZJ2) / 2;
        int i5 = (((LIZJ - i3) / 2) + C151105wQ.LJFF) - C151105wQ.LJ;
        return new Rect(i4, i5, LIZJ2 + i4, i3 + i5);
    }
}
