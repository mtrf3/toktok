package X;

import webcast.data.MsgFilter;

/* loaded from: classes6.dex */
public final class CRW implements InterfaceC31338CRq<CRD> {
    @Override // X.InterfaceC31338CRq
    public final boolean filter(CRD crd) {
        Boolean bool;
        CRD crd2 = crd;
        if (!(crd2 instanceof C31290CPu)) {
            if (crd2 instanceof InterfaceC31380CTg) {
                MsgFilter LJIIJ = ((InterfaceC31380CTg) crd2).LJIIJ();
                if (LJIIJ != null) {
                    bool = Boolean.valueOf(LJIIJ.isGifter);
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool)) {
                }
            }
            return true;
        }
        return false;
    }
}
