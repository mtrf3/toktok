package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import webcast.api.envelope.EnvelopeTemplateResponse;

/* loaded from: classes17.dex */
public final class _EnvelopeTemplateResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<EnvelopeTemplateResponse.ResponseData> {
    public static EnvelopeTemplateResponse.ResponseData LIZIZ(Q9H q9h) {
        EnvelopeTemplateResponse.ResponseData responseData = new EnvelopeTemplateResponse.ResponseData();
        responseData.envelopeTemplates = new ArrayList();
        responseData.portalTemplates = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.envelopeTemplates.add(_EnvelopeTemplateResponse_EnvelopeTemplate_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        responseData.customRule = _EnvelopeTemplateResponse_CustomRule_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        responseData.portalTemplate = _EnvelopeTemplateResponse_PortalTemplate_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        responseData.showPortalRedDot = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        responseData.isGpppa = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        responseData.specialRoomType = q9h.LJIIJ();
                        break;
                    case 7:
                        responseData.treasureOnBoardPermit = _EnvelopeTemplateResponse_AnchorOnBoardPermit_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        responseData.portalOnBoardPermit = _EnvelopeTemplateResponse_AnchorOnBoardPermit_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        responseData.portalTemplates.add(_EnvelopeTemplateResponse_PortalTemplate_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 10:
                        responseData.portalCustomRule = _EnvelopeTemplateResponse_PortalCustomRule_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        responseData.portalPermissionRecalled = Q9J.LIZ(q9h);
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
    public final EnvelopeTemplateResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
