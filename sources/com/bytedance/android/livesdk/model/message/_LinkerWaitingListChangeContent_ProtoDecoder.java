package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerWaitingListChangeContent_ProtoDecoder implements InterfaceC31105CIr<LinkerWaitingListChangeContent> {
    @Override // X.InterfaceC31105CIr
    public final LinkerWaitingListChangeContent LIZ(Q9H q9h) {
        LinkerWaitingListChangeContent linkerWaitingListChangeContent = new LinkerWaitingListChangeContent();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return linkerWaitingListChangeContent;
    }
}
