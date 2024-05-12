package X;

/* renamed from: X.WkW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83168WkW {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(C83169WkX c83169WkX) {
        float f;
        int i;
        if (c83169WkX.LIZ) {
            int i2 = c83169WkX.LJFF;
            if (i2 >= 0) {
                f = i2 / 50.0f;
                i = c83169WkX.LIZJ;
            } else {
                f = i2 / (-50.0f);
                i = c83169WkX.LIZLLL;
            }
            return f * i;
        }
        int i3 = c83169WkX.LIZJ;
        return (((i3 - r2) / 100.0f) * c83169WkX.LJFF) + c83169WkX.LIZLLL;
    }

    public static C83169WkX LIZIZ(C83169WkX c83169WkX) {
        boolean z = false;
        C83169WkX c83169WkX2 = new C83169WkX(false, 0, 0, 0.0f, 0, 0.0f, 2047);
        if (c83169WkX.LIZ) {
            c83169WkX2.LIZIZ = 50;
            float f = c83169WkX.LJ;
            if (f >= 0) {
                c83169WkX2.LJFF = (int) C43881HKb.LIZ(f, c83169WkX.LIZJ, 50.0f, 0.5f);
            } else {
                c83169WkX2.LJFF = -((int) C43881HKb.LIZ(f, c83169WkX.LIZLLL, 50.0f, 0.5f));
            }
            if (c83169WkX2.LJFF == 0) {
                z = true;
            }
            c83169WkX2.LJI = z;
        } else {
            c83169WkX2.LIZIZ = 100;
            int LIZ2 = (int) C43881HKb.LIZ(c83169WkX.LJ - c83169WkX.LIZLLL, c83169WkX.LIZJ - r1, 100.0f, 0.5f);
            c83169WkX2.LJFF = LIZ2;
            if (LIZ2 == 0) {
                z = true;
            }
            c83169WkX2.LJI = z;
        }
        return c83169WkX2;
    }
}
