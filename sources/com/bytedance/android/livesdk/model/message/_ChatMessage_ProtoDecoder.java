package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.emoji._EmoteWithIndex_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import webcast.data._MsgFilter_ProtoDecoder;
import webcast.data._UserIdentity_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _ChatMessage_ProtoDecoder implements InterfaceC31105CIr<ChatMessage> {
    public static ChatMessage LIZIZ(Q9H q9h) {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.commentQualityScores = new ArrayList();
        chatMessage.f117emotes = new ArrayList();
        chatMessage.commentTag = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        chatMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        chatMessage.userInfo = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        chatMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        chatMessage.visibleToSender = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        chatMessage.background = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        chatMessage.fullScreenTextColor = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        chatMessage.backgroundImageV2 = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 9:
                        chatMessage.publicAreaCommon = _PublicAreaCommon_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        chatMessage.giftImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        chatMessage.inputType = q9h.LJIIJ();
                        break;
                    case 12:
                        chatMessage.atUser = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        chatMessage.f117emotes.add(_EmoteWithIndex_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 14:
                        chatMessage.contentLanguage = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        chatMessage.msgFilter = _MsgFilter_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        chatMessage.quickChatScene = q9h.LJIIJ();
                        break;
                    case 17:
                        chatMessage.communityflaggedStatus = q9h.LJIIJ();
                        break;
                    case 18:
                        chatMessage.userIdentity = _UserIdentity_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 19:
                        chatMessage.commentQualityScores.add(_CommentQualityScore_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 20:
                        chatMessage.commentTag.add(Integer.valueOf(q9h.LJIIJ()));
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return chatMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ChatMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
