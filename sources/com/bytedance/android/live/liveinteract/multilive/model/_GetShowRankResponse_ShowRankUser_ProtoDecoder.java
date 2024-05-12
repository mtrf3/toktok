package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;

/* loaded from: classes14.dex */
public final class _GetShowRankResponse_ShowRankUser_ProtoDecoder implements InterfaceC31105CIr<GetShowRankResponse.ShowRankUser> {
    public static GetShowRankResponse.ShowRankUser LIZIZ(Q9H q9h) {
        GetShowRankResponse.ShowRankUser showRankUser = new GetShowRankResponse.ShowRankUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        showRankUser.userId = q9h.LJIIJJI();
                        break;
                    case 2:
                        showRankUser.order = q9h.LJIIJ();
                        break;
                    case 3:
                        showRankUser.score = q9h.LJIIJJI();
                        break;
                    case 4:
                        showRankUser.nickname = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        showRankUser.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        showRankUser.followStatus = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return showRankUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetShowRankResponse.ShowRankUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
