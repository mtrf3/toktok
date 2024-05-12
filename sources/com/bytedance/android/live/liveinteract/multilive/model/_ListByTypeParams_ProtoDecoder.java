package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ListByTypeParams_ProtoDecoder implements InterfaceC31105CIr<ListByTypeParams> {
    @Override // X.InterfaceC31105CIr
    public final ListByTypeParams LIZ(Q9H q9h) {
        ListByTypeParams listByTypeParams = new ListByTypeParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        listByTypeParams.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        listByTypeParams.channelId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        listByTypeParams.anchorId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        listByTypeParams.listType = q9h.LJIIJ();
                        break;
                    case 5:
                    case 6:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 7:
                        listByTypeParams.source = q9h.LJIIJ();
                        break;
                    case 8:
                        listByTypeParams.reason = q9h.LJIIJ();
                        break;
                    case 9:
                        listByTypeParams.liveRoomMode = q9h.LJIIJJI();
                        break;
                    case 10:
                        listByTypeParams.applierListPinGiftScoreThreshold = q9h.LJIIJJI();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return listByTypeParams;
            }
        }
    }
}
