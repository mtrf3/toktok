package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _UserStatsMessage_ProtoDecoder implements InterfaceC31105CIr<UserStatsMessage> {
    @Override // X.InterfaceC31105CIr
    public final UserStatsMessage LIZ(Q9H q9h) {
        UserStatsMessage userStatsMessage = new UserStatsMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                userStatsMessage.mActionType = q9h.LJIIJJI();
                            }
                        } else {
                            userStatsMessage.mUserId = q9h.LJIIJJI();
                        }
                    } else {
                        userStatsMessage.mContent = Q9J.LIZIZ(q9h);
                    }
                } else {
                    userStatsMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userStatsMessage;
            }
        }
    }
}
