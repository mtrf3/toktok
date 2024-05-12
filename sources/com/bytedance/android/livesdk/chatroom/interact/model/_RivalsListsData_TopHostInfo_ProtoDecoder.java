package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;

/* loaded from: classes14.dex */
public final class _RivalsListsData_TopHostInfo_ProtoDecoder implements InterfaceC31105CIr<RivalsListsData.TopHostInfo> {
    public static RivalsListsData.TopHostInfo LIZIZ(Q9H q9h) {
        RivalsListsData.TopHostInfo topHostInfo = new RivalsListsData.TopHostInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        topHostInfo.topIndex = q9h.LJIIJJI();
                    }
                } else {
                    topHostInfo.rankType = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return topHostInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RivalsListsData.TopHostInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
