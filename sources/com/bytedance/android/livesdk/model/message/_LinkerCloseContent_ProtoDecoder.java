package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerCloseContent_ProtoDecoder implements InterfaceC31105CIr<LinkerCloseContent> {
    @Override // X.InterfaceC31105CIr
    public final LinkerCloseContent LIZ(Q9H q9h) {
        LinkerCloseContent linkerCloseContent = new LinkerCloseContent();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return linkerCloseContent;
    }
}
