package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.data.multi_guest_play._ShowConfig_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _CreateShowParams_ProtoDecoder implements InterfaceC31105CIr<CreateShowParams> {
    @Override // X.InterfaceC31105CIr
    public final CreateShowParams LIZ(Q9H q9h) {
        CreateShowParams createShowParams = new CreateShowParams();
        createShowParams.showUsers = new ArrayList();
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
                                createShowParams.showUsers.add(_CreateShowParams_ListUser_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            createShowParams.showConfig = _ShowConfig_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        createShowParams.channelId = q9h.LJIIJJI();
                    }
                } else {
                    createShowParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return createShowParams;
            }
        }
    }
}
