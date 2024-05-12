package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BusinessContent_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import webcast.im._CancelJoinGroupContent_ProtoDecoder;
import webcast.im._GroupChangeContent_ProtoDecoder;
import webcast.im._JoinGroupContent_ProtoDecoder;
import webcast.im._LeaveJoinGroupContent_ProtoDecoder;
import webcast.im._P2PGroupChangeContent_ProtoDecoder;
import webcast.im._PermitJoinGroupContent_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkLayerMessage_ProtoDecoder implements InterfaceC31105CIr<LinkLayerMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkLayerMessage LIZ(Q9H q9h) {
        LinkLayerMessage linkLayerMessage = new LinkLayerMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    if (LJI != 100) {
                                        if (LJI != 200) {
                                            switch (LJI) {
                                                case 102:
                                                    linkLayerMessage.listContent = _LinkListChangeContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 103:
                                                    linkLayerMessage.inviteContent = _InviteContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 104:
                                                    linkLayerMessage.applyContent = _ApplyContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 105:
                                                    linkLayerMessage.permitApplyContent = _PermitApplyContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 106:
                                                    linkLayerMessage.replyInviteContent = _ReplyInviteContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 107:
                                                    linkLayerMessage.kickOutContent = _KickOutContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 108:
                                                    linkLayerMessage.cancelApplyContent = _CancelApplyContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 109:
                                                    linkLayerMessage.cancelInviteContent = _CancelInviteContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 110:
                                                    linkLayerMessage.leaveContent = _LeaveContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 111:
                                                    linkLayerMessage.finishContent = _FinishChannelContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 112:
                                                    linkLayerMessage.joinDirectContent = _JoinDirectContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 113:
                                                    linkLayerMessage.joinGroupContent = _JoinGroupContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 114:
                                                    linkLayerMessage.permitGroupContent = _PermitJoinGroupContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 115:
                                                    linkLayerMessage.cancelGroupContent = _CancelJoinGroupContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 116:
                                                    linkLayerMessage.leaveGroupContent = _LeaveJoinGroupContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 117:
                                                    linkLayerMessage.p2pGroupChangeContent = _P2PGroupChangeContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                case 118:
                                                    linkLayerMessage.groupChangeContent = _GroupChangeContent_ProtoDecoder.LIZIZ(q9h);
                                                    break;
                                                default:
                                                    Q9J.LIZJ(q9h);
                                                    break;
                                            }
                                        } else {
                                            linkLayerMessage.bizContent = _BusinessContent_ProtoDecoder.LIZIZ(q9h);
                                        }
                                    } else {
                                        linkLayerMessage.createChannelContent = _CreateChannelContent_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    linkLayerMessage.source = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                linkLayerMessage.scene = q9h.LJIIJ();
                            }
                        } else {
                            linkLayerMessage.channelId = q9h.LJIIJJI();
                        }
                    } else {
                        linkLayerMessage.messageType = q9h.LJIIJ();
                    }
                } else {
                    linkLayerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkLayerMessage;
            }
        }
    }
}
