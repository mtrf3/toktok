package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model._BannerInRoom_ProtoDecoder;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _Prop_ProtoDecoder implements InterfaceC31105CIr<Prop> {
    public static Prop LIZIZ(Q9H q9h) {
        Prop prop = new Prop();
        prop.gifts = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        prop.primaryEffectId = (int) q9h.LJIIJJI();
                        break;
                    case 2:
                        prop.nextExpire = q9h.LJIIJJI();
                        break;
                    case 3:
                        prop.description = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        prop.id = q9h.LJIIJJI();
                        break;
                    case 5:
                        prop.manual = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        prop.diamond = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        prop.reddotTip = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        prop.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        prop.count = q9h.LJIIJ();
                        break;
                    case 10:
                        prop.name = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        prop.gift = _Gift_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        prop.labelIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        prop.isFragment = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 14:
                        prop.fragmentsCompoundCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 15:
                        prop.isAwemeFreeGift = (int) q9h.LJIIJJI();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        prop.diamondLabel = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 17:
                        prop.banner = _BannerInRoom_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 18:
                        prop.propType = q9h.LJIIJJI();
                        break;
                    case 19:
                        prop.gifts.add(_HotfixGiftDataForProp_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 20:
                        prop.schemeUrl = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return prop;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Prop LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
