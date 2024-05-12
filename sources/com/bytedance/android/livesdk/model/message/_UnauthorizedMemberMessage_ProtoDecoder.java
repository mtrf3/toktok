package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _UnauthorizedMemberMessage_ProtoDecoder implements InterfaceC31105CIr<UnauthorizedMemberMessage> {
    @Override // X.InterfaceC31105CIr
    public final UnauthorizedMemberMessage LIZ(Q9H q9h) {
        UnauthorizedMemberMessage unauthorizedMemberMessage = new UnauthorizedMemberMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    unauthorizedMemberMessage.enterText = _Text_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                unauthorizedMemberMessage.nickName = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            unauthorizedMemberMessage.nickNamePrefix = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        unauthorizedMemberMessage.action = q9h.LJIIJ();
                    }
                } else {
                    unauthorizedMemberMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return unauthorizedMemberMessage;
            }
        }
    }
}
