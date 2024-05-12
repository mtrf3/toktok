package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.PgC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65064PgC {
    public final C65065PgD LIZ;
    public InterfaceC64805Pc1 LIZIZ;
    public C65026Pfa LIZJ;
    public final List<InterfaceC37216Ej6> LIZLLL;
    public final List<AbstractC65022PfW> LJ;
    public final List<AbstractC65069PgH> LJFF;
    public Executor LJI;

    public C65064PgC() {
        C65065PgD c65065PgD = C65065PgD.LIZ;
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
        this.LIZ = c65065PgD;
    }

    public final C65019PfT LIZLLL() {
        if (this.LIZJ != null) {
            if (this.LIZIZ != null) {
                if (this.LJI != null) {
                    Executor LIZIZ = this.LIZ.LIZIZ();
                    ArrayList arrayList = new ArrayList(this.LJFF);
                    arrayList.addAll(this.LIZ.LIZ(LIZIZ));
                    int size = ((ArrayList) this.LJ).size() + 1;
                    this.LIZ.LIZLLL();
                    ArrayList arrayList2 = new ArrayList(0 + size);
                    arrayList2.add(new C65056Pg4());
                    arrayList2.addAll(this.LJ);
                    arrayList2.addAll(this.LIZ.LIZJ());
                    if (C65019PfT.LJIIIZ != null) {
                        Iterator<InterfaceC37216Ej6> it = C65019PfT.LJIIIZ.iterator();
                        while (it.hasNext()) {
                            InterfaceC37216Ej6 next = it.next();
                            if (!((CopyOnWriteArrayList) this.LIZLLL).contains(next)) {
                                ((CopyOnWriteArrayList) this.LIZLLL).add(next);
                            }
                        }
                    }
                    return new C65019PfT(this.LIZJ, this.LIZIZ, this.LIZLLL, arrayList2, arrayList, this.LJI, LIZIZ);
                }
                throw new IllegalStateException("HttpExecutor may not be null.");
            }
            throw new IllegalStateException("ClientProvider may not be null.");
        }
        throw new IllegalStateException("Endpoint may not be null.");
    }

    public final void LIZ(AbstractC65069PgH abstractC65069PgH) {
        List<AbstractC65069PgH> list = this.LJFF;
        C65139PhP.LIZ(abstractC65069PgH, "factory == null");
        ((ArrayList) list).add(abstractC65069PgH);
    }

    public final void LIZIZ(AbstractC65022PfW abstractC65022PfW) {
        List<AbstractC65022PfW> list = this.LJ;
        C65139PhP.LIZ(abstractC65022PfW, "factory == null");
        ((ArrayList) list).add(abstractC65022PfW);
    }

    public final void LIZJ(InterfaceC37216Ej6 interfaceC37216Ej6) {
        C65139PhP.LIZ(interfaceC37216Ej6, "interceptor == null");
        ((CopyOnWriteArrayList) this.LIZLLL).add(interfaceC37216Ej6);
    }

    public final void LJ(String str) {
        if (str != null && str.trim().length() != 0) {
            this.LIZJ = new C65026Pfa(str, "default");
            return;
        }
        throw new NullPointerException("Endpoint may not be blank.");
    }
}
