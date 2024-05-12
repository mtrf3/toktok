package com.bytedance.android.livesdk.wallet;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetPIPOUrlResult_ProtoDecoder implements InterfaceC31105CIr<GetPIPOUrlResult> {
    @Override // X.InterfaceC31105CIr
    public final GetPIPOUrlResult LIZ(Q9H q9h) {
        GetPIPOUrlResult getPIPOUrlResult = new GetPIPOUrlResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getPIPOUrlResult.data = _GetPIPOUrlResult_UrlData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getPIPOUrlResult;
            }
        }
    }
}
