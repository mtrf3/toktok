package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.im._KickOutBizContent_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _MultiLiveContent_ProtoDecoder implements InterfaceC31105CIr<MultiLiveContent> {
    public static MultiLiveContent LIZIZ(Q9H q9h) {
        MultiLiveContent multiLiveContent = new MultiLiveContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        multiLiveContent.applyIMContent = _ApplyBizContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        multiLiveContent.inviteIMContent = _InviteBizContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        multiLiveContent.replyIMContent = _ReplyBizContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        multiLiveContent.permitIMContent = _PermitBizContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        multiLiveContent.joinDirectIMContent = _JoinDirectBizContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        multiLiveContent.kickOutBizContent = _KickOutBizContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return multiLiveContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiLiveContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
