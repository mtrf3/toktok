package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.bag.BagItemObtainResponse;

/* loaded from: classes14.dex */
public final class _BagItemObtainResponse_Data_ProtoDecoder implements InterfaceC31105CIr<BagItemObtainResponse.Data> {
    @Override // X.InterfaceC31105CIr
    public final BagItemObtainResponse.Data LIZ(Q9H q9h) {
        BagItemObtainResponse.Data data = new BagItemObtainResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return data;
    }
}
