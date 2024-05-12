package X;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FYB implements FYI {
    public FYF LIZIZ;
    public final java.util.Map<Integer, FYF> LIZJ;
    public FYF LIZLLL;
    public final HashMap<Integer, FYE> LJ;
    public FYE LJFF;
    public int LJI;
    public final boolean LJII;

    public FYB() {
        this(true);
    }

    public final String LIZ() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (this.LJII) {
            StringBuilder LIZ = X1D.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("main:");
            FYF fyf = this.LIZIZ;
            if (fyf != null) {
                str3 = fyf.LIZJ;
            } else {
                str3 = null;
            }
            LIZ2.append(str3);
            LIZ.append(X1D.LIZIZ(LIZ2));
            LIZ.append("|");
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("sub:");
            FYF fyf2 = this.LIZLLL;
            if (fyf2 != null) {
                str4 = fyf2.LIZJ;
            } else {
                str4 = null;
            }
            LIZ3.append(str4);
            LIZ.append(X1D.LIZIZ(LIZ3));
            LIZ.append("|");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("dialog:");
            FYE fye = this.LJFF;
            if (fye != null) {
                str5 = fye.LIZJ;
            }
            LIZ4.append(str5);
            LIZ.append(X1D.LIZIZ(LIZ4));
            LIZ.append("|");
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("scroll:");
            FYI.LIZ.getClass();
            LIZ5.append("IDLE");
            LIZ.append(X1D.LIZIZ(LIZ5));
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        …              .toString()");
            return LIZIZ;
        }
        StringBuilder LIZ6 = X1D.LIZ();
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("main:");
        FYF fyf3 = this.LIZIZ;
        if (fyf3 != null) {
            str = fyf3.LIZIZ;
        } else {
            str = null;
        }
        LIZ7.append(str);
        LIZ6.append(X1D.LIZIZ(LIZ7));
        LIZ6.append("|");
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("sub:");
        FYF fyf4 = this.LIZLLL;
        if (fyf4 != null) {
            str2 = fyf4.LIZIZ;
        } else {
            str2 = null;
        }
        LIZ8.append(str2);
        LIZ6.append(X1D.LIZIZ(LIZ8));
        LIZ6.append("|");
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append("dialog:");
        FYE fye2 = this.LJFF;
        if (fye2 != null) {
            str5 = fye2.LIZIZ;
        }
        LIZ9.append(str5);
        LIZ6.append(X1D.LIZIZ(LIZ9));
        LIZ6.append("|");
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append("scroll:");
        FYI.LIZ.getClass();
        LIZ10.append("IDLE");
        LIZ6.append(X1D.LIZIZ(LIZ10));
        String LIZIZ2 = X1D.LIZIZ(LIZ6);
        o.LJIIIIZZ(LIZIZ2, "StringBuilder()\n        …              .toString()");
        return LIZIZ2;
    }

    public FYB(boolean z) {
        this.LJII = z;
        this.LIZJ = new ConcurrentHashMap();
        this.LJ = new HashMap<>();
    }
}
