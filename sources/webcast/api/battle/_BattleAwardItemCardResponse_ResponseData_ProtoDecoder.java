package webcast.api.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.match._CriticalStrikeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._SmokeCardInfo_ProtoDecoder;
import webcast.api.battle.BattleAwardItemCardResponse;

/* loaded from: classes14.dex */
public final class _BattleAwardItemCardResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BattleAwardItemCardResponse.ResponseData> {
    public static BattleAwardItemCardResponse.ResponseData LIZIZ(Q9H q9h) {
        BattleAwardItemCardResponse.ResponseData responseData = new BattleAwardItemCardResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.smokeCard = _SmokeCardInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.criticalStrikeCard = _CriticalStrikeCardInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.cardType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleAwardItemCardResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
