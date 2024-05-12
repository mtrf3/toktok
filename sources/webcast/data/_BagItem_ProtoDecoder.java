package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _BagItem_ProtoDecoder implements InterfaceC31105CIr<BagItem> {
    public static BagItem LIZIZ(Q9H q9h) {
        BagItem bagItem = new BagItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bagItem.itemType = q9h.LJIIJ();
                        break;
                    case 2:
                        bagItem.itemId = q9h.LJIIJJI();
                        break;
                    case 3:
                        bagItem.count = q9h.LJIIJJI();
                        break;
                    case 4:
                        bagItem.minExpireAt = q9h.LJIIJJI();
                        break;
                    case 5:
                        bagItem.name = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        bagItem.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        bagItem.previewImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        bagItem.banner = _GiftPanelBanner_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 10:
                        bagItem.available = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        bagItem.toast = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        bagItem.preUpdateInfo = _BagItemPreUpdateInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bagItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BagItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
