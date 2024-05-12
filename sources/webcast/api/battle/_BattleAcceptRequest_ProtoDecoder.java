package webcast.api.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BattleAcceptRequest_ProtoDecoder implements InterfaceC31105CIr<BattleAcceptRequest> {
    @Override // X.InterfaceC31105CIr
    public final BattleAcceptRequest LIZ(Q9H q9h) {
        BattleAcceptRequest battleAcceptRequest = new BattleAcceptRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    battleAcceptRequest.acceptScene = q9h.LJIIJ();
                                }
                            } else {
                                battleAcceptRequest.actualDuration = q9h.LJIIJJI();
                            }
                        } else {
                            battleAcceptRequest.duration = q9h.LJIIJJI();
                        }
                    } else {
                        battleAcceptRequest.battleId = q9h.LJIIJJI();
                    }
                } else {
                    battleAcceptRequest.channelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleAcceptRequest;
            }
        }
    }
}
