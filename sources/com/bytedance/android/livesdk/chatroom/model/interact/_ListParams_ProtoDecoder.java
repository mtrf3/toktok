package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ListParams_ProtoDecoder implements InterfaceC31105CIr<ListParams> {
    @Override // X.InterfaceC31105CIr
    public final ListParams LIZ(Q9H q9h) {
        ListParams listParams = new ListParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        listParams.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        listParams.linkStatus = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        listParams.offset = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        listParams.count = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        listParams.anchorId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        listParams.linkType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        listParams.enablePagination = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 8:
                        listParams.modifyTimeAfter = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return listParams;
            }
        }
    }
}
