package X;

import Y.ARunnableS11S0201000_8;

/* renamed from: X.Itj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48067Itj implements InterfaceC48068Itk {
    public final /* synthetic */ C48066Iti LIZ;

    public C48067Itj(C48066Iti c48066Iti) {
        this.LIZ = c48066Iti;
    }

    public final void LIZ(C48072Ito c48072Ito) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("afterExecute, ProxyTask: ");
        LIZ.append(c48072Ito);
        C48841JEv.LJIIIIZZ("TAG_PROXY_ProxyServer", X1D.LIZIZ(LIZ), null);
        int LIZJ = c48072Ito.LIZJ();
        synchronized (this.LIZ.LJI) {
            java.util.Set<C48072Ito> set = this.LIZ.LJI.get(LIZJ);
            if (set != null) {
                set.remove(c48072Ito);
            }
        }
        InterfaceC47447Ijj interfaceC47447Ijj = C47455Ijr.LJ;
        if (interfaceC47447Ijj != null) {
            C48100IuG.LJIIIIZZ(new ARunnableS11S0201000_8(interfaceC47447Ijj, c48072Ito, LIZJ, 7));
        }
    }
}
