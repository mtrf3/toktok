package webcast.api.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleAwardItemCardResponse_ProtoDecoder implements InterfaceC31105CIr<BattleAwardItemCardResponse> {
    @Override // X.InterfaceC31105CIr
    public final BattleAwardItemCardResponse LIZ(Q9H q9h) {
        BattleAwardItemCardResponse battleAwardItemCardResponse = new BattleAwardItemCardResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    battleAwardItemCardResponse.data = _BattleAwardItemCardResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleAwardItemCardResponse;
            }
        }
    }
}
