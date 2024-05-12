package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact._LinkPlayerInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ListByTypeResponse_GiftScoreAppliedUser_ProtoDecoder implements InterfaceC31105CIr<ListByTypeResponse.GiftScoreAppliedUser> {
    public static ListByTypeResponse.GiftScoreAppliedUser LIZIZ(Q9H q9h) {
        ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser = new ListByTypeResponse.GiftScoreAppliedUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        giftScoreAppliedUser.giftScore = q9h.LJIIJJI();
                    }
                } else {
                    giftScoreAppliedUser.listUser = _LinkPlayerInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftScoreAppliedUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListByTypeResponse.GiftScoreAppliedUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
