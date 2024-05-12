package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui;

import X.AI8;
import X.AIF;
import X.C1DI;
import X.C2068389v;
import X.C221108m2;
import X.C26013AIv;
import X.C62822Ol8;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchUserFeedbackCell extends PowerCell<C26013AIv> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 786));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 787));

    public final AI8 L() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-filterCell>(...)");
        return (AI8) value;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        AI8 L = L();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_pen_on_doc;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        L.setIcon(c2068389v);
        AI8 L2 = L();
        Context context = L().getContext();
        o.LJIIIIZZ(context, "filterCell.context");
        AIF aif = new AIF(context, null);
        aif.LJIILJJIL(new ACListenerS24S0100000_4(this, 165));
        L2.setAccessory(aif);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (r1 == true) goto L6;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C26013AIv r5) {
        /*
            r4 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            super.onBindItemView(r5)
            X.T5R r3 = new X.T5R
            X.4i4 r2 = new X.4i4
            r2.<init>()
            android.view.View r0 = r4.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131830382(0x7f11266e, float:1.929376E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "itemView.context.getStri…ilterpanel_sharefeedback)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.LIZLLL(r1)
            X.4i3 r0 = r2.LIZ
            r3.<init>(r0)
            r0 = 42
            r3.LIZ(r0)
            X.AI8 r0 = r4.L()
            r0.setTitle(r3)
            X.Mm4 r0 = r4.getItem()
            X.AIv r0 = (X.C26013AIv) r0
            r3 = 0
            if (r0 == 0) goto L67
            boolean r1 = r0.LJLJI
            r0 = 1
            if (r1 != r0) goto L67
        L43:
            java.lang.String r2 = "<get-line>(...)"
            if (r0 == 0) goto L56
            X.Ol8 r0 = r4.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
        L55:
            return
        L56:
            X.Ol8 r0 = r4.LJLILLLLZI
            java.lang.Object r1 = r0.getValue()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            goto L55
        L67:
            r0 = 0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui.SearchUserFeedbackCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cgr, viewGroup, false, "from(parent.context).inf…lter_cell, parent, false)");
    }
}
