package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.bag.BagItemListResponse;

/* loaded from: classes6.dex */
public final class _BagItemListResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<BagItemListResponse.Extra> {
    @Override // X.InterfaceC31105CIr
    public final BagItemListResponse.Extra LIZ(Q9H q9h) {
        BagItemListResponse.Extra extra = new BagItemListResponse.Extra();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return extra;
    }
}
