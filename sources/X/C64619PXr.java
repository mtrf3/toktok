package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.PXr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64619PXr {
    public static final C64619PXr LJIILIIL;
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public String LJIIL;

    static {
        C64620PXs c64620PXs = new C64620PXs();
        c64620PXs.LIZ = true;
        LJIILIIL = new C64619PXr(c64620PXs);
        C64620PXs c64620PXs2 = new C64620PXs();
        c64620PXs2.LIZJ = true;
        c64620PXs2.LIZ(TimeUnit.SECONDS);
        new C64619PXr(c64620PXs2);
    }

    public final String toString() {
        String str = this.LJIIL;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.LIZ) {
                sb.append("no-cache, ");
            }
            if (this.LIZIZ) {
                sb.append("no-store, ");
            }
            if (this.LIZJ != -1) {
                sb.append("max-age=");
                sb.append(this.LIZJ);
                sb.append(", ");
            }
            if (this.LIZLLL != -1) {
                sb.append("s-maxage=");
                sb.append(this.LIZLLL);
                sb.append(", ");
            }
            if (this.LJ) {
                sb.append("private, ");
            }
            if (this.LJFF) {
                sb.append("public, ");
            }
            if (this.LJI) {
                sb.append("must-revalidate, ");
            }
            if (this.LJII != -1) {
                sb.append("max-stale=");
                sb.append(this.LJII);
                sb.append(", ");
            }
            if (this.LJIIIIZZ != -1) {
                sb.append("min-fresh=");
                sb.append(this.LJIIIIZZ);
                sb.append(", ");
            }
            if (this.LJIIIZ) {
                sb.append("only-if-cached, ");
            }
            if (this.LJIIJ) {
                sb.append("no-transform, ");
            }
            if (this.LJIIJJI) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.LJIIL = str;
        }
        return str;
    }

    public C64619PXr(C64620PXs c64620PXs) {
        this.LIZ = c64620PXs.LIZ;
        c64620PXs.getClass();
        this.LIZIZ = false;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJII = c64620PXs.LIZIZ;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = c64620PXs.LIZJ;
        this.LJIIJ = false;
        this.LJIIJJI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C64619PXr LIZ(X.C64606PXe r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64619PXr.LIZ(X.PXe):X.PXr");
    }

    public C64619PXr(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = z6;
        this.LJIIJ = z7;
        this.LJIIJJI = z8;
        this.LJIIL = str;
    }
}
