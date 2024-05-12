package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _GiftSubTemplateInfo_ProtoDecoder implements InterfaceC31105CIr<GiftSubTemplateInfo> {
    public static GiftSubTemplateInfo LIZIZ(Q9H q9h) {
        GiftSubTemplateInfo giftSubTemplateInfo = new GiftSubTemplateInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftSubTemplateInfo.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        giftSubTemplateInfo.iapId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        giftSubTemplateInfo.tplType = q9h.LJIIJ();
                        break;
                    case 4:
                        giftSubTemplateInfo.shouldDisplay = Q9J.LIZ(q9h);
                        break;
                    case 5:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 6:
                        giftSubTemplateInfo.currency = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        giftSubTemplateInfo.unitPriceMicros = q9h.LJIIJJI();
                        break;
                    case 8:
                        giftSubTemplateInfo.count = q9h.LJIIJJI();
                        break;
                    case 9:
                        giftSubTemplateInfo.isCustomize = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        giftSubTemplateInfo.maxCount = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        giftSubTemplateInfo.priceAmountMicros = q9h.LJIIJJI();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftSubTemplateInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftSubTemplateInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
