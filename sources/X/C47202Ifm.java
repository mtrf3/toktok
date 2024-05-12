package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ifm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47202Ifm implements IZ0 {
    public C46539IOh LIZIZ;
    public IWH LIZJ;
    public final List<IZ0> LIZ = new ArrayList();
    public final C47224Ig8 LIZLLL = new C47224Ig8();
    public final C67942QlW LJ = new C67942QlW(5);

    @Override // X.IZ0
    public final /* synthetic */ InterfaceC46540IOi LJII() {
        return null;
    }

    @Override // X.IZ0
    public final void pause() {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).pause();
        }
    }

    @Override // X.IZ0
    public final void release() {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).release();
        }
        ((ArrayList) this.LIZ).clear();
        this.LIZIZ = null;
        this.LIZJ = null;
    }

    @Override // X.IZ0
    public final void resume() {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).resume();
        }
    }

    @Override // X.IZ0
    public final void stop() {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).stop();
        }
    }

    @Override // X.IZ0
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).LIZ(interfaceC46811IYt);
        }
    }

    @Override // X.IZ0
    public final void LIZIZ(IZ2 iz2) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).LIZIZ(iz2);
        }
    }

    public final void LIZJ(AbstractC47210Ifu abstractC47210Ifu) {
        if (abstractC47210Ifu.LJIIJJI() && !((ArrayList) this.LIZ).contains(abstractC47210Ifu)) {
            SimRadar.keyScan("PlayerHookManager", "addStrategy", C16880lQ.LJLLJ(abstractC47210Ifu.getClass()));
            abstractC47210Ifu.LJIIIIZZ(this.LIZJ);
            abstractC47210Ifu.LIZLLL(this.LIZIZ);
            C67942QlW c67942QlW = this.LJ;
            abstractC47210Ifu.LIZIZ = c67942QlW;
            if (!((List) c67942QlW.LJLIL).contains(abstractC47210Ifu)) {
                ((List) c67942QlW.LJLIL).add(abstractC47210Ifu);
            }
            if (abstractC47210Ifu.LJIIIZ() != null) {
                C47224Ig8 c47224Ig8 = this.LIZLLL;
                InterfaceC47233IgH LJIIIZ = abstractC47210Ifu.LJIIIZ();
                if (!((ArrayList) c47224Ig8.LIZ).contains(LJIIIZ)) {
                    ((ArrayList) c47224Ig8.LIZ).add(LJIIIZ);
                }
            }
            ((ArrayList) this.LIZ).add(abstractC47210Ifu);
        }
    }

    @Override // X.IZ0
    public final void LJ(InterfaceC197787pW interfaceC197787pW) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).LJ(interfaceC197787pW);
        }
    }

    @Override // X.IZ0
    public final void LJFF(String str) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).LJFF(str);
        }
    }

    @Override // X.IZ0
    public final void LJI(String str, List<InterfaceC46811IYt> list) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).LJI(str, list);
        }
    }

    public C47202Ifm(IZ1 iz1, IWH iwh, C46539IOh c46539IOh) {
        this.LIZIZ = c46539IOh;
        this.LIZJ = iwh;
        C47197Ifh c47197Ifh = new C47197Ifh();
        C47204Ifo c47204Ifo = new C47204Ifo();
        c47197Ifh.LJIILIIL = c47204Ifo.LJFF.LIZJ;
        LIZJ(new C46817IYz());
        LIZJ(new C47215Ifz());
        LIZJ(c47197Ifh);
        LIZJ(new C47205Ifp(iz1));
        LIZJ(new C46815IYx());
        LIZJ(c47204Ifo);
    }
}
