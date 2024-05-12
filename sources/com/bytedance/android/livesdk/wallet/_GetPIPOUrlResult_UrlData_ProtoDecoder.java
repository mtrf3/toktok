package com.bytedance.android.livesdk.wallet;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.wallet.GetPIPOUrlResult;

/* loaded from: classes17.dex */
public final class _GetPIPOUrlResult_UrlData_ProtoDecoder implements InterfaceC31105CIr<GetPIPOUrlResult.UrlData> {
    public static GetPIPOUrlResult.UrlData LIZIZ(Q9H q9h) {
        GetPIPOUrlResult.UrlData urlData = new GetPIPOUrlResult.UrlData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        urlData.merchantId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    urlData.pipoUrl = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return urlData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetPIPOUrlResult.UrlData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
