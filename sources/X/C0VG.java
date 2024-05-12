package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0VG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VG {
    public final C0VF LIZ;
    public final C08490Uz LIZIZ;
    public final long LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final List<C10390ax> LJFF;

    public final boolean LIZLLL() {
        float f = (int) (this.LIZJ >> 32);
        C08490Uz c08490Uz = this.LIZIZ;
        if (f < c08490Uz.LIZLLL || c08490Uz.LIZJ || C23490w5.LIZIZ(r3) < this.LIZIZ.LJ) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.LJFF.hashCode() + C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, JBR.LIZJ(this.LIZJ, (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextLayoutResult(layoutInput=");
        LIZ.append(this.LIZ);
        LIZ.append(", multiParagraph=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", size=");
        LIZ.append((Object) C23490w5.LIZJ(this.LIZJ));
        LIZ.append(", firstBaseline=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", lastBaseline=");
        LIZ.append(this.LJ);
        LIZ.append(", placeholderRects=");
        return C1NE.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public final EnumC22040tk LIZ(int i) {
        int LJIILJJIL;
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZJ(i);
        if (i == c08490Uz.LIZ.LIZ.length()) {
            LJIILJJIL = C47261Igj.LJJI(c08490Uz.LJII);
        } else {
            LJIILJJIL = C45804HyK.LJIILJJIL(i, c08490Uz.LJII);
        }
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, LJIILJJIL);
        return c1nc.LJLIL.LJIJI(c1nc.M(i));
    }

    public final C10390ax LIZIZ(int i) {
        C08490Uz c08490Uz = this.LIZIZ;
        if (i >= 0 && i < c08490Uz.LIZ.LIZ.LJLIL.length()) {
            C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, C45804HyK.LJIILJJIL(i, c08490Uz.LJII));
            return c1nc.L(c1nc.LJLIL.LJII(c1nc.M(i)));
        }
        c08490Uz.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("offset(");
        LIZ.append(i);
        LIZ.append(") is out of bounds [0, ");
        LIZ.append(c08490Uz.LIZ.LIZ.length());
        LIZ.append(')');
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final C10390ax LIZJ(int i) {
        int LJIILJJIL;
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZJ(i);
        if (i == c08490Uz.LIZ.LIZ.length()) {
            LJIILJJIL = C47261Igj.LJJI(c08490Uz.LJII);
        } else {
            LJIILJJIL = C45804HyK.LJIILJJIL(i, c08490Uz.LJII);
        }
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, LJIILJJIL);
        return c1nc.L(c1nc.LJLIL.LJ(c1nc.M(i)));
    }

    public final float LJ(int i) {
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZLLL(i);
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, C45804HyK.LJIILL(i, c08490Uz.LJII));
        return c1nc.LJLIL.LJIILL(i - c1nc.LJLJJI) + c1nc.LJLJJLL;
    }

    public final int LJI(int i) {
        int LJIILJJIL;
        C08490Uz c08490Uz = this.LIZIZ;
        if (i >= c08490Uz.LIZ.LIZ.length()) {
            LJIILJJIL = C47261Igj.LJJI(c08490Uz.LJII);
        } else if (i < 0) {
            LJIILJJIL = 0;
        } else {
            LJIILJJIL = C45804HyK.LJIILJJIL(i, c08490Uz.LJII);
        }
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, LJIILJJIL);
        return c1nc.LJLIL.LJI(c1nc.M(i)) + c1nc.LJLJJI;
    }

    public final int LJII(float f) {
        int LJIIZILJ;
        C08490Uz c08490Uz = this.LIZIZ;
        if (f <= 0.0f) {
            LJIIZILJ = 0;
        } else if (f >= c08490Uz.LJ) {
            LJIIZILJ = C47261Igj.LJJI(c08490Uz.LJII);
        } else {
            LJIIZILJ = C45804HyK.LJIIZILJ(c08490Uz.LJII, f);
        }
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, LJIIZILJ);
        int i = c1nc.LJLJI;
        int i2 = c1nc.LJLILLLLZI;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        return c1nc.LJLIL.LJIIL(f - c1nc.LJLJJLL) + c1nc.LJLJJI;
    }

    public final float LJIIIIZZ(int i) {
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZLLL(i);
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, C45804HyK.LJIILL(i, c08490Uz.LJII));
        return c1nc.LJLIL.LJIILIIL(i - c1nc.LJLJJI);
    }

    public final float LJIIIZ(int i) {
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZLLL(i);
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, C45804HyK.LJIILL(i, c08490Uz.LJII));
        return c1nc.LJLIL.LJIILLIIL(i - c1nc.LJLJJI);
    }

    public final int LJIIJ(int i) {
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZLLL(i);
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, C45804HyK.LJIILL(i, c08490Uz.LJII));
        return c1nc.LJLIL.LIZLLL(i - c1nc.LJLJJI) + c1nc.LJLILLLLZI;
    }

    public final float LJIIJJI(int i) {
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZLLL(i);
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, C45804HyK.LJIILL(i, c08490Uz.LJII));
        return c1nc.LJLIL.LIZIZ(i - c1nc.LJLJJI) + c1nc.LJLJJLL;
    }

    public final int LJIIL(long j) {
        int LJIIZILJ;
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.getClass();
        if (C10370av.LJ(j) <= 0.0f) {
            LJIIZILJ = 0;
        } else if (C10370av.LJ(j) >= c08490Uz.LJ) {
            LJIIZILJ = C47261Igj.LJJI(c08490Uz.LJII);
        } else {
            LJIIZILJ = C45804HyK.LJIIZILJ(c08490Uz.LJII, C10370av.LJ(j));
        }
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, LJIIZILJ);
        int i = c1nc.LJLJI;
        int i2 = c1nc.LJLILLLLZI;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        return c1nc.LJLIL.LJIIJ(C78923UyF.LIZ(C10370av.LIZLLL(j), C10370av.LJ(j) - c1nc.LJLJJLL)) + c1nc.LJLILLLLZI;
    }

    public final EnumC22040tk LJIILIIL(int i) {
        int LJIILJJIL;
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZJ(i);
        if (i == c08490Uz.LIZ.LIZ.length()) {
            LJIILJJIL = C47261Igj.LJJI(c08490Uz.LJII);
        } else {
            LJIILJJIL = C45804HyK.LJIILJJIL(i, c08490Uz.LJII);
        }
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, LJIILJJIL);
        return c1nc.LJLIL.LIZ(c1nc.M(i));
    }

    public final long LJIILJJIL(int i) {
        int LJIILJJIL;
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZJ(i);
        if (i == c08490Uz.LIZ.LIZ.length()) {
            LJIILJJIL = C47261Igj.LJJI(c08490Uz.LJII);
        } else {
            LJIILJJIL = C45804HyK.LJIILJJIL(i, c08490Uz.LJII);
        }
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, LJIILJJIL);
        long LJIIIZ = c1nc.LJLIL.LJIIIZ(c1nc.M(i));
        return C17N.LIZLLL(((int) (LJIIIZ >> 32)) + c1nc.LJLILLLLZI, C08350Ul.LIZJ(LJIIIZ) + c1nc.LJLILLLLZI);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VG)) {
            return false;
        }
        C0VG c0vg = (C0VG) obj;
        if (o.LJ(this.LIZ, c0vg.LIZ) && o.LJ(this.LIZIZ, c0vg.LIZIZ) && C23490w5.LIZ(this.LIZJ, c0vg.LIZJ) && this.LIZLLL == c0vg.LIZLLL && this.LJ == c0vg.LJ && o.LJ(this.LJFF, c0vg.LJFF)) {
            return true;
        }
        return false;
    }

    public final int LJFF(int i, boolean z) {
        C08490Uz c08490Uz = this.LIZIZ;
        c08490Uz.LIZLLL(i);
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, C45804HyK.LJIILL(i, c08490Uz.LJII));
        return c1nc.LJLIL.LJIIJJI(i - c1nc.LJLJJI, z) + c1nc.LJLILLLLZI;
    }

    public C0VG(C0VF c0vf, C08490Uz c08490Uz, long j) {
        float LIZJ;
        this.LIZ = c0vf;
        this.LIZIZ = c08490Uz;
        this.LIZJ = j;
        float f = 0.0f;
        if (((ArrayList) c08490Uz.LJII).isEmpty()) {
            LIZJ = 0.0f;
        } else {
            LIZJ = ((C1NC) ListProtector.get(c08490Uz.LJII, 0)).LJLIL.LIZJ();
        }
        this.LIZLLL = LIZJ;
        if (!((ArrayList) c08490Uz.LJII).isEmpty()) {
            C1NC c1nc = (C1NC) ORZ.LLFF(c08490Uz.LJII);
            f = c1nc.LJLIL.LJFF() + c1nc.LJLJJLL;
        }
        this.LJ = f;
        this.LJFF = c08490Uz.LJI;
    }
}
