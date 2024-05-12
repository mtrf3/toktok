package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.RulesAndGuidanceResponse;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceResponse.ResponseData> {
    public static RulesAndGuidanceResponse.ResponseData LIZIZ(Q9H q9h) {
        RulesAndGuidanceResponse.ResponseData responseData = new RulesAndGuidanceResponse.ResponseData();
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
                                    responseData.checkBubble = _CheckBubble_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                responseData.contentArea = _RulesAndGuidanceContentArea_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            responseData.functionArea = _RulesAndGuidanceFunctionArea_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.bannerArea = _RulesAndGuidanceBannerArea_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.config = _RulesAndGuidanceConfig_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
