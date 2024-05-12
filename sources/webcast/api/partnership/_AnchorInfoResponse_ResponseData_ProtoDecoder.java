package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._PartnershipBriefDrops_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipGameEvent_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import webcast.api.partnership.AnchorInfoResponse;

/* loaded from: classes6.dex */
public final class _AnchorInfoResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorInfoResponse.ResponseData> {
    public static AnchorInfoResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorInfoResponse.ResponseData responseData = new AnchorInfoResponse.ResponseData();
        responseData.punishInfo = new ArrayList();
        responseData.priceUpdateList = new ArrayList();
        responseData.enableDropsList = new ArrayList();
        responseData.enableEventList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.punishInfo.add(_AnchorInfoResponse_PunishInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        responseData.priceUpdateList.add(_AnchorInfoResponse_TaskPriceUpdate_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        responseData.labelFilterInfo = _AnchorInfoResponse_LabelFilterInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        responseData.taxpayoutconfirm = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        responseData.enableEventList.add(_PartnershipGameEvent_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        responseData.enableDropsList.add(_PartnershipBriefDrops_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        responseData.toggleStatus = q9h.LJIIJ();
                        break;
                    case 8:
                        responseData.shootPermission = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        responseData.businessPartnership = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        responseData.dropsEntrance = _AnchorInfoResponse_DropsEntrance_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        responseData.partnershipInfo = _AnchorInfoResponse_PartnershipInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        responseData.toggleInfo = _AnchorInfoResponse_ToggleInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        responseData.liveTakeDecouple = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorInfoResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
