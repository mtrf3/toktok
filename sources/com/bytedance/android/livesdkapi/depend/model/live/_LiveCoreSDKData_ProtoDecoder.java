package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LiveCoreSDKData_ProtoDecoder implements InterfaceC31105CIr<LiveCoreSDKData> {
    public static LiveCoreSDKData LIZIZ(Q9H q9h) {
        LiveCoreSDKData liveCoreSDKData = new LiveCoreSDKData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    liveCoreSDKData.pullData = _LiveCoreSDKData_PullData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveCoreSDKData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveCoreSDKData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
