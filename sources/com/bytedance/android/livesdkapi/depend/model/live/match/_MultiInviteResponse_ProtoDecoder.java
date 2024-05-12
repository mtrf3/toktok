package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _MultiInviteResponse_ProtoDecoder implements InterfaceC31105CIr<MultiInviteResponse> {
    @Override // X.InterfaceC31105CIr
    public final MultiInviteResponse LIZ(Q9H q9h) {
        MultiInviteResponse multiInviteResponse = new MultiInviteResponse();
        multiInviteResponse.battleTeamUser = new ArrayList();
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
                                multiInviteResponse.giftModeMeta = _GiftModeMeta_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            multiInviteResponse.battleTeamUser.add(_TeamUser_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        multiInviteResponse.meanwhileInviteScene = q9h.LJIIJ();
                    }
                } else {
                    multiInviteResponse.battleId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return multiInviteResponse;
            }
        }
    }
}
