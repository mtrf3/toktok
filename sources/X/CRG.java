package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class CRG implements InterfaceC31338CRq<CRD> {
    public final /* synthetic */ List<InterfaceC31338CRq<CRD>> LIZ;

    public CRG(List<InterfaceC31338CRq<CRD>> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC31338CRq
    public final boolean filter(CRD crd) {
        if (!this.LIZ.isEmpty()) {
            Iterator<InterfaceC31338CRq<CRD>> it = this.LIZ.iterator();
            while (it.hasNext()) {
                if (C29306Beo.LJIILLIIL(Boolean.valueOf(it.next().filter(crd)))) {
                }
            }
            return true;
        }
        return false;
    }
}
