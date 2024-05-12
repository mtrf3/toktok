package com.ss.android.ugc.aweme.relation.auth.widget.cell;

import X.C16880lQ;
import X.C62797Okj;
import X.InterfaceC57784Mm4;
import Y.ACListenerS45S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ContactMaFCell extends AuthMaFPowerCell<C62797Okj> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C62797Okj t = (C62797Okj) interfaceC57784Mm4;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        L(t.LJLJJI, t.LJLJI);
        C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, t, 14), this.itemView);
    }
}
