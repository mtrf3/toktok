package webcast.api.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleAcceptResponse_ProtoDecoder implements InterfaceC31105CIr<BattleAcceptResponse> {
    @Override // X.InterfaceC31105CIr
    public final BattleAcceptResponse LIZ(Q9H q9h) {
        BattleAcceptResponse battleAcceptResponse = new BattleAcceptResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    battleAcceptResponse.data = _BattleAcceptResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleAcceptResponse;
            }
        }
    }
}
