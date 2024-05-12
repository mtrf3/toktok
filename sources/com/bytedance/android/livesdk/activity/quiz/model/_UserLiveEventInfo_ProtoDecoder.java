package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UserLiveEventInfo_ProtoDecoder implements InterfaceC31105CIr<UserLiveEventInfo> {
    public static UserLiveEventInfo LIZIZ(Q9H q9h) {
        UserLiveEventInfo userLiveEventInfo = new UserLiveEventInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            userLiveEventInfo.isSubscribed = Q9J.LIZ(q9h);
                        }
                    } else {
                        userLiveEventInfo.quizId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    userLiveEventInfo.liveEventId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userLiveEventInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserLiveEventInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
