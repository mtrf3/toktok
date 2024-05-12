package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _ListByTypeResponse_ReservedUser_ProtoDecoder implements InterfaceC31105CIr<ListByTypeResponse.ReservedUser> {
    public static ListByTypeResponse.ReservedUser LIZIZ(Q9H q9h) {
        ListByTypeResponse.ReservedUser reservedUser = new ListByTypeResponse.ReservedUser();
        reservedUser.tagList = new ArrayList();
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
                                    reservedUser.tagList.add(Q9J.LIZIZ(q9h));
                                }
                            } else {
                                reservedUser.updateTime = q9h.LJIIJJI();
                            }
                        } else {
                            reservedUser.reserveId = q9h.LJIIJJI();
                        }
                    } else {
                        reservedUser.reserveType = q9h.LJIIJ();
                    }
                } else {
                    reservedUser.user = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reservedUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListByTypeResponse.ReservedUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
