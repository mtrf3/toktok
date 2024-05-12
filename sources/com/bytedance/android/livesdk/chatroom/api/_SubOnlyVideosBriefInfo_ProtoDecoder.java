package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _SubOnlyVideosBriefInfo_ProtoDecoder implements InterfaceC31105CIr<SubOnlyVideosBriefInfo> {
    public static SubOnlyVideosBriefInfo LIZIZ(Q9H q9h) {
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = new SubOnlyVideosBriefInfo();
        subOnlyVideosBriefInfo.sovBriefInfo = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subOnlyVideosBriefInfo.sovBriefInfo.add(_SOVBriefInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        subOnlyVideosBriefInfo.totalCount = q9h.LJIIJ();
                    }
                } else {
                    subOnlyVideosBriefInfo.totalCountStr = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subOnlyVideosBriefInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubOnlyVideosBriefInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
