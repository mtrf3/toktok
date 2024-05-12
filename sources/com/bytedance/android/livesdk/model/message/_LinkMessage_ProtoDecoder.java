package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.linksetting._MultiLiveUpdateUserSettingContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.accpet_notice_message._LinkerAcceptNoticeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.cancel_message._LinkerCancelContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.enter_message._LinkerEnterContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.invite_message._LinkerInviteContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.kick_out_message._LinkerKickOutContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.leave_message._LinkerLeaveContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message._LinkedListChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage._LinkerListChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.mic_update._LinkerMicIdxUpdateContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.mute_message._LinkerMuteContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message._LinkerRandomMatchContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.reply_message._LinkerReplyContent_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _LinkMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMessage LIZ(Q9H q9h) {
        LinkMessage linkMessage = new LinkMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 101) {
                    if (LJI != 102) {
                        switch (LJI) {
                            case 1:
                                linkMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 2:
                                linkMessage.messageType = (int) q9h.LJIIJJI();
                                break;
                            case 3:
                                linkMessage.channelId = q9h.LJIIJJI();
                                break;
                            case 4:
                                linkMessage.scene = (int) q9h.LJIIJJI();
                                break;
                            case 5:
                                linkMessage.inviteContent = _LinkerInviteContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 6:
                                linkMessage.replyContent = _LinkerReplyContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 7:
                                linkMessage.createContent = _LinkerCreateContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 8:
                                LinkerCloseContent linkerCloseContent = new LinkerCloseContent();
                                long LIZJ2 = q9h.LIZJ();
                                while (q9h.LJI() != -1) {
                                    Q9J.LIZJ(q9h);
                                }
                                q9h.LJ(LIZJ2);
                                linkMessage.closeContent = linkerCloseContent;
                                break;
                            case 9:
                                linkMessage.enterContent = _LinkerEnterContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 10:
                                linkMessage.leaveContent = _LinkerLeaveContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                linkMessage.cancelContent = _LinkerCancelContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 12:
                                linkMessage.kickOutContent = _LinkerKickOutContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                linkMessage.linkedListChangeContent = _LinkedListChangeContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 14:
                                linkMessage.updateUserContent = _LinkerUpdateUserContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 15:
                                LinkerWaitingListChangeContent linkerWaitingListChangeContent = new LinkerWaitingListChangeContent();
                                long LIZJ3 = q9h.LIZJ();
                                while (q9h.LJI() != -1) {
                                    Q9J.LIZJ(q9h);
                                }
                                q9h.LJ(LIZJ3);
                                linkMessage.waitingListChangeContent = linkerWaitingListChangeContent;
                                break;
                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                linkMessage.muteContent = _LinkerMuteContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 17:
                                linkMessage.randomMatchContent = _LinkerRandomMatchContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 18:
                                linkMessage.multiLiveUpdateUserSettingContent = _MultiLiveUpdateUserSettingContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 19:
                                linkMessage.micIdxUpdateContent = _LinkerMicIdxUpdateContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 20:
                                linkMessage.mListChangeContent = _LinkerListChangeContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 21:
                                linkMessage.cohostListChangeContent = _CohostListChangeContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 22:
                                linkMessage.mediaChangeContent = _LinkerMediaChangeContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 23:
                                linkMessage.acceptNoticeContentMessage = _LinkerAcceptNoticeContent_ProtoDecoder.LIZIZ(q9h);
                                break;
                            default:
                                switch (LJI) {
                                    case 200:
                                        linkMessage.extraStr = Q9J.LIZIZ(q9h);
                                        break;
                                    case 201:
                                        linkMessage.expireTimestamp = q9h.LJIIJJI();
                                        break;
                                    case 202:
                                        linkMessage.transferExtra = Q9J.LIZIZ(q9h);
                                        break;
                                    default:
                                        Q9J.LIZJ(q9h);
                                        break;
                                }
                        }
                    } else {
                        linkMessage.userToastContent = _LinkmicUserToastContent_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    linkMessage.sysKickOutContent = _LinkerSysKickOutContent_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMessage;
            }
        }
    }
}
