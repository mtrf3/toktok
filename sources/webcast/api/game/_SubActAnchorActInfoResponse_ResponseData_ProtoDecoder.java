package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import webcast.api.game.SubActAnchorActInfoResponse;

/* loaded from: classes17.dex */
public final class _SubActAnchorActInfoResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SubActAnchorActInfoResponse.ResponseData> {
    public static SubActAnchorActInfoResponse.ResponseData LIZIZ(Q9H q9h) {
        SubActAnchorActInfoResponse.ResponseData responseData = new SubActAnchorActInfoResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.anchorId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        responseData.anchorAvatar = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        responseData.anchorName = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        responseData.inActivity = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        responseData.subscribeAudienceNum = q9h.LJIIJJI();
                        break;
                    case 6:
                        responseData.expired = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        responseData.anchorCanClaim = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        responseData.anchorHaveClaimed = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        responseData.anchorClaimNum = q9h.LJIIJJI();
                        break;
                    case 10:
                        responseData.claimNum = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        responseData.activityFinishNum = q9h.LJIIJJI();
                        break;
                    case 12:
                        responseData.activityHaveFinished = Q9J.LIZ(q9h);
                        break;
                    default:
                        switch (LJI) {
                            case 20:
                                responseData.canSubscribe = Q9J.LIZ(q9h);
                                break;
                            case 21:
                                responseData.audienceCanClaim = Q9J.LIZ(q9h);
                                break;
                            case 22:
                                responseData.audienceHaveClaimed = Q9J.LIZ(q9h);
                                break;
                            case 23:
                                responseData.rewardUnclaimedNum = q9h.LJIIJJI();
                                break;
                            case 24:
                                responseData.rewardClaimedNum = q9h.LJIIJJI();
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubActAnchorActInfoResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
