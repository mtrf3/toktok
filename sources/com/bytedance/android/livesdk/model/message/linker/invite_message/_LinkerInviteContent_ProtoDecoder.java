package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalExtraInfo_Tag_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABTestSetting_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message._InviteTopHostInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkmicUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PerceptionDialogInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkerInviteContent_ProtoDecoder implements InterfaceC31105CIr<LinkerInviteContent> {
    public static LinkerInviteContent LIZIZ(Q9H q9h) {
        LinkerInviteContent linkerInviteContent = new LinkerInviteContent();
        linkerInviteContent.linkedUsers = new ArrayList();
        linkerInviteContent.abTestSetting = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 101) {
                    switch (LJI) {
                        case 1:
                            linkerInviteContent.fromUserId = q9h.LJIIJJI();
                            break;
                        case 2:
                            linkerInviteContent.fromRoomId = q9h.LJIIJJI();
                            break;
                        case 3:
                            linkerInviteContent.toRtcExtInfo = Q9J.LIZIZ(q9h);
                            break;
                        case 4:
                            linkerInviteContent.rtcJoinChannel = Q9J.LIZ(q9h);
                            break;
                        case 5:
                            linkerInviteContent.vendor = (int) q9h.LJIIJJI();
                            break;
                        case 6:
                            linkerInviteContent.secFromUserId = Q9J.LIZIZ(q9h);
                            break;
                        case 7:
                            linkerInviteContent.toLinkmicIdStr = Q9J.LIZIZ(q9h);
                            break;
                        case 8:
                            linkerInviteContent.user = _User_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 9:
                            linkerInviteContent.requiredMicIdx = Long.valueOf(q9h.LJIIJJI());
                            break;
                        case 10:
                            long LIZJ2 = q9h.LIZJ();
                            Long l = null;
                            String str = null;
                            while (true) {
                                int LJI2 = q9h.LJI();
                                if (LJI2 != -1) {
                                    if (LJI2 != 1) {
                                        if (LJI2 == 2) {
                                            str = Q9J.LIZIZ(q9h);
                                        }
                                    } else {
                                        l = Long.valueOf(q9h.LJIIJJI());
                                    }
                                } else {
                                    q9h.LJ(LIZJ2);
                                    if (l != null) {
                                        if (str != null) {
                                            linkerInviteContent.rtcExtInfoMap.put(l, str);
                                            break;
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            }
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            linkerInviteContent.multiLiveLayoutEnable = q9h.LJIIJ();
                            break;
                        case 12:
                            linkerInviteContent.multiLiveSetting = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            linkerInviteContent.fromLinkmicIdStr = Q9J.LIZIZ(q9h);
                            break;
                        default:
                            switch (LJI) {
                                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                    linkerInviteContent.fromTopHostInfo = _InviteTopHostInfo_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                case 17:
                                    linkerInviteContent.actionId = Long.valueOf(q9h.LJIIJJI());
                                    break;
                                case 18:
                                    linkerInviteContent.linkedUsers.add(_LinkmicUserInfo_ProtoDecoder.LIZIZ(q9h));
                                    break;
                                case 19:
                                    linkerInviteContent.dialogInfo = _PerceptionDialogInfo_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                case 20:
                                    linkerInviteContent.punishEventInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                case 21:
                                    linkerInviteContent.fromRoomAgeRestricted = q9h.LJIIJ();
                                    break;
                                case 22:
                                    linkerInviteContent.tag = _RivalExtraInfo_Tag_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                case 23:
                                    linkerInviteContent.abTestSetting.add(_CohostABTestSetting_ProtoDecoder.LIZIZ(q9h));
                                    break;
                                default:
                                    Q9J.LIZJ(q9h);
                                    break;
                            }
                    }
                } else {
                    linkerInviteContent.linkerInviteMsgExtra = _LinkerInviteMessageExtra_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerInviteContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerInviteContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
