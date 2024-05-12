package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class _CohostABTestList_ProtoDecoder implements InterfaceC31105CIr<CohostABTestList> {
    public static CohostABTestList LIZIZ(Q9H q9h) {
        CohostABTestList cohostABTestList = new CohostABTestList();
        cohostABTestList.abTestList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    cohostABTestList.abTestList.add(_CohostABTest_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostABTestList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CohostABTestList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
