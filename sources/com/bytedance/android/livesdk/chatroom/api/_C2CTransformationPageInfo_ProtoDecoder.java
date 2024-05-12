package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _C2CTransformationPageInfo_ProtoDecoder implements InterfaceC31105CIr<C2CTransformationPageInfo> {
    public static C2CTransformationPageInfo LIZIZ(Q9H q9h) {
        C2CTransformationPageInfo c2CTransformationPageInfo = new C2CTransformationPageInfo();
        c2CTransformationPageInfo.currentServices = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            c2CTransformationPageInfo.currentServices.add(Q9J.LIZIZ(q9h));
                        }
                    } else {
                        c2CTransformationPageInfo.price = Q9J.LIZIZ(q9h);
                    }
                } else {
                    c2CTransformationPageInfo.c2cDdlDate = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return c2CTransformationPageInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final C2CTransformationPageInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
