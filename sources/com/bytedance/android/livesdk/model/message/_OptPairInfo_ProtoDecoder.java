package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _OptPairInfo_ProtoDecoder implements InterfaceC31105CIr<OptPairInfo> {
    public static OptPairInfo LIZIZ(Q9H q9h) {
        OptPairInfo optPairInfo = new OptPairInfo();
        optPairInfo.displayUserList = new ArrayList();
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
                                optPairInfo.expectedTimeSec = q9h.LJIIJJI();
                            }
                        } else {
                            optPairInfo.buttonNoticeType = q9h.LJIIJ();
                        }
                    } else {
                        optPairInfo.displayUserList.add(_OptPairInfo_OptPairUser_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    optPairInfo.mappingId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return optPairInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OptPairInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
