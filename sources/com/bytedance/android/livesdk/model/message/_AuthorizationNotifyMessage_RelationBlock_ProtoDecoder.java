package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.AuthorizationNotifyMessage;

/* loaded from: classes17.dex */
public final class _AuthorizationNotifyMessage_RelationBlock_ProtoDecoder implements InterfaceC31105CIr<AuthorizationNotifyMessage.RelationBlock> {
    public static AuthorizationNotifyMessage.RelationBlock LIZIZ(Q9H q9h) {
        AuthorizationNotifyMessage.RelationBlock relationBlock = new AuthorizationNotifyMessage.RelationBlock();
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
                                    relationBlock.detail = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                relationBlock.content = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            relationBlock.title = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        relationBlock.isAuthorized = Boolean.valueOf(Q9J.LIZ(q9h));
                    }
                } else {
                    relationBlock.show = Boolean.valueOf(Q9J.LIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return relationBlock;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AuthorizationNotifyMessage.RelationBlock LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
