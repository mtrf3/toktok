package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;

/* loaded from: classes6.dex */
public final class _LiveCoreSDKData_PullData_ProtoDecoder implements InterfaceC31105CIr<LiveCoreSDKData.PullData> {
    public static LiveCoreSDKData.PullData LIZIZ(Q9H q9h) {
        LiveCoreSDKData.PullData pullData = new LiveCoreSDKData.PullData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        pullData.options = _LiveCoreSDKData_Options_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    pullData.streamData = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pullData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveCoreSDKData.PullData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
