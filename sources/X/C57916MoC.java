package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.MoC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57916MoC implements InterfaceC57861MnJ {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final List<InterfaceC57917MoD> LIZIZ = new CopyOnWriteArrayList();

    public C57916MoC(C57945Mof c57945Mof) {
        this.LIZ = c57945Mof;
    }

    @Override // X.InterfaceC57861MnJ
    public final List<InterfaceC57927MoN> LIZ(C57850Mn8 c57850Mn8) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            c57850Mn8 = C57850Mn8.LIZ(c57850Mn8, ((InterfaceC57917MoD) it.next()).LIZLLL(c57850Mn8.LIZ, c57850Mn8.LIZIZ));
        }
        return c57850Mn8.LIZ;
    }
}
