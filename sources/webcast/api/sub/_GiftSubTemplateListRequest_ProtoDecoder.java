package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GiftSubTemplateListRequest_ProtoDecoder implements InterfaceC31105CIr<GiftSubTemplateListRequest> {
    @Override // X.InterfaceC31105CIr
    public final GiftSubTemplateListRequest LIZ(Q9H q9h) {
        GiftSubTemplateListRequest giftSubTemplateListRequest = new GiftSubTemplateListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        giftSubTemplateListRequest.iapCountryCode = Q9J.LIZIZ(q9h);
                    }
                } else {
                    giftSubTemplateListRequest.toUid = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftSubTemplateListRequest;
            }
        }
    }
}
