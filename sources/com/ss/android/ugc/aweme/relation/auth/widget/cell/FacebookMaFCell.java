package com.ss.android.ugc.aweme.relation.auth.widget.cell;

import X.C16880lQ;
import X.C62798Okk;
import X.InterfaceC57784Mm4;
import Y.ACListenerS45S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FacebookMaFCell extends AuthMaFPowerCell<C62798Okk> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C62798Okk item = (C62798Okk) interfaceC57784Mm4;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        L(item.LJLJJL, item.LJLJI);
        C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, item, 16), this.itemView);
    }
}
