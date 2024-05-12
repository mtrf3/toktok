package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftsInfo_ProtoDecoder implements InterfaceC31105CIr<GiftsInfo> {
    public static GiftsInfo LIZIZ(Q9H q9h) {
        GiftsInfo giftsInfo = new GiftsInfo();
        giftsInfo.giftGroupInfos = new ArrayList();
        giftsInfo.giftComboInfos = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 3) {
                        if (LJI != 4) {
                            if (LJI != 5) {
                                if (LJI != 10) {
                                    if (LJI != 11) {
                                        switch (LJI) {
                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                giftsInfo.giftComboInfos.add(_GiftComboInfo_ProtoDecoder.LIZIZ(q9h));
                                                break;
                                            case 14:
                                                giftsInfo.showFirstRechargeEntrance = Boolean.valueOf(Q9J.LIZ(q9h));
                                                break;
                                            case 15:
                                                giftsInfo.enableFirstRechargeDynamicEffect = Boolean.valueOf(Q9J.LIZ(q9h));
                                                break;
                                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                                giftsInfo.firstRechargeGiftInfo = _LiveLimitedTimeDiscountGiftInfo_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 17:
                                                giftsInfo.compensationGiftInfo = _LiveLimitedTimeDiscountGiftInfo_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 18:
                                                giftsInfo.giftIconInfo = _GiftIconInfo_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 19:
                                                giftsInfo.recentlySentColorGiftId = Long.valueOf(q9h.LJIIJJI());
                                                break;
                                            case 20:
                                                giftsInfo.defaultLocColorGiftId = Long.valueOf(q9h.LJIIJJI());
                                                break;
                                            case 21:
                                                giftsInfo.colorGiftIconAnimation = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 22:
                                                giftsInfo.recommendRandomGiftId = Long.valueOf(q9h.LJIIJJI());
                                                break;
                                            case 23:
                                                giftsInfo.giftPollInfo = _GiftPollInfo_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 24:
                                                giftsInfo.riskCtl = _RiskCtl_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 25:
                                                giftsInfo.freqLimitGiftInfo = _FreqLimitGiftInfo_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 26:
                                                giftsInfo.isUniversal = Q9J.LIZ(q9h);
                                                break;
                                            case 27:
                                                giftsInfo.bannerGiftBoxIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 28:
                                                giftsInfo.isDisplayGiftBox = Q9J.LIZ(q9h);
                                                break;
                                            case 29:
                                                giftsInfo.giftBoxSchemeUrl = Q9J.LIZIZ(q9h);
                                                break;
                                            case 30:
                                                giftsInfo.liveGoalLabelIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 31:
                                                giftsInfo.liveGoalBanner = _GiftPanelBanner_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            default:
                                                Q9J.LIZJ(q9h);
                                                break;
                                        }
                                    } else {
                                        giftsInfo.giftEntranceIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    giftsInfo.hideRecharge = Q9J.LIZ(q9h);
                                }
                            } else {
                                giftsInfo.giftGroupInfos.add(_GiftGroupCount_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            giftsInfo.giftWords = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        giftsInfo.mFastGiftId = q9h.LJIIJJI();
                    }
                } else {
                    giftsInfo.newGiftId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return giftsInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftsInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
