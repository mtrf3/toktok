package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _MemberMessage_ProtoDecoder implements InterfaceC31105CIr<MemberMessage> {
    public static MemberMessage LIZIZ(Q9H q9h) {
        MemberMessage memberMessage = new MemberMessage();
        memberMessage.adminPermissions = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        memberMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        memberMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        memberMessage.count = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        memberMessage.operator = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        memberMessage.setToAdmin = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        memberMessage.isTopUser = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        memberMessage.rankScore = (int) q9h.LJIIJJI();
                        break;
                    case 8:
                        memberMessage.topUserNo = (int) q9h.LJIIJJI();
                        break;
                    case 9:
                        memberMessage.enterType = (int) q9h.LJIIJJI();
                        break;
                    case 10:
                        memberMessage.action = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        memberMessage.actionDescription = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        memberMessage.userId = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 14:
                        memberMessage.popStr = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        memberMessage.effectConfig = _MemberMessage_EffectConfigBean_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 17:
                        memberMessage.background = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 18:
                        memberMessage.anchorDisplayText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 19:
                        memberMessage.clientEnterSource = Q9J.LIZIZ(q9h);
                        break;
                    case 20:
                        memberMessage.clientEnterType = Q9J.LIZIZ(q9h);
                        break;
                    case 21:
                        memberMessage.clientLiveReason = Q9J.LIZIZ(q9h);
                        break;
                    case 22:
                        memberMessage.actionDuration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 23:
                        memberMessage.userShareType = Q9J.LIZIZ(q9h);
                        break;
                    case 24:
                        memberMessage.displayStyle = q9h.LJIIJ();
                        break;
                    case 25:
                        long LIZJ2 = q9h.LIZJ();
                        Integer num = null;
                        Integer num2 = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        num2 = Integer.valueOf(q9h.LJIIJ());
                                    }
                                } else {
                                    num = Integer.valueOf(q9h.LJIIJ());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (num != null) {
                                    if (num2 != null) {
                                        memberMessage.adminPermissions.put(num, num2);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 26:
                        memberMessage.kickSource = q9h.LJIIJ();
                        break;
                    case 27:
                        memberMessage.allowPreviewTime = q9h.LJIIJJI();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return memberMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MemberMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
