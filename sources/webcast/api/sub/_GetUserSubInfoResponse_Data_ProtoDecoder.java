package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.subscribe.model._SubOnlyLiveInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubscribingInfo_ProtoDecoder;
import webcast.api.sub.GetUserSubInfoResponse;

/* loaded from: classes6.dex */
public final class _GetUserSubInfoResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetUserSubInfoResponse.Data> {
    public static GetUserSubInfoResponse.Data LIZIZ(Q9H q9h) {
        GetUserSubInfoResponse.Data data = new GetUserSubInfoResponse.Data();
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
                                    data.userBuyGiftSubAuth = Q9J.LIZ(q9h);
                                }
                            } else {
                                data.subOnlyLiveInfo = _SubOnlyLiveInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            data.scenarioText = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        data.subScenario = q9h.LJIIJ();
                    }
                } else {
                    data.subscribing = _SubscribingInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetUserSubInfoResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
