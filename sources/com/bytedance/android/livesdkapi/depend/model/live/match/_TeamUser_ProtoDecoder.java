package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _TeamUser_ProtoDecoder implements InterfaceC31105CIr<TeamUser> {
    public static TeamUser LIZIZ(Q9H q9h) {
        TeamUser teamUser = new TeamUser();
        teamUser.userIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        C29991Fr.LIZ(q9h, teamUser.userIds);
                    }
                } else {
                    teamUser.teamId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return teamUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TeamUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
