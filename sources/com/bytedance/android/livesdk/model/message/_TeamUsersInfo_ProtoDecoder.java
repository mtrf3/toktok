package com.bytedance.android.livesdk.model.message;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _TeamUsersInfo_ProtoDecoder implements InterfaceC31105CIr<TeamUsersInfo> {
    public static TeamUsersInfo LIZIZ(Q9H q9h) {
        TeamUsersInfo teamUsersInfo = new TeamUsersInfo();
        teamUsersInfo.userIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        C29991Fr.LIZ(q9h, teamUsersInfo.userIds);
                    }
                } else {
                    teamUsersInfo.teamId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return teamUsersInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TeamUsersInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
