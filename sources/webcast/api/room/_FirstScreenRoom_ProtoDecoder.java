package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.message.proto._LiveProInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.bytedance.android.livesdk.model._InteractionQuestionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._PollInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomAuthStatus_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomDecoration_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomStats_ProtoDecoder;
import com.bytedance.android.livesdk.model._TopFrameSummary_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BALinkStruct_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._CommerceStruct_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _FirstScreenRoom_ProtoDecoder implements InterfaceC31105CIr<FirstScreenRoom> {
    public static FirstScreenRoom LIZIZ(Q9H q9h) {
        FirstScreenRoom firstScreenRoom = new FirstScreenRoom();
        firstScreenRoom.decoList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        firstScreenRoom.stats = _RoomStats_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        firstScreenRoom.roomAuth = _RoomAuthStatus_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        firstScreenRoom.interactionQuestion = _InteractionQuestionInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        firstScreenRoom.liveSubOnly = q9h.LJIIJJI();
                        break;
                    case 5:
                        firstScreenRoom.multiLiveApplyPermission = q9h.LJIIJJI();
                        break;
                    case 6:
                        firstScreenRoom.withLinkmic = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        firstScreenRoom.roomLayout = q9h.LJIIJJI();
                        break;
                    case 8:
                        firstScreenRoom.leadsGenModel = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        firstScreenRoom.leadsGenPermission = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        firstScreenRoom.baLinkInfo = _BALinkStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        firstScreenRoom.commerceInfo = _CommerceStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        firstScreenRoom.advancedPollInfo = _PollInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        firstScreenRoom.interactionQuestionVersion = q9h.LJIIJ();
                        break;
                    case 14:
                        firstScreenRoom.liveTypeThirdParty = Q9J.LIZ(q9h);
                        break;
                    case 15:
                        firstScreenRoom.liveTypeScreenshot = Q9J.LIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        firstScreenRoom.decoList.add(_RoomDecoration_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 17:
                        firstScreenRoom.hashtag = _Hashtag_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 18:
                        firstScreenRoom.anchorTabType = q9h.LJIIJ();
                        break;
                    case 19:
                        firstScreenRoom.topFrameSummary = _TopFrameSummary_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 20:
                        firstScreenRoom.userCount = q9h.LJIIJJI();
                        break;
                    case 21:
                        firstScreenRoom.totalUser = q9h.LJIIJJI();
                        break;
                    case 22:
                        firstScreenRoom.supportQuiz = q9h.LJIIJJI();
                        break;
                    case 23:
                        firstScreenRoom.likeCount = q9h.LJIIJJI();
                        break;
                    case 24:
                        firstScreenRoom.anchorLiveProInfo = _LiveProInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return firstScreenRoom;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FirstScreenRoom LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
