package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.QfZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67573QfZ extends AbstractRunnableC67572QfY {
    public final /* synthetic */ AbstractRunnableC67572QfY LJLILLLLZI;
    public final /* synthetic */ C67574Qfa LJLJI;

    @Override // X.AbstractRunnableC67572QfY
    public final void LIZIZ() {
        C67574Qfa c67574Qfa = this.LJLJI;
        AbstractRunnableC67572QfY abstractRunnableC67572QfY = this.LJLILLLLZI;
        if (c67574Qfa.LJIIL == null && !c67574Qfa.LJI) {
            c67574Qfa.LIZIZ.LIZ("Initiate binding to the service.", new Object[0]);
            ((ArrayList) c67574Qfa.LIZLLL).add(abstractRunnableC67572QfY);
            ServiceConnectionC67578Qfe serviceConnectionC67578Qfe = new ServiceConnectionC67578Qfe(c67574Qfa);
            c67574Qfa.LJIIJJI = serviceConnectionC67578Qfe;
            c67574Qfa.LJI = true;
            if (!C16880lQ.LLLJL(c67574Qfa.LIZ, c67574Qfa.LJII, serviceConnectionC67578Qfe, 1)) {
                c67574Qfa.LIZIZ.LIZ("Failed to bind to the service.", new Object[0]);
                c67574Qfa.LJI = false;
                Iterator it = ((ArrayList) c67574Qfa.LIZLLL).iterator();
                while (it.hasNext()) {
                    ((AbstractRunnableC67572QfY) it.next()).LIZ(new C67580Qfg());
                }
                ((ArrayList) c67574Qfa.LIZLLL).clear();
                return;
            }
            return;
        }
        if (c67574Qfa.LJI) {
            c67574Qfa.LIZIZ.LIZ("Waiting to bind to the service.", new Object[0]);
            ((ArrayList) c67574Qfa.LIZLLL).add(abstractRunnableC67572QfY);
        } else {
            abstractRunnableC67572QfY.run();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67573QfZ(C67574Qfa c67574Qfa, C67649Qgn c67649Qgn, C67561QfN c67561QfN) {
        super(c67649Qgn);
        this.LJLJI = c67574Qfa;
        this.LJLILLLLZI = c67561QfN;
    }
}
