package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagCommonSelected_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _SendGoodyBagRequest_ProtoDecoder implements InterfaceC31105CIr<SendGoodyBagRequest> {
    @Override // X.InterfaceC31105CIr
    public final SendGoodyBagRequest LIZ(Q9H q9h) {
        SendGoodyBagRequest sendGoodyBagRequest = new SendGoodyBagRequest();
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
                                sendGoodyBagRequest.coinParam = _SendGoodyBagRequest_CoinGoodyBagParam_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            sendGoodyBagRequest.commonParam = _GoodyBagCommonSelected_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        sendGoodyBagRequest.roomId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    sendGoodyBagRequest.biz = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return sendGoodyBagRequest;
            }
        }
    }
}
