package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RelationResponse_ProtoDecoder implements InterfaceC31105CIr<RelationResponse> {
    @Override // X.InterfaceC31105CIr
    public final RelationResponse LIZ(Q9H q9h) {
        RelationResponse relationResponse = new RelationResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        RelationExtra relationExtra = new RelationExtra();
                        long LIZJ2 = q9h.LIZJ();
                        while (q9h.LJI() != -1) {
                            Q9J.LIZJ(q9h);
                        }
                        q9h.LJ(LIZJ2);
                        relationResponse.extra = relationExtra;
                    }
                } else {
                    relationResponse.data = _RelationData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return relationResponse;
            }
        }
    }
}
