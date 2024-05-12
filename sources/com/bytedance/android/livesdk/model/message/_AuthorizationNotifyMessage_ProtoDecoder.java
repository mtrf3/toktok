package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _AuthorizationNotifyMessage_ProtoDecoder implements InterfaceC31105CIr<AuthorizationNotifyMessage> {
    @Override // X.InterfaceC31105CIr
    public final AuthorizationNotifyMessage LIZ(Q9H q9h) {
        AuthorizationNotifyMessage authorizationNotifyMessage = new AuthorizationNotifyMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 6) {
                                    if (LJI != 7) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        authorizationNotifyMessage.userRelation = _AuthorizationNotifyMessage_RelationBlock_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    authorizationNotifyMessage.userContent = _AuthorizationNotifyMessage_ContentBlock_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                authorizationNotifyMessage.style = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            authorizationNotifyMessage.content = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        authorizationNotifyMessage.from = Q9J.LIZIZ(q9h);
                    }
                } else {
                    authorizationNotifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return authorizationNotifyMessage;
            }
        }
    }
}
