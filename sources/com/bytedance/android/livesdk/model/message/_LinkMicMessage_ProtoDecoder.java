package com.bytedance.android.livesdk.model.message;

import X.C61447O9r;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _LinkMicMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicMessage LIZ(Q9H q9h) {
        LinkMicMessage linkMicMessage = new LinkMicMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkMicMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkMicMessage.mType = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        linkMicMessage.accessKey = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        linkMicMessage.anchorLinkMicId = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        linkMicMessage.userId = q9h.LJIIJJI();
                        break;
                    case 6:
                        linkMicMessage.fanTicket = q9h.LJIIJJI();
                        break;
                    case 7:
                        linkMicMessage.totalFanTicket = q9h.LJIIJJI();
                        break;
                    case 8:
                        linkMicMessage.channelId = q9h.LJIIJJI();
                        break;
                    case 9:
                        linkMicMessage.layout = (int) q9h.LJIIJJI();
                        break;
                    case 10:
                        linkMicMessage.vendor = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        linkMicMessage.dimension = (int) q9h.LJIIJJI();
                        break;
                    case 12:
                        linkMicMessage.theme = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        linkMicMessage.inviteUid = q9h.LJIIJJI();
                        break;
                    case 14:
                        linkMicMessage.reply = (int) q9h.LJIIJJI();
                        break;
                    case 15:
                    case 17:
                    case 22:
                    case 23:
                    case 24:
                    case 31:
                    case 33:
                    case 36:
                    case 42:
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    case C61447O9r.LJIIJ:
                    case 50:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        linkMicMessage.duration = (int) q9h.LJIIJJI();
                        break;
                    case 18:
                        linkMicMessage.matchType = (int) q9h.LJIIJJI();
                        break;
                    case 19:
                        linkMicMessage.win = Q9J.LIZ(q9h);
                        break;
                    case 20:
                        linkMicMessage.prompts = Q9J.LIZIZ(q9h);
                        break;
                    case 21:
                        linkMicMessage.toUserId = q9h.LJIIJJI();
                        break;
                    case 25:
                        linkMicMessage.tips = Q9J.LIZIZ(q9h);
                        break;
                    case 26:
                        linkMicMessage.startTimeMs = q9h.LJIIJJI();
                        break;
                    case 27:
                        linkMicMessage.confluenceType = q9h.LJIIJ();
                        break;
                    case 28:
                        linkMicMessage.fromRoomId = q9h.LJIIJJI();
                        break;
                    case 29:
                        linkMicMessage.inviteType = (int) q9h.LJIIJJI();
                        break;
                    case 30:
                        linkMicMessage.subType = q9h.LJIIJJI();
                        break;
                    case 32:
                        linkMicMessage.rtcExtInfo = Q9J.LIZIZ(q9h);
                        break;
                    case 34:
                        linkMicMessage.appId = Q9J.LIZIZ(q9h);
                        break;
                    case 35:
                        linkMicMessage.appSign = Q9J.LIZIZ(q9h);
                        break;
                    case 37:
                        linkMicMessage.anchorLinkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 38:
                        linkMicMessage.rivalAnchorId = q9h.LJIIJJI();
                        break;
                    case 39:
                        linkMicMessage.rivalLinkmicId = (int) q9h.LJIIJJI();
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        linkMicMessage.rivalLinkmicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 41:
                        linkMicMessage.shouldShowPopup = Q9J.LIZ(q9h);
                        break;
                    case 51:
                        linkMicMessage.rtcJoinChannel = Q9J.LIZ(q9h);
                        break;
                    case 52:
                        linkMicMessage.fanTicketType = q9h.LJIIJ();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicMessage;
            }
        }
    }
}
