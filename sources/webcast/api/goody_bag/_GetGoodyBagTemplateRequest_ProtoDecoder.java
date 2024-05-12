package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetGoodyBagTemplateRequest_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagTemplateRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagTemplateRequest LIZ(Q9H q9h) {
        GetGoodyBagTemplateRequest getGoodyBagTemplateRequest = new GetGoodyBagTemplateRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getGoodyBagTemplateRequest.biz = q9h.LJIIJ();
                    }
                } else {
                    getGoodyBagTemplateRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return getGoodyBagTemplateRequest;
            }
        }
    }
}
