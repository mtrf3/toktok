package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FYPCommerceStruct_ProtoDecoder implements InterfaceC31105CIr<FYPCommerceStruct> {
    public static FYPCommerceStruct LIZIZ(Q9H q9h) {
        FYPCommerceStruct fYPCommerceStruct = new FYPCommerceStruct();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    fYPCommerceStruct.previewProductCardInfo = _PreviewProductCardInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fYPCommerceStruct;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FYPCommerceStruct LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
