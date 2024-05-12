package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _ToolBarManagement_ProtoDecoder implements InterfaceC31105CIr<ToolBarManagement> {
    public static ToolBarManagement LIZIZ(Q9H q9h) {
        ToolBarManagement toolBarManagement = new ToolBarManagement();
        toolBarManagement.mergingmorepriority = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    toolBarManagement.mergingmorepriority.add(Integer.valueOf(q9h.LJIIJ()));
                }
            } else {
                q9h.LJ(LIZJ);
                return toolBarManagement;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ToolBarManagement LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
