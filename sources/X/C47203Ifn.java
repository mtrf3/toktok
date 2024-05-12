package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Ifn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47203Ifn extends AbstractC47210Ifu {
    public List<Double> LJFF;
    public boolean[] LJI;
    public final boolean LJ = true;
    public final C47206Ifq LJII = new C47206Ifq(this);
    public final C47230IgE LJIIIIZZ = new C47230IgE();

    @Override // X.AbstractC47210Ifu
    public final boolean LJIIJJI() {
        C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
        return true;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final InterfaceC46540IOi LJII() {
        return this.LJII;
    }

    @Override // X.AbstractC47210Ifu
    public final InterfaceC47234IgI LJIIJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC47210Ifu, X.InterfaceC47232IgG
    public final void LIZJ(IU3 iu3) {
        if (iu3 instanceof IU2) {
            LJIIL(3, this.LJ);
        } else {
            if (!(iu3 instanceof IVY)) {
                return;
            }
            IVY ivy = (IVY) iu3;
            if (ivy.LIZIZ != ivy.LIZJ) {
                return;
            }
            LJIIL(3, this.LJ);
        }
    }

    @Override // X.AbstractC47210Ifu
    public final void LJIIIIZZ(IWH iwh) {
        this.LIZJ = iwh;
    }

    public final void LJIIL(int i, boolean z) {
        List LIZ;
        InterfaceC46811IYt interfaceC46811IYt;
        C47209Ift c47209Ift = this.LIZ;
        InterfaceC46811IYt interfaceC46811IYt2 = c47209Ift.LIZJ;
        if (interfaceC46811IYt2 == null) {
            C16880lQ.LLLZ("triggerPreRender. currentPlayRequest null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        if (z) {
            LIZ = c47209Ift.LIZ(0, 1);
        } else {
            LIZ = c47209Ift.LIZ(1, 0);
        }
        if (LIZ == null || LIZ.size() <= 0 || (interfaceC46811IYt = (InterfaceC46811IYt) ListProtector.get(LIZ, 0)) == null) {
            C16880lQ.LLLZ("triggerPreRender. preRenderTarget null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        if (i == 1) {
            C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
        }
        List<InterfaceC46813IYv> LJIIJ = interfaceC46811IYt.LJIIJ();
        if (LJIIJ == null || LJIIJ.size() == 0) {
            C16880lQ.LLLZ("triggerPreRender. playItems null, return. type:%s, isBelowCurrent:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        C46810IYs.LIZJ(interfaceC46811IYt, (InterfaceC46813IYv) ListProtector.get(LJIIJ, 0));
        C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
        this.LIZIZ.LIZIZ(this, new C47228IgC(new C47249IgX(interfaceC46811IYt, z, i)));
        C16880lQ.LLLZ("triggerPreRender. trigger successfully. type:%s, isBelowCurrent:%s, aid:%s, current:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z), interfaceC46811IYt.getKey(), interfaceC46811IYt2.getKey()});
    }
}
