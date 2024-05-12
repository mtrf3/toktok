package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PaidContentInfo_ProtoDecoder implements InterfaceC31105CIr<PaidContentInfo> {
    public static PaidContentInfo LIZIZ(Q9H q9h) {
        PaidContentInfo paidContentInfo = new PaidContentInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        paidContentInfo.paidContentLiveData = Q9J.LIZIZ(q9h);
                    }
                } else {
                    paidContentInfo.paidContentPermission = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return paidContentInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PaidContentInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
