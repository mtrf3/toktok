package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.AuthorizationNotifyMessage;

/* loaded from: classes17.dex */
public final class _AuthorizationNotifyMessage_ContentBlock_ProtoDecoder implements InterfaceC31105CIr<AuthorizationNotifyMessage.ContentBlock> {
    public static AuthorizationNotifyMessage.ContentBlock LIZIZ(Q9H q9h) {
        AuthorizationNotifyMessage.ContentBlock contentBlock = new AuthorizationNotifyMessage.ContentBlock();
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
                                    contentBlock.detail = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                contentBlock.content = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            contentBlock.title = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        contentBlock.isAuthorized = Boolean.valueOf(Q9J.LIZ(q9h));
                    }
                } else {
                    contentBlock.show = Boolean.valueOf(Q9J.LIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return contentBlock;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AuthorizationNotifyMessage.ContentBlock LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
