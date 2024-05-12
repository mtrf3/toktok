package com.bytedance.android.livesdk.model.linksetting;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _CoHost_ProtoDecoder implements InterfaceC31105CIr<CoHost> {
    public static CoHost LIZIZ(Q9H q9h) {
        CoHost coHost = new CoHost();
        coHost.linkedUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        coHost.linkedUsers.add(_LinkmicUser_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    coHost.multiCoHostPermission = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return coHost;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CoHost LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
