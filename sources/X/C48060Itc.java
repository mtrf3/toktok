package X;

import Y.ARunnableS11S0201000_8;
import Y.ARunnableS44S0100000_8;

/* renamed from: X.Itc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48060Itc implements InterfaceC48093Iu9 {
    public final /* synthetic */ C48059Itb LIZ;

    public C48060Itc(C48059Itb c48059Itb) {
        this.LIZ = c48059Itb;
    }

    @Override // X.InterfaceC48093Iu9
    public final void LIZ(C48071Itn c48071Itn) {
        int LIZJ = c48071Itn.LIZJ();
        synchronized (this.LIZ.LIZ) {
            java.util.Map<String, C48071Itn> map = this.LIZ.LIZ.get(LIZJ);
            if (map != null) {
                map.remove(c48071Itn.LJLJLJ);
            }
        }
        if (this.LIZ.LIZJ()) {
            C48059Itb c48059Itb = this.LIZ;
            c48059Itb.getClass();
            C48100IuG.LJIIIIZZ(new ARunnableS44S0100000_8(c48059Itb, 126));
        }
        InterfaceC47447Ijj interfaceC47447Ijj = C47455Ijr.LJ;
        if (interfaceC47447Ijj != null) {
            C48100IuG.LJIIIIZZ(new ARunnableS11S0201000_8(interfaceC47447Ijj, c48071Itn, LIZJ, 8));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("afterExecute, key: ");
        LIZ.append(c48071Itn.LJLJLJ);
        C48841JEv.LJIIIIZZ("TAG_PROXY_Preloader", X1D.LIZIZ(LIZ), null);
    }

    @Override // X.InterfaceC48093Iu9
    public final void LIZIZ(C48071Itn c48071Itn) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLazyUrlsProvided, key: ");
        LIZ.append(c48071Itn.LJLJLJ);
        C48841JEv.LJIIIIZZ("TAG_PROXY_Preloader", X1D.LIZIZ(LIZ), null);
        int LIZJ = c48071Itn.LIZJ();
        synchronized (this.LIZ.LIZ) {
            java.util.Map<String, C48071Itn> map = this.LIZ.LIZ.get(LIZJ);
            if (!map.containsKey(c48071Itn.LJLJLJ)) {
                map.put(c48071Itn.LJLJLJ, c48071Itn);
            }
        }
    }
}
