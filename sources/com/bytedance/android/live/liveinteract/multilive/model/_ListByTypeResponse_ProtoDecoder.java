package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ListByTypeResponse_ProtoDecoder implements InterfaceC31105CIr<ListByTypeResponse> {
    @Override // X.InterfaceC31105CIr
    public final ListByTypeResponse LIZ(Q9H q9h) {
        ListByTypeResponse listByTypeResponse = new ListByTypeResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        listByTypeResponse.extra = _ListByTypeResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    listByTypeResponse.data = _MultiLiveGuestInfoList_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return listByTypeResponse;
            }
        }
    }
}
