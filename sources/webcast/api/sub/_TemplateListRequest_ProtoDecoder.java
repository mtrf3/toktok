package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _TemplateListRequest_ProtoDecoder implements InterfaceC31105CIr<TemplateListRequest> {
    @Override // X.InterfaceC31105CIr
    public final TemplateListRequest LIZ(Q9H q9h) {
        TemplateListRequest templateListRequest = new TemplateListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            templateListRequest.priceRegion = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        templateListRequest.subScenario = q9h.LJIIJ();
                    }
                } else {
                    templateListRequest.toUid = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return templateListRequest;
            }
        }
    }
}
