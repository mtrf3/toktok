package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCreateChannelResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _CreateChannelResponse_ProtoDecoder implements InterfaceC31105CIr<CreateChannelResponse> {
    @Override // X.InterfaceC31105CIr
    public final CreateChannelResponse LIZ(Q9H q9h) {
        CreateChannelResponse createChannelResponse = new CreateChannelResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    if (LJI != 9527) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        createChannelResponse.multiGuestRespExtra = _BizCreateChannelResponse_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    createChannelResponse.isResume = Integer.valueOf(q9h.LJIIJ());
                                }
                            } else {
                                createChannelResponse.selfLinkMicId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            createChannelResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        createChannelResponse.channelId = q9h.LJIIJJI();
                    }
                } else {
                    createChannelResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return createChannelResponse;
            }
        }
    }
}
