package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.16a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C274816a {
    public final List<InterfaceC271214q> LIZ;
    public final C0GY LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final C16Y LJ;
    public final long LJFF;
    public final String LJI;
    public final List<C271614u> LJII;
    public final C38511fD LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final C44511ot LJIILLIIL;
    public final C268813s LJIIZILJ;
    public final C44451on LJIJ;
    public final List<C06780Ok<Float>> LJIJI;
    public final C16Z LJIJJ;

    public final String toString() {
        return LIZ("");
    }

    public final String LIZ(String str) {
        StringBuilder LIZJ = C278817o.LIZJ(str);
        LIZJ.append(this.LIZJ);
        LIZJ.append("\n");
        C274816a LJ = this.LIZIZ.LJI.LJ(this.LJFF, null);
        if (LJ != null) {
            LIZJ.append("\t\tParents: ");
            LIZJ.append(LJ.LIZJ);
            C274816a LJ2 = this.LIZIZ.LJI.LJ(LJ.LJFF, null);
            while (LJ2 != null) {
                LIZJ.append("->");
                LIZJ.append(LJ2.LIZJ);
                LJ2 = this.LIZIZ.LJI.LJ(LJ2.LJFF, null);
            }
            LIZJ.append(str);
            LIZJ.append("\n");
        }
        if (!this.LJII.isEmpty()) {
            LIZJ.append(str);
            LIZJ.append("\tMasks: ");
            DIL.LIZIZ(this.LJII, LIZJ, "\n");
        }
        if (this.LJIIIZ != 0 && this.LJIIJ != 0) {
            LIZJ.append(str);
            LIZJ.append("\tBackground: ");
            LIZJ.append(C16880lQ.LLLZI(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.LJIIIZ), Integer.valueOf(this.LJIIJ), Integer.valueOf(this.LJIIJJI)}));
        }
        if (!this.LIZ.isEmpty()) {
            LIZJ.append(str);
            LIZJ.append("\tShapes:\n");
            for (InterfaceC271214q interfaceC271214q : this.LIZ) {
                LIZJ.append(str);
                LIZJ.append("\t\t");
                LIZJ.append(interfaceC271214q);
                LIZJ.append("\n");
            }
        }
        return LIZJ.toString();
    }

    public C274816a(List<InterfaceC271214q> list, C0GY c0gy, String str, long j, C16Y c16y, long j2, String str2, List<C271614u> list2, C38511fD c38511fD, int i, int i2, int i3, float f, float f2, int i4, int i5, C44511ot c44511ot, C268813s c268813s, List<C06780Ok<Float>> list3, C16Z c16z, C44451on c44451on) {
        this.LIZ = list;
        this.LIZIZ = c0gy;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = c16y;
        this.LJFF = j2;
        this.LJI = str2;
        this.LJII = list2;
        this.LJIIIIZZ = c38511fD;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = i3;
        this.LJIIL = f;
        this.LJIILIIL = f2;
        this.LJIILJJIL = i4;
        this.LJIILL = i5;
        this.LJIILLIIL = c44511ot;
        this.LJIIZILJ = c268813s;
        this.LJIJI = list3;
        this.LJIJJ = c16z;
        this.LJIJ = c44451on;
    }
}
