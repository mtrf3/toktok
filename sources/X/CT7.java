package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;
import uw.s;

/* loaded from: classes6.dex */
public abstract class CT7 extends C31413CUn implements InterfaceC29316Bey {
    public CQQ LJLJI;
    public final ArrayList<Class<? extends CRD>> LJLJJI = new ArrayList<>();

    public abstract void LL();

    public final CQQ LJZI() {
        CQQ cqq = this.LJLJI;
        if (cqq != null) {
            return cqq;
        }
        o.LJIJI("publicScreenContext");
        throw null;
    }

    public final void LJZL() {
        ((C31411CUl) this.LJLILLLLZI).LIZJ(CQ1.class);
        if (!this.LJLJJI.contains(CQ1.class)) {
            this.LJLJJI.add(CQ1.class);
        }
        CQ4 cq4 = new CQ4();
        cq4.LIZIZ = LJZI();
        CSQ csq = new CSQ();
        csq.LIZIZ = LJZI();
        ((C31411CUl) this.LJLILLLLZI).LIZJ(CQ1.class);
        C31410CUk c31410CUk = new C31410CUk(this, CQ1.class);
        c31410CUk.LIZJ = new AbstractC31414CUo[]{cq4, csq};
        c31410CUk.LIZ(CT9.LIZ);
    }

    public final <MODEL extends s, VH extends CSF<MODEL>> void LLD(Class<MODEL> cls, CSR<MODEL, VH> csr) {
        ((C31411CUl) this.LJLILLLLZI).LIZJ(cls);
        if (!this.LJLJJI.contains(cls)) {
            this.LJLJJI.add(cls);
        }
        csr.LIZIZ = LJZI();
        LJLZ(cls, csr);
    }
}
