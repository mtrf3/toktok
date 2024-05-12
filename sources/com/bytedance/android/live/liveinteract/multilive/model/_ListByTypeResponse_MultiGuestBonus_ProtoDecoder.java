package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;

/* loaded from: classes14.dex */
public final class _ListByTypeResponse_MultiGuestBonus_ProtoDecoder implements InterfaceC31105CIr<ListByTypeResponse.MultiGuestBonus> {
    public static ListByTypeResponse.MultiGuestBonus LIZIZ(Q9H q9h) {
        ListByTypeResponse.MultiGuestBonus multiGuestBonus = new ListByTypeResponse.MultiGuestBonus();
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
                                multiGuestBonus.isSuccess = Q9J.LIZ(q9h);
                            }
                        } else {
                            multiGuestBonus.multiGuestBonusNoteString = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        multiGuestBonus.multiGuestBonusValue = q9h.LJIIJJI();
                    }
                } else {
                    multiGuestBonus.multiGuestBonusValueString = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return multiGuestBonus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListByTypeResponse.MultiGuestBonus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
