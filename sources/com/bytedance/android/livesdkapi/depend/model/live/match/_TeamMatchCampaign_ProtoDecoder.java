package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _TeamMatchCampaign_ProtoDecoder implements InterfaceC31105CIr<TeamMatchCampaign> {
    public static TeamMatchCampaign LIZIZ(Q9H q9h) {
        TeamMatchCampaign teamMatchCampaign = new TeamMatchCampaign();
        teamMatchCampaign.startSfxTeamId = new ArrayList();
        teamMatchCampaign.bestTeammateRelation = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            teamMatchCampaign.hasTeamMatchMvpSfx = Q9J.LIZ(q9h);
                        }
                    } else {
                        C29991Fr.LIZ(q9h, teamMatchCampaign.startSfxTeamId);
                    }
                } else {
                    teamMatchCampaign.bestTeammateRelation.add(_BestTeammateRelation_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return teamMatchCampaign;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TeamMatchCampaign LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
