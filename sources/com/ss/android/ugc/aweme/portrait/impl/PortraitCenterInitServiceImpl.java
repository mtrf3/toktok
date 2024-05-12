package com.ss.android.ugc.aweme.portrait.impl;

import X.C36259EKx;
import X.C38995FSd;
import X.C48537J3d;
import X.C48587J5b;
import X.C48588J5c;
import X.C48593J5h;
import X.C48602J5q;
import X.C48606J5u;
import X.C48609J5x;
import X.EF7;
import X.J60;
import X.J64;
import com.ss.android.ugc.aweme.portrait.api.PortraitCenterInitService;
import defpackage.e1;

/* loaded from: classes9.dex */
public final class PortraitCenterInitServiceImpl extends PortraitCenterInitService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.portrait.api.PortraitCenterInitService, com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService
    public final void checkAndInit() {
        C48602J5q.LIZ = false;
        if (e1.LIZ(31744, "client_portrait_center_switch", true, false)) {
            J64.LIZ = C48606J5u.LIZ;
            J60.LIZ = C36259EKx.LIZ;
            C48609J5x.LIZ = C48588J5c.LIZ;
            C48537J3d.LIZ().LJIIIIZZ(EF7.LIZIZ(), C38995FSd.LJ());
            C48537J3d.LIZ().LJII(C48587J5b.LIZ);
            C48537J3d.LIZ().LJII(C48593J5h.LIZ);
        }
    }
}
