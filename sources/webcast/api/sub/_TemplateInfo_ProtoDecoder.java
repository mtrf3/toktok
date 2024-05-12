package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _TemplateInfo_ProtoDecoder implements InterfaceC31105CIr<TemplateInfo> {
    public static TemplateInfo LIZIZ(Q9H q9h) {
        TemplateInfo templateInfo = new TemplateInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        templateInfo.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        templateInfo.iapId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        templateInfo.tplType = q9h.LJIIJ();
                        break;
                    case 4:
                        templateInfo.payChannel = q9h.LJIIJ();
                        break;
                    case 5:
                        templateInfo.subCircle = q9h.LJIIJ();
                        break;
                    case 6:
                        templateInfo.coins = q9h.LJIIJJI();
                        break;
                    case 7:
                        templateInfo.shouldDisplay = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        templateInfo.tplName = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        templateInfo.currency = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        templateInfo.amount = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        templateInfo.moneyDisplay = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        templateInfo.offerInfo = _OfferInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        templateInfo.confirmedPrice = Q9J.LIZ(q9h);
                        break;
                    case 14:
                        templateInfo.productTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        templateInfo.productDesc = Q9J.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        templateInfo.tagInfo = _TagInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return templateInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TemplateInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
