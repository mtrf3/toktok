package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCreateChannelParams_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _CreateChannelReq_ProtoDecoder implements InterfaceC31105CIr<CreateChannelReq> {
    @Override // X.InterfaceC31105CIr
    public final CreateChannelReq LIZ(Q9H q9h) {
        CreateChannelReq createChannelReq = new CreateChannelReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 11) {
                                    if (LJI != 9527) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        createChannelReq.multiGuestReqExtra = _BizCreateChannelParams_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    createChannelReq.liveRoomMode = q9h.LJIIJJI();
                                }
                            } else {
                                createChannelReq.layoutId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            createChannelReq.config = _InitConfig_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        createChannelReq.myself = _Player_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    createChannelReq.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return createChannelReq;
            }
        }
    }
}
