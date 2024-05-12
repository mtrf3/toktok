package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalExtraInfo_Tag_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PerceptionDialogInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _JoinGroupBizContent_ProtoDecoder implements InterfaceC31105CIr<JoinGroupBizContent> {
    public static JoinGroupBizContent LIZIZ(Q9H q9h) {
        JoinGroupBizContent joinGroupBizContent = new JoinGroupBizContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    if (LJI != 101) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        joinGroupBizContent.joinGroupMsgExtra = _JoinGroupMessageExtra_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    joinGroupBizContent.topicInfo = _CohostTopic_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                joinGroupBizContent.punishInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            joinGroupBizContent.dialog = _PerceptionDialogInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        joinGroupBizContent.fromTag = _RivalExtraInfo_Tag_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    joinGroupBizContent.fromRoomAgeRestricted = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return joinGroupBizContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final JoinGroupBizContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
