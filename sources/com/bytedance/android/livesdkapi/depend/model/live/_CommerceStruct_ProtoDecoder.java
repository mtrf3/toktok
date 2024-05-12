package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CommerceStruct_ProtoDecoder implements InterfaceC31105CIr<CommerceStruct> {
    public static CommerceStruct LIZIZ(Q9H q9h) {
        CommerceStruct commerceStruct = new CommerceStruct();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                commerceStruct.productNum = q9h.LJIIJJI();
                            }
                        } else {
                            commerceStruct.asyncLoad = Q9J.LIZ(q9h);
                        }
                    } else {
                        commerceStruct.oecInitDataString = Q9J.LIZIZ(q9h);
                    }
                } else {
                    commerceStruct.commercePermission = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return commerceStruct;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CommerceStruct LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
