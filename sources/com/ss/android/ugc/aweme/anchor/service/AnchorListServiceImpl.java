package com.ss.android.ugc.aweme.anchor.service;

import X.C58096Mr6;
import X.I3W;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorListServiceImpl implements IAnchorListService {
    @Override // com.ss.android.ugc.aweme.anchor.service.IAnchorListService
    public final void LIZ() {
        AnchorListManager.LIZJ(null);
    }

    public static IAnchorListService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IAnchorListService.class, false);
        if (LIZ != null) {
            return (IAnchorListService) LIZ;
        }
        if (C58096Mr6.LLIFFJFJJ == null) {
            synchronized (IAnchorListService.class) {
                if (C58096Mr6.LLIFFJFJJ == null) {
                    C58096Mr6.LLIFFJFJJ = new AnchorListServiceImpl();
                }
            }
        }
        return C58096Mr6.LLIFFJFJJ;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IAnchorListService
    public final boolean LIZJ(int i) {
        return AnchorListManager.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IAnchorListService
    public final void LIZIZ(String str, String creationId) {
        o.LJIIIZ(creationId, "creationId");
        I3W i3w = new I3W();
        i3w.LJIILJJIL = str;
        i3w.LJIILLIIL = "video";
        i3w.LJIJ = 1;
        i3w.LJII = creationId;
        i3w.LJIIZILJ = "upload";
        i3w.LJIILIIL();
    }
}
