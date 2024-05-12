package com.ss.android.ugc.aweme.relation.recuser.inbox;

import X.C221018lt;
import X.C57759Mlf;
import X.InterfaceC88472Yns;
import X.X1D;
import androidx.lifecycle.ViewModel;

/* loaded from: classes10.dex */
public final class InboxUserCardSharedVM extends ViewModel {
    public C57759Mlf LJLIL = new C57759Mlf(0);

    public final void gv0(InterfaceC88472Yns<? super C57759Mlf, C57759Mlf> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns.invoke(this.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update shared state: ");
        LIZ.append(this.LJLIL);
        C221018lt.LJFF("@UserCard_inbox", X1D.LIZIZ(LIZ));
    }
}
