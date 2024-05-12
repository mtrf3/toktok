package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes.dex */
public final class _StringBadge_ProtoEncoder implements InterfaceC64604PXc<StringBadge> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, StringBadge stringBadge) {
        StringBadge stringBadge2 = stringBadge;
        int i = stringBadge2.badgeDisplayType;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        C30957CCz.LIZLLL(cd6, 2, stringBadge2.contentStr);
    }
}
