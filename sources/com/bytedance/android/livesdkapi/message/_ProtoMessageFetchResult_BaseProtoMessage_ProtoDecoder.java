package com.bytedance.android.livesdkapi.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;

/* loaded from: classes6.dex */
public final class _ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder implements InterfaceC31105CIr<ProtoMessageFetchResult.BaseProtoMessage> {
    public static ProtoMessageFetchResult.BaseProtoMessage LIZIZ(Q9H q9h) {
        ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage = new ProtoMessageFetchResult.BaseProtoMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        baseProtoMessage.method = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        baseProtoMessage.payload = q9h.LJII();
                        break;
                    case 3:
                        baseProtoMessage.msgId = q9h.LJIIJJI();
                        break;
                    case 4:
                        baseProtoMessage.msgType = q9h.LJIIJ();
                        break;
                    case 5:
                        baseProtoMessage.offset = q9h.LJIIJJI();
                        break;
                    case 6:
                        baseProtoMessage.isHistory = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return baseProtoMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ProtoMessageFetchResult.BaseProtoMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
