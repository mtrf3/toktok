package com.ss.android.ugc.aweme.bnpl.biz.bill.statements;

import X.AI8;
import X.AIF;
import X.C91934a2c;
import X.C92375a9j;
import Y.IDCListenerS85S0200000_31;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StatementsCellBillPaid extends PowerCell<C92375a9j> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C92375a9j c92375a9j) {
        C92375a9j t = c92375a9j;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        ((AI8) this.itemView.findViewById(R.id.hq)).setTitle(t.LJLILLLLZI);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        CharSequence LIZ = C91934a2c.LIZ(context, t.LJLJI);
        AI8 ai8 = (AI8) this.itemView.findViewById(R.id.hq);
        Context context2 = this.itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        AIF aif = new AIF(context2, null);
        aif.LJIILIIL(LIZ);
        aif.LJIILJJIL(new IDCListenerS85S0200000_31(this, t, 7));
        ai8.setAccessory(aif);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.a2);
    }
}
