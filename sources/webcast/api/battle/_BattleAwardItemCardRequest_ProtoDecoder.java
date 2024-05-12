package webcast.api.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BattleAwardItemCardRequest_ProtoDecoder implements InterfaceC31105CIr<BattleAwardItemCardRequest> {
    @Override // X.InterfaceC31105CIr
    public final BattleAwardItemCardRequest LIZ(Q9H q9h) {
        BattleAwardItemCardRequest battleAwardItemCardRequest = new BattleAwardItemCardRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            battleAwardItemCardRequest.anchorId = q9h.LJIIJJI();
                        }
                    } else {
                        battleAwardItemCardRequest.battleId = q9h.LJIIJJI();
                    }
                } else {
                    battleAwardItemCardRequest.channelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleAwardItemCardRequest;
            }
        }
    }
}
