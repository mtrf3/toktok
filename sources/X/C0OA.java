package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0OA, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0OA {
    public static final /* synthetic */ int LJ = 0;
    public C1IQ LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public void LIZJ() {
        this.LIZJ = true;
        synchronized (C0OF.LIZJ) {
            int i = this.LIZLLL;
            if (i >= 0) {
                C0OF.LJIIZILJ(i);
                this.LIZLLL = -1;
            }
        }
    }

    public abstract InterfaceC88472Yns<Object, C76800UCe> LJFF();

    public abstract boolean LJI();

    public abstract InterfaceC88472Yns<Object, C76800UCe> LJII();

    public abstract void LJIIIZ(C0OA c0oa);

    public abstract void LJIIJ(C0OA c0oa);

    public abstract void LJIIJJI();

    public abstract void LJIIL(C0O9 c0o9);

    public abstract C0OA LJIIZILJ(InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns);

    public final void LIZ() {
        synchronized (C0OF.LIZJ) {
            LIZIZ();
            LJIILIIL();
        }
    }

    public void LIZIZ() {
        C0OF.LIZLLL = C0OF.LIZLLL.LJII(LIZLLL());
    }

    public final C0OA LJIIIIZZ() {
        C24730y5 c24730y5 = C0OF.LIZIZ;
        C0OA c0oa = (C0OA) c24730y5.LIZ();
        c24730y5.LIZIZ(this);
        return c0oa;
    }

    public void LJIILIIL() {
        int i = this.LIZLLL;
        if (i >= 0) {
            C0OF.LJIIZILJ(i);
            this.LIZLLL = -1;
        }
    }

    public int LIZLLL() {
        return this.LIZIZ;
    }

    public C1IQ LJ() {
        return this.LIZ;
    }

    public static void LJIILJJIL(C0OA c0oa) {
        C0OF.LIZIZ.LIZIZ(c0oa);
    }

    public void LJIILL(int i) {
        this.LIZIZ = i;
    }

    public void LJIILLIIL(C1IQ c1iq) {
        o.LJIIIZ(c1iq, "<set-?>");
        this.LIZ = c1iq;
    }

    public C0OA(int i, C1IQ c1iq) {
        int i2;
        int i3;
        int LIZ;
        this.LIZ = c1iq;
        this.LIZIZ = i;
        if (i != 0) {
            C1IQ invalid = LJ();
            o.LJIIIZ(invalid, "invalid");
            int[] iArr = invalid.LJLJJI;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = invalid.LJLILLLLZI;
                if (j != 0) {
                    i3 = invalid.LJLJI;
                    LIZ = C30581Hy.LIZ(j);
                } else {
                    long j2 = invalid.LJLIL;
                    if (j2 != 0) {
                        i3 = invalid.LJLJI + 64;
                        LIZ = C30581Hy.LIZ(j2);
                    }
                }
                i = i3 + LIZ;
            }
            synchronized (C0OF.LIZJ) {
                i2 = C0OF.LJFF.LIZ(i);
            }
        } else {
            i2 = -1;
        }
        this.LIZLLL = i2;
    }
}
