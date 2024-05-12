package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BALinkStruct_ProtoDecoder implements InterfaceC31105CIr<BALinkStruct> {
    public static BALinkStruct LIZIZ(Q9H q9h) {
        BALinkStruct bALinkStruct = new BALinkStruct();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        bALinkStruct.baLinkData = Q9J.LIZIZ(q9h);
                    }
                } else {
                    bALinkStruct.baLinkPermission = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bALinkStruct;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BALinkStruct LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
