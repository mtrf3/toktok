package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1WN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WN extends AbstractC17600ma {
    public AbstractC11740d8 LIZIZ;
    public float LJFF;
    public AbstractC11740d8 LJI;
    public float LJIIJ;
    public float LJIIL;
    public C43041mW LJIILLIIL;
    public float LIZJ = 1.0f;
    public List<? extends AbstractC17560mW> LIZLLL = C17630md.LIZ;
    public float LJ = 1.0f;
    public int LJII = 0;
    public int LJIIIIZZ = 0;
    public float LJIIIZ = 4.0f;
    public float LJIIJJI = 1.0f;
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL = true;
    public boolean LJIILL = true;
    public final C1QX LJIIZILJ = C1JI.LIZ();
    public final C1QX LJIJ = C1JI.LIZ();
    public final C5H3 LJIJI = C221108m2.LIZ(EnumC221088m0.NONE, C22W.LJLIL);
    public final C17590mZ LJIJJ = new C17590mZ();

    public final void LJ() {
        boolean z;
        this.LJIJ.reset();
        if (this.LJIIJ == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.LJIIJJI == 1.0f) {
            this.LJIJ.LJIIJJI(this.LJIIZILJ, C10370av.LIZIZ);
            return;
        }
        ((InterfaceC11660d0) this.LJIJI.getValue()).LIZIZ(this.LJIIZILJ);
        float length = ((InterfaceC11660d0) this.LJIJI.getValue()).getLength();
        float f = this.LJIIJ;
        float f2 = this.LJIIL;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.LJIIJJI + f2) % 1.0f) * length;
        if (f3 > f4) {
            ((InterfaceC11660d0) this.LJIJI.getValue()).LIZ(f3, length, this.LJIJ);
            ((InterfaceC11660d0) this.LJIJI.getValue()).LIZ(0.0f, f4, this.LJIJ);
        } else {
            ((InterfaceC11660d0) this.LJIJI.getValue()).LIZ(f3, f4, this.LJIJ);
        }
    }

    public final String toString() {
        return this.LJIIZILJ.toString();
    }

    @Override // X.AbstractC17600ma
    public final void LIZ(InterfaceC33691Tx interfaceC33691Tx) {
        o.LJIIIZ(interfaceC33691Tx, "<this>");
        if (this.LJIILIIL) {
            ((ArrayList) this.LJIJJ.LIZ).clear();
            this.LJIIZILJ.reset();
            C17590mZ c17590mZ = this.LJIJJ;
            List<? extends AbstractC17560mW> nodes = this.LIZLLL;
            c17590mZ.getClass();
            o.LJIIIZ(nodes, "nodes");
            ((ArrayList) c17590mZ.LIZ).addAll(nodes);
            c17590mZ.LIZJ(this.LJIIZILJ);
            LJ();
        } else if (this.LJIILL) {
            LJ();
        }
        this.LJIILIIL = false;
        this.LJIILL = false;
        AbstractC11740d8 abstractC11740d8 = this.LIZIZ;
        if (abstractC11740d8 != null) {
            C14720hw.LJI(interfaceC33691Tx, this.LJIJ, abstractC11740d8, this.LIZJ, null, 56);
        }
        AbstractC11740d8 abstractC11740d82 = this.LJI;
        if (abstractC11740d82 != null) {
            C43041mW c43041mW = this.LJIILLIIL;
            if (this.LJIILJJIL || c43041mW == null) {
                c43041mW = new C43041mW(this.LJFF, this.LJIIIZ, this.LJII, this.LJIIIIZZ, 16);
                this.LJIILLIIL = c43041mW;
                this.LJIILJJIL = false;
            }
            C14720hw.LJI(interfaceC33691Tx, this.LJIJ, abstractC11740d82, this.LJ, c43041mW, 48);
        }
    }
}
