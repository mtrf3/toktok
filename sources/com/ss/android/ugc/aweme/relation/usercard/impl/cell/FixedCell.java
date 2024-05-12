package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C16880lQ;
import X.C57837Mmv;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FixedCell extends PowerCell<C57837Mmv> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C57837Mmv c57837Mmv) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C57837Mmv t = c57837Mmv;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View view = this.itemView;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        viewGroup.removeAllViews();
        InterfaceC88472Yns<Context, View> interfaceC88472Yns = t.LJLIL.LJLILLLLZI;
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        View invoke = interfaceC88472Yns.invoke(context);
        ViewParent parent = invoke.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            if (!o.LJ(viewGroup2, viewGroup)) {
                C16880lQ.LJLLL(invoke, viewGroup2);
                viewGroup.addView(invoke);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        viewGroup.addView(invoke);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }
}
