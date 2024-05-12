package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Qfk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67584Qfk extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ AbstractRunnableC40619Fwt LJLILLLLZI;
    public final /* synthetic */ C67585Qfl LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67584Qfk(C67585Qfl c67585Qfl, C40579FwF c40579FwF, AbstractRunnableC40619Fwt abstractRunnableC40619Fwt) {
        super(c40579FwF);
        this.LJLJI = c67585Qfl;
        this.LJLILLLLZI = abstractRunnableC40619Fwt;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        C67585Qfl c67585Qfl = this.LJLJI;
        AbstractRunnableC40619Fwt abstractRunnableC40619Fwt = this.LJLILLLLZI;
        if (c67585Qfl.LJIIJ == 0 && !c67585Qfl.LJ) {
            c67585Qfl.LIZIZ.LIZJ("Initiate binding to the service.", 4, new Object[0]);
            ((ArrayList) c67585Qfl.LIZLLL).add(abstractRunnableC40619Fwt);
            ServiceConnectionC67589Qfp serviceConnectionC67589Qfp = new ServiceConnectionC67589Qfp(c67585Qfl);
            c67585Qfl.LJIIIZ = serviceConnectionC67589Qfp;
            c67585Qfl.LJ = true;
            if (!C16880lQ.LLLJL(c67585Qfl.LIZ, c67585Qfl.LJFF, serviceConnectionC67589Qfp, 1)) {
                c67585Qfl.LIZIZ.LIZJ("Failed to bind to the service.", 4, new Object[0]);
                c67585Qfl.LJ = false;
                Iterator it = ((ArrayList) c67585Qfl.LIZLLL).iterator();
                while (it.hasNext()) {
                    C40579FwF c40579FwF = ((AbstractRunnableC40619Fwt) it.next()).LJLIL;
                    if (c40579FwF != null) {
                        c40579FwF.LIZIZ(new C67590Qfq());
                    }
                }
                ((ArrayList) c67585Qfl.LIZLLL).clear();
                return;
            }
            return;
        }
        if (c67585Qfl.LJ) {
            c67585Qfl.LIZIZ.LIZJ("Waiting to bind to the service.", 4, new Object[0]);
            ((ArrayList) c67585Qfl.LIZLLL).add(abstractRunnableC40619Fwt);
        } else {
            abstractRunnableC40619Fwt.run();
        }
    }
}
