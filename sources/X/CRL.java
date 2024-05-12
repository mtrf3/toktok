package X;

import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import webcast.data.MsgFilter;

/* loaded from: classes6.dex */
public final class CRL implements InterfaceC31338CRq<CRD> {
    @Override // X.InterfaceC31338CRq
    public final boolean filter(CRD crd) {
        Boolean bool;
        int i;
        CRD crd2 = crd;
        if (!(crd2 instanceof C30781C6f) || ((i = ((SubNotifyMessage) ((CQO) crd2).LJIJJLI).subscribeMessageType) != 0 && i != 5 && i != 3)) {
            if (!(crd2 instanceof InterfaceC31380CTg)) {
                return true;
            }
            MsgFilter LJIIJ = ((InterfaceC31380CTg) crd2).LJIIJ();
            if (LJIIJ != null) {
                bool = Boolean.valueOf(LJIIJ.isSubscribedToAnchor);
            } else {
                bool = null;
            }
            if (!C29306Beo.LJJIFFI(bool)) {
                return true;
            }
        }
        return false;
    }
}
