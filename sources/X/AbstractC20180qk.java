package X;

import X.AbstractC20180qk;
import java.text.BreakIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.0qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20180qk<T extends AbstractC20180qk<T>> {
    public final C08440Uu LIZ;
    public final long LIZIZ;
    public final C0VG LIZJ;
    public final InterfaceC14950iJ LIZLLL;
    public final C20210qn LJ;
    public long LJFF;
    public final C08440Uu LJI;

    public final Integer LIZ() {
        C0VG c0vg = this.LIZJ;
        if (c0vg != null) {
            return Integer.valueOf(this.LIZLLL.LIZ(c0vg.LJFF(c0vg.LJI(this.LIZLLL.LIZIZ(C08350Ul.LIZLLL(this.LJFF))), true)));
        }
        return null;
    }

    public final Integer LIZIZ() {
        C0VG c0vg = this.LIZJ;
        if (c0vg != null) {
            return Integer.valueOf(this.LIZLLL.LIZ(c0vg.LJIIJ(c0vg.LJI(this.LIZLLL.LIZIZ(C08350Ul.LJ(this.LJFF))))));
        }
        return null;
    }

    public final boolean LJ() {
        EnumC22040tk enumC22040tk;
        C0VG c0vg = this.LIZJ;
        if (c0vg != null) {
            enumC22040tk = c0vg.LJIILIIL(C08350Ul.LIZJ(this.LJFF));
        } else {
            enumC22040tk = null;
        }
        if (enumC22040tk != EnumC22040tk.Rtl) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            if (LJ()) {
                LJIIJJI();
            } else {
                LJIIIIZZ();
            }
        }
    }

    public final void LJII() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            if (LJ()) {
                LJIILIIL();
            } else {
                LJIIJ();
            }
        }
    }

    public final void LJIIIIZZ() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            String str = this.LJI.LJLIL;
            int LIZJ = C08350Ul.LIZJ(this.LJFF);
            o.LJIIIZ(str, "<this>");
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int following = characterInstance.following(LIZJ);
            if (following != -1) {
                LJIL(following, following);
            }
        }
    }

    public final void LJIIIZ() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            int LIZ = C18520o4.LIZ(C08350Ul.LIZLLL(this.LJFF), this.LJI.LJLIL);
            LJIL(LIZ, LIZ);
        }
    }

    public final void LJIIJ() {
        C0VG c0vg;
        Integer valueOf;
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0 && (c0vg = this.LIZJ) != null && (valueOf = Integer.valueOf(LIZJ(c0vg, this.LIZLLL.LIZIZ(C08350Ul.LIZJ(this.LJFF))))) != null) {
            int intValue = valueOf.intValue();
            LJIL(intValue, intValue);
        }
    }

    public final void LJIIJJI() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            String str = this.LJI.LJLIL;
            int LIZJ = C08350Ul.LIZJ(this.LJFF);
            o.LJIIIZ(str, "<this>");
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int preceding = characterInstance.preceding(LIZJ);
            if (preceding != -1) {
                LJIL(preceding, preceding);
            }
        }
    }

    public final void LJIIL() {
        this.LJ.LIZ = null;
        int i = 0;
        if (this.LJI.LJLIL.length() > 0) {
            String str = this.LJI.LJLIL;
            int LJ = C08350Ul.LJ(this.LJFF);
            o.LJIIIZ(str, "<this>");
            int i2 = LJ - 1;
            while (true) {
                if (i2 <= 0) {
                    break;
                }
                int i3 = i2 - 1;
                if (str.charAt(i3) == '\n') {
                    i = i2;
                    break;
                }
                i2 = i3;
            }
            LJIL(i, i);
        }
    }

    public final void LJIILIIL() {
        C0VG c0vg;
        Integer valueOf;
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0 && (c0vg = this.LIZJ) != null && (valueOf = Integer.valueOf(LIZLLL(c0vg, this.LIZLLL.LIZIZ(C08350Ul.LIZJ(this.LJFF))))) != null) {
            int intValue = valueOf.intValue();
            LJIL(intValue, intValue);
        }
    }

    public final void LJIILJJIL() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            if (LJ()) {
                LJIIIIZZ();
            } else {
                LJIIJJI();
            }
        }
    }

    public final void LJIILL() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            if (LJ()) {
                LJIIJ();
            } else {
                LJIILIIL();
            }
        }
    }

    public final void LJIILLIIL() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            int length = this.LJI.LJLIL.length();
            LJIL(length, length);
        }
    }

    public final void LJIIZILJ() {
        Integer LIZ;
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0 && (LIZ = LIZ()) != null) {
            int intValue = LIZ.intValue();
            LJIL(intValue, intValue);
        }
    }

    public final void LJIJ() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            if (LJ()) {
                LJIJJ();
            } else {
                LJIIZILJ();
            }
        }
    }

    public final void LJIJI() {
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0) {
            if (LJ()) {
                LJIIZILJ();
            } else {
                LJIJJ();
            }
        }
    }

    public final void LJIJJ() {
        Integer LIZIZ;
        this.LJ.LIZ = null;
        if (this.LJI.LJLIL.length() > 0 && (LIZIZ = LIZIZ()) != null) {
            int intValue = LIZIZ.intValue();
            LJIL(intValue, intValue);
        }
    }

    public final void LJIJJLI() {
        if (this.LJI.LJLIL.length() > 0) {
            this.LJFF = C17N.LIZLLL((int) (this.LIZIZ >> 32), C08350Ul.LIZJ(this.LJFF));
        }
    }

    public final int LIZJ(C0VG c0vg, int i) {
        if (i >= this.LIZ.length()) {
            return this.LIZ.length();
        }
        int length = this.LJI.LJLIL.length() - 1;
        if (i <= length) {
            length = i;
        }
        long LJIILJJIL = c0vg.LJIILJJIL(length);
        if (C08350Ul.LIZJ(LJIILJJIL) <= i) {
            return LIZJ(c0vg, i + 1);
        }
        return this.LIZLLL.LIZ(C08350Ul.LIZJ(LJIILJJIL));
    }

    public final int LIZLLL(C0VG c0vg, int i) {
        if (i < 0) {
            return 0;
        }
        int length = this.LJI.LJLIL.length() - 1;
        if (i <= length) {
            length = i;
        }
        int LJIILJJIL = (int) (c0vg.LJIILJJIL(length) >> 32);
        if (LJIILJJIL >= i) {
            return LIZLLL(c0vg, i - 1);
        }
        return this.LIZLLL.LIZ(LJIILJJIL);
    }

    public final int LJFF(C0VG c0vg, int i) {
        int LIZIZ = this.LIZLLL.LIZIZ(C08350Ul.LIZJ(this.LJFF));
        C20210qn c20210qn = this.LJ;
        if (c20210qn.LIZ == null) {
            c20210qn.LIZ = Float.valueOf(c0vg.LIZJ(LIZIZ).LIZ);
        }
        int LJI = c0vg.LJI(LIZIZ) + i;
        if (LJI < 0) {
            return 0;
        }
        if (LJI >= c0vg.LIZIZ.LJFF) {
            return this.LJI.LJLIL.length();
        }
        float LJ = c0vg.LJ(LJI) - 1;
        Float f = this.LJ.LIZ;
        o.LJI(f);
        float floatValue = f.floatValue();
        if ((LJ() && floatValue >= c0vg.LJIIIZ(LJI)) || (!LJ() && floatValue <= c0vg.LJIIIIZZ(LJI))) {
            return c0vg.LJFF(LJI, true);
        }
        return this.LIZLLL.LIZ(c0vg.LJIIL(C78923UyF.LIZ(f.floatValue(), LJ)));
    }

    public final void LJIL(int i, int i2) {
        this.LJFF = C17N.LIZLLL(i, i2);
    }

    public AbstractC20180qk(C08440Uu c08440Uu, long j, C0VG c0vg, InterfaceC14950iJ interfaceC14950iJ, C20210qn c20210qn) {
        this.LIZ = c08440Uu;
        this.LIZIZ = j;
        this.LIZJ = c0vg;
        this.LIZLLL = interfaceC14950iJ;
        this.LJ = c20210qn;
        this.LJFF = j;
        this.LJI = c08440Uu;
    }
}
