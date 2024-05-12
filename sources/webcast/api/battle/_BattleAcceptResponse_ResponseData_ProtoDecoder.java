package webcast.api.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.battle.BattleAcceptResponse;

/* loaded from: classes14.dex */
public final class _BattleAcceptResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BattleAcceptResponse.ResponseData> {
    public static BattleAcceptResponse.ResponseData LIZIZ(Q9H q9h) {
        BattleAcceptResponse.ResponseData responseData = new BattleAcceptResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.isLastAccept = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleAcceptResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
