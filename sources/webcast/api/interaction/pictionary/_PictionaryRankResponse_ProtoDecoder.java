package webcast.api.interaction.pictionary;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PictionaryRankResponse_ProtoDecoder implements InterfaceC31105CIr<PictionaryRankResponse> {
    @Override // X.InterfaceC31105CIr
    public final PictionaryRankResponse LIZ(Q9H q9h) {
        PictionaryRankResponse pictionaryRankResponse = new PictionaryRankResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    pictionaryRankResponse.data = _PictionaryRankResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pictionaryRankResponse;
            }
        }
    }
}
