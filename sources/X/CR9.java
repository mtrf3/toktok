package X;

import X.InterfaceC31336CRo;
import com.bytedance.android.live.pin.PinMessageViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class CR9<T extends InterfaceC31336CRo> extends AbstractC31497CXt<T> implements CQP {
    public final CR5 LJLIL = new CR5();
    public PinMessageViewModel LJLILLLLZI;

    public abstract void LJJJJ();

    @Override // X.CST
    public final void LJIIIZ() {
        CR5 cr5 = this.LJLIL;
        if (cr5.LJI) {
            return;
        }
        Iterator it = ((ArrayList) cr5.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJJIJIIJI();
        }
    }

    public CR9() {
        LJJJJ();
    }

    @Override // X.CST
    public final void LJI(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        Iterator it = ((ArrayList) cr5.LJ).iterator();
        while (it.hasNext()) {
            ((CRP) it.next()).LJIILLIIL(csr);
        }
    }

    @Override // X.CST
    public final void LJIILLIIL(CRD model) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        o.LJIIIZ(model, "model");
        if (cr5.LJI) {
            return;
        }
        Iterator it = ((ArrayList) cr5.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJIIIIZZ(model);
        }
    }

    @Override // X.CST
    public final void LJIIZILJ(CRD model) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        o.LJIIIZ(model, "model");
        if (cr5.LJI) {
            return;
        }
        Iterator it = ((ArrayList) cr5.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJIILIIL(model);
        }
    }

    @Override // X.CST
    public final void LJIJJ(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        Iterator it = ((ArrayList) cr5.LJ).iterator();
        while (it.hasNext()) {
            ((CRP) it.next()).LJIIL(csr);
        }
    }

    @Override // X.CST
    public final void LJIL(CRD model) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        o.LJIIIZ(model, "model");
        if (cr5.LJI) {
            return;
        }
        Iterator it = ((ArrayList) cr5.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJII(model);
        }
    }

    @Override // X.CST
    public final void LJJI(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        Iterator it = ((ArrayList) cr5.LJ).iterator();
        while (it.hasNext()) {
            ((CRP) it.next()).LJ(csr);
        }
    }

    @Override // X.CST
    public final void LJJIIJ(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        Iterator it = ((ArrayList) cr5.LJ).iterator();
        while (it.hasNext()) {
            ((CRP) it.next()).LJFF(csr);
        }
    }

    @Override // X.CST
    public final void LJJIIJZLJL(CRD model) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        o.LJIIIZ(model, "model");
        if (cr5.LJI) {
            return;
        }
        Iterator it = ((ArrayList) cr5.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJIJJ(cr5.LIZIZ, model);
        }
        cr5.LIZIZ++;
    }

    @Override // X.CST
    public final void LJJIJIIJIL(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        Iterator it = ((ArrayList) cr5.LJ).iterator();
        while (it.hasNext()) {
            ((CRP) it.next()).LJJIFFI(csr);
        }
    }

    @Override // X.CST
    public final void LJJIJIL(CSR<? extends CRD, ? extends CSF<? extends CRD>> viewBinder) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        o.LJIIIZ(viewBinder, "viewBinder");
        Iterator it = ((ArrayList) cr5.LJ).iterator();
        while (it.hasNext()) {
            ((CRP) it.next()).LJIILL(viewBinder);
        }
    }

    @Override // X.CST
    public final void LJJIL(CSR<? extends CRD, ? extends CSF<? extends CRD>> viewBinder) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        o.LJIIIZ(viewBinder, "viewBinder");
        Iterator it = ((ArrayList) cr5.LJ).iterator();
        while (it.hasNext()) {
            ((CRP) it.next()).LJIIJJI(viewBinder);
        }
    }

    @Override // X.CST
    public final void LJJJIL(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        CR5 cr5 = this.LJLIL;
        cr5.getClass();
        Iterator it = ((ArrayList) cr5.LJ).iterator();
        while (it.hasNext()) {
            ((CRP) it.next()).LJJI(csr);
        }
    }
}
