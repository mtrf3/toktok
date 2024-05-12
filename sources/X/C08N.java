package X;

import android.graphics.Typeface;

/* renamed from: X.08N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08N {
    public final C29361Dg LIZ;
    public final char[] LIZIZ;
    public final C08M LIZJ = new C08M(1024);
    public final Typeface LIZLLL;

    public C08N(Typeface typeface, C29361Dg c29361Dg) {
        int i;
        int i2;
        boolean z;
        this.LIZLLL = typeface;
        this.LIZ = c29361Dg;
        int LIZ = c29361Dg.LIZ(6);
        if (LIZ != 0) {
            int i3 = LIZ + c29361Dg.LIZ;
            i = c29361Dg.LIZIZ.getInt(c29361Dg.LIZIZ.getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.LIZIZ = new char[i * 2];
        int LIZ2 = c29361Dg.LIZ(6);
        if (LIZ2 != 0) {
            int i4 = LIZ2 + c29361Dg.LIZ;
            int i5 = c29361Dg.LIZIZ.getInt(c29361Dg.LIZIZ.getInt(i4) + i4);
            for (int i6 = 0; i6 < i5; i6++) {
                C08E c08e = new C08E(this, i6);
                C29351Df LIZJ = c08e.LIZJ();
                int LIZ3 = LIZJ.LIZ(4);
                if (LIZ3 != 0) {
                    i2 = LIZJ.LIZIZ.getInt(LIZ3 + LIZJ.LIZ);
                } else {
                    i2 = 0;
                }
                Character.toChars(i2, this.LIZIZ, i6 * 2);
                if (c08e.LIZIZ() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                TMC.LJI("invalid metadata codepoint length", z);
                this.LIZJ.LIZ(c08e, 0, c08e.LIZIZ() - 1);
            }
        }
    }
}
