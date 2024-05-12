package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import webcast.data._RealtimeLiveCenterBaseData_ProtoDecoder;
import webcast.data._RealtimeLiveCenterShopData_ProtoDecoder;
import webcast.data._RealtimeLiveCenterTips_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _RealtimeLiveCenterMethod_ProtoDecoder implements InterfaceC31105CIr<RealtimeLiveCenterMethod> {
    @Override // X.InterfaceC31105CIr
    public final RealtimeLiveCenterMethod LIZ(Q9H q9h) {
        RealtimeLiveCenterMethod realtimeLiveCenterMethod = new RealtimeLiveCenterMethod();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    realtimeLiveCenterMethod.shopInfo = _RealtimeLiveCenterShopData_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                realtimeLiveCenterMethod.tipsInfo = _RealtimeLiveCenterTips_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            realtimeLiveCenterMethod.baseInfo = _RealtimeLiveCenterBaseData_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        realtimeLiveCenterMethod.roomId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    realtimeLiveCenterMethod.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return realtimeLiveCenterMethod;
            }
        }
    }
}
