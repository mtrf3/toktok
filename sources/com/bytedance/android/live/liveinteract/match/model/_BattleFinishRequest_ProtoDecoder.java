package com.bytedance.android.live.liveinteract.match.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleFinishRequest_ProtoDecoder implements InterfaceC31105CIr<BattleFinishRequest> {
    @Override // X.InterfaceC31105CIr
    public final BattleFinishRequest LIZ(Q9H q9h) {
        BattleFinishRequest battleFinishRequest = new BattleFinishRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    switch (LJI) {
                                        case 101:
                                            battleFinishRequest.finishSource = Q9J.LIZIZ(q9h);
                                            break;
                                        case 102:
                                            battleFinishRequest.finishIsBackground = q9h.LJIIJJI();
                                            break;
                                        case 103:
                                            battleFinishRequest.finishNetworkQuality = q9h.LJIIJJI();
                                            break;
                                        case 104:
                                            battleFinishRequest.finishCurBitrate = q9h.LJIIJJI();
                                            break;
                                        case 105:
                                            battleFinishRequest.finishIsSdk = q9h.LJIIJJI();
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                                } else {
                                    battleFinishRequest.otherPartyUserId = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                battleFinishRequest.otherPartyLeft = Boolean.valueOf(Q9J.LIZ(q9h));
                            }
                        } else {
                            battleFinishRequest.battleId = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        battleFinishRequest.cutShort = Boolean.valueOf(Q9J.LIZ(q9h));
                    }
                } else {
                    battleFinishRequest.channelId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleFinishRequest;
            }
        }
    }
}
