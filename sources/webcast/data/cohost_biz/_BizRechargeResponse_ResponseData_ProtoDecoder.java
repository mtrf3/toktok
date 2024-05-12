package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common._CohostUserInfo_ProtoDecoder;
import webcast.data.cohost_biz.BizRechargeResponse;

/* loaded from: classes14.dex */
public final class _BizRechargeResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BizRechargeResponse.ResponseData> {
    public static BizRechargeResponse.ResponseData LIZIZ(Q9H q9h) {
        BizRechargeResponse.ResponseData responseData = new BizRechargeResponse.ResponseData();
        responseData.userInfos = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    Long l = null;
                    CohostUserInfo cohostUserInfo = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                cohostUserInfo = _CohostUserInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            l = Long.valueOf(q9h.LJIIJJI());
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (l != null) {
                        if (cohostUserInfo != null) {
                            responseData.userInfos.put(l, cohostUserInfo);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizRechargeResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
