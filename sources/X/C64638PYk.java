package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import defpackage.i0;
import java.util.regex.Pattern;

/* renamed from: X.PYk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64638PYk {
    public static final char[] LJIIJJI = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern LJIIL = PatternProtector.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String LIZ;
    public final C64626PXy LIZIZ;
    public String LIZJ;
    public C64627PXz LIZLLL;
    public final C64618PXq LJ = new C64618PXq();
    public final C64605PXd LJFF;
    public C39745Fin LJI;
    public final boolean LJII;
    public final C64552PVc LJIIIIZZ;
    public final C64629PYb LJIIIZ;
    public PVP LJIIJ;

    public final void LIZ(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.LJI = C39745Fin.LIZIZ(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(i0.LJFF("Malformed content type: ", str2), e);
            }
        }
        this.LJFF.LIZ(str, str2);
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        C64627PXz c64627PXz;
        String str3 = this.LIZJ;
        if (str3 != null) {
            C64626PXy c64626PXy = this.LIZIZ;
            c64626PXy.getClass();
            try {
                c64627PXz = new C64627PXz();
                c64627PXz.LJ(c64626PXy, str3);
            } catch (IllegalArgumentException unused) {
                c64627PXz = null;
            }
            this.LIZLLL = c64627PXz;
            if (c64627PXz != null) {
                this.LIZJ = null;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Malformed URL. Base: ");
                LIZ.append(this.LIZIZ);
                LIZ.append(", Relative: ");
                LIZ.append(this.LIZJ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        if (z) {
            this.LIZLLL.LIZ(str, str2);
        } else {
            this.LIZLLL.LIZIZ(str, str2);
        }
    }

    public C64638PYk(String str, C64626PXy c64626PXy, String str2, C64606PXe c64606PXe, C39745Fin c39745Fin, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = c64626PXy;
        this.LIZJ = str2;
        this.LJI = c39745Fin;
        this.LJII = z;
        if (c64606PXe != null) {
            this.LJFF = c64606PXe.LJI();
        } else {
            this.LJFF = new C64605PXd();
        }
        if (z2) {
            this.LJIIIZ = new C64629PYb();
        } else {
            if (!z3) {
                return;
            }
            C64552PVc c64552PVc = new C64552PVc();
            this.LJIIIIZZ = c64552PVc;
            c64552PVc.LIZJ(C64551PVb.LJFF);
        }
    }
}
