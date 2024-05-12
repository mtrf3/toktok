package webcast.api.profit;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.wallet.model._CustomizedDiamond_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.wallet._Diamond_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import webcast.api.profit.ListResult;

/* loaded from: classes17.dex */
public final class _ListResult_ListResultExtra_ProtoDecoder implements InterfaceC31105CIr<ListResult.ListResultExtra> {
    public static ListResult.ListResultExtra LIZIZ(Q9H q9h) {
        ListResult.ListResultExtra listResultExtra = new ListResult.ListResultExtra();
        listResultExtra.deprecated2 = new ArrayList();
        listResultExtra.fullList = new ArrayList();
        listResultExtra.customizedIds = new ArrayList();
        listResultExtra.currencyList = new ArrayList();
        listResultExtra.extraDiamondList = new ArrayList();
        listResultExtra.voucherList = new ArrayList();
        listResultExtra.signInfos = new ArrayList();
        listResultExtra.webDisplayData = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        listResultExtra.ployTraceId = q9h.LJIIJJI();
                        break;
                    case 2:
                        listResultExtra.defaultPacketId = q9h.LJIIJJI();
                        break;
                    case 3:
                        listResultExtra.firstChargePacketId = q9h.LJIIJJI();
                        break;
                    case 4:
                        listResultExtra.largePayUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        listResultExtra.showHint = q9h.LJIIJJI();
                        break;
                    case 6:
                        listResultExtra.applePayHintUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        listResultExtra.deprecated1 = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        listResultExtra.totalSigned = q9h.LJIIJJI();
                        break;
                    case 9:
                        listResultExtra.signInfos.add(Q9J.LIZIZ(q9h));
                        break;
                    case 10:
                        listResultExtra.deprecated3 = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        listResultExtra.recentlyPurchasedPacketId = q9h.LJIIJJI();
                        break;
                    case 12:
                        listResultExtra.deprecated2.add(_CustomizedDiamond_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        listResultExtra.channelId = q9h.LJIIJ();
                        break;
                    case 14:
                        listResultExtra.channel = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        listResultExtra.currencyList.add(Q9J.LIZIZ(q9h));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        listResultExtra.needAuth = q9h.LJIIJ();
                        break;
                    case 17:
                        listResultExtra.extraDiamondList.add(_ListResult_ExtraDiamondItem_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 18:
                        listResultExtra.isRecommend = Q9J.LIZ(q9h);
                        break;
                    case 19:
                        listResultExtra.isDefault = Q9J.LIZ(q9h);
                        break;
                    case 20:
                        listResultExtra.badgeIcon = Q9J.LIZIZ(q9h);
                        break;
                    case 21:
                        listResultExtra.defaultCurrency = Q9J.LIZIZ(q9h);
                        break;
                    case 22:
                        C29991Fr.LIZ(q9h, listResultExtra.customizedIds);
                        break;
                    case 23:
                        listResultExtra.minCustomizedDiamondCnt = q9h.LJIIJ();
                        break;
                    case 24:
                        listResultExtra.maxCustomizedDiamondCnt = q9h.LJIIJ();
                        break;
                    case 25:
                        listResultExtra.shouldDisplayCustomizedWebRecharge = Q9J.LIZ(q9h);
                        break;
                    case 26:
                        listResultExtra.recommendedPacketId = q9h.LJIIJJI();
                        break;
                    case 27:
                        listResultExtra.apUnitPrice = _ListResult_IapUnitPrice_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 28:
                        listResultExtra.gpUnitPrice = _ListResult_IapUnitPrice_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 29:
                        listResultExtra.merchantId = Q9J.LIZIZ(q9h);
                        break;
                    case 30:
                        listResultExtra.isWebRechargeAllowed = Q9J.LIZ(q9h);
                        break;
                    case 31:
                        listResultExtra.region = Q9J.LIZIZ(q9h);
                        break;
                    case 32:
                        listResultExtra.webRechargeCustom = _Diamond_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 33:
                        listResultExtra.insufficientBalanceAbGroupId = Q9J.LIZIZ(q9h);
                        break;
                    case 34:
                        listResultExtra.fullList.add(_Diamond_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 35:
                        listResultExtra.isNewRecommendPackage = Q9J.LIZ(q9h);
                        break;
                    case 36:
                        listResultExtra.useDefaultPacket = Q9J.LIZ(q9h);
                        break;
                    case 37:
                        listResultExtra.defaultPacketCoin = q9h.LJIIJJI();
                        break;
                    case 38:
                        listResultExtra.requestId = Q9J.LIZIZ(q9h);
                        break;
                    case 39:
                        listResultExtra.iapMinCustomizedDiamondCnt = q9h.LJIIJ();
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        listResultExtra.iapMaxCustomizedDiamondCnt = q9h.LJIIJ();
                        break;
                    case 41:
                        listResultExtra.activityInfo = _ListResult_ActivityInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 42:
                        listResultExtra.voucherList.add(_ListResult_VoucherItem_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                        listResultExtra.webDisplayData.add(_ListResult_WebDisplayData_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 44:
                        listResultExtra.pipoDomain = Q9J.LIZIZ(q9h);
                        break;
                    case 45:
                        listResultExtra.storeRegion = Q9J.LIZIZ(q9h);
                        break;
                    case 46:
                        listResultExtra.useWebRechargeStoreRegion = Q9J.LIZ(q9h);
                        break;
                    case 47:
                        listResultExtra.iapCustomData = _ListResult_IapCustomData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return listResultExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.ListResultExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
