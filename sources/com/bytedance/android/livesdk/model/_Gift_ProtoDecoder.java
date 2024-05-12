package com.bytedance.android.livesdk.model;

import X.C61447O9r;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftColorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _Gift_ProtoDecoder implements InterfaceC31105CIr<Gift> {
    public static Gift LIZIZ(Q9H q9h) {
        Gift gift = new Gift();
        gift.trackerParams = new HashMap();
        gift.colorInfos = new ArrayList();
        gift.giftVerticalScenarios = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 4) {
                            if (LJI != 5) {
                                if (LJI != 7) {
                                    if (LJI != 21) {
                                        if (LJI != 24) {
                                            switch (LJI) {
                                                case 10:
                                                    gift.combo = Q9J.LIZ(q9h);
                                                    break;
                                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                    gift.type = q9h.LJIIJ();
                                                    break;
                                                case 12:
                                                    gift.diamondCount = q9h.LJIIJ();
                                                    break;
                                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                    gift.isDisplayedOnPanel = Q9J.LIZ(q9h);
                                                    break;
                                                case 14:
                                                    gift.primaryEffectId = q9h.LJIIJJI();
                                                    break;
                                                case 15:
                                                    gift.leftLogo = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                                    gift.name = Q9J.LIZIZ(q9h);
                                                    break;
                                                default:
                                                    switch (LJI) {
                                                        case 47:
                                                            gift.previewImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                            break;
                                                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                                                            gift.giftPanelBanner = _GiftPanelBanner_ProtoDecoder.LIZIZ(q9h);
                                                            break;
                                                        case C61447O9r.LJIIJ:
                                                            gift.isBroadcastGift = Q9J.LIZ(q9h);
                                                            break;
                                                        case 50:
                                                            gift.isEffectBEFView = Q9J.LIZ(q9h);
                                                            break;
                                                        case 51:
                                                            gift.isRandomGift = Q9J.LIZ(q9h);
                                                            break;
                                                        case 52:
                                                            gift.isBoxGift = Q9J.LIZ(q9h);
                                                            break;
                                                        case 53:
                                                            gift.canPutInGiftBox = Q9J.LIZ(q9h);
                                                            break;
                                                        case 54:
                                                            gift.giftBoxInfo = _GiftBoxInfo_ProtoDecoder.LIZIZ(q9h);
                                                            break;
                                                        default:
                                                            switch (LJI) {
                                                                case 100:
                                                                    long LIZJ2 = q9h.LIZJ();
                                                                    String str = null;
                                                                    String str2 = null;
                                                                    while (true) {
                                                                        int LJI2 = q9h.LJI();
                                                                        if (LJI2 != -1) {
                                                                            if (LJI2 != 1) {
                                                                                if (LJI2 == 2) {
                                                                                    str2 = Q9J.LIZIZ(q9h);
                                                                                }
                                                                            } else {
                                                                                str = Q9J.LIZIZ(q9h);
                                                                            }
                                                                        } else {
                                                                            q9h.LJ(LIZJ2);
                                                                            if (str != null) {
                                                                                if (str2 != null) {
                                                                                    gift.trackerParams.put(str, str2);
                                                                                    break;
                                                                                } else {
                                                                                    throw new IllegalStateException("Map value must not be null!");
                                                                                }
                                                                            } else {
                                                                                throw new IllegalStateException("Map key must not be null!");
                                                                            }
                                                                        }
                                                                    }
                                                                case 101:
                                                                    gift.giftSubInfo = _GiftLockInfo_ProtoDecoder.LIZIZ(q9h);
                                                                    break;
                                                                case 102:
                                                                    gift.colorInfos.add(_GiftColorInfo_ProtoDecoder.LIZIZ(q9h));
                                                                    break;
                                                                case 103:
                                                                    gift.recommendInfo = Q9J.LIZIZ(q9h);
                                                                    break;
                                                                case 104:
                                                                    gift.randomEffectInfo = _GiftRandomEffectInfo_ProtoDecoder.LIZIZ(q9h);
                                                                    break;
                                                                case 105:
                                                                    gift.giftSubType = q9h.LJIIJ();
                                                                    break;
                                                                case 106:
                                                                    gift.giftVerticalScenarios.add(Integer.valueOf(q9h.LJIIJ()));
                                                                    break;
                                                                default:
                                                                    Q9J.LIZJ(q9h);
                                                                    break;
                                                            }
                                                    }
                                            }
                                        } else {
                                            gift.liveUserPngInfo = Q9J.LIZIZ(q9h);
                                        }
                                    } else {
                                        gift.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    gift.forLinkMic = Q9J.LIZ(q9h);
                                }
                            } else {
                                gift.id = q9h.LJIIJJI();
                            }
                        } else {
                            gift.duration = (int) q9h.LJIIJJI();
                        }
                    } else {
                        gift.describe = Q9J.LIZIZ(q9h);
                    }
                } else {
                    gift.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gift;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Gift LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
