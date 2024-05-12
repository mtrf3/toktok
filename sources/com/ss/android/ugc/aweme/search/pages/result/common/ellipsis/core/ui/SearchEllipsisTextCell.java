package com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui;

import X.AD5;
import X.AI8;
import X.AnonymousClass391;
import X.C118524ky;
import X.C16880lQ;
import X.C1DI;
import X.C221108m2;
import X.C26338AVi;
import X.C62822Ol8;
import X.C79043V0l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchEllipsisTextCell extends PowerCell<C118524ky> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 710));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 709));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C118524ky c118524ky) {
        C118524ky t = c118524ky;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-textCell>(...)");
        AI8 ai8 = (AI8) value;
        ai8.setTitle(t.LJLIL);
        ai8.setIcon(t.LJLILLLLZI);
        Object value2 = this.LJLIL.getValue();
        o.LJIIIIZZ(value2, "<get-textCell>(...)");
        Context context = ((View) value2).getContext();
        o.LJIIIIZZ(context, "textCell.context");
        AD5 ad5 = new AD5(context, null);
        View.OnClickListener onClickListener = t.LJLJI;
        if (onClickListener != null) {
            C16880lQ.LJJJJI(ad5.LIZIZ, onClickListener);
        }
        ai8.setAccessory(ad5);
        if (t.LJLJJI) {
            Object value3 = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value3, "<get-line>(...)");
            C79043V0l.LJIIJ((View) value3);
            C26338AVi.LJI(ai8, 0, AnonymousClass391.LIZJ(8), 0, 0, false, 16);
            return;
        }
        Object value4 = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value4, "<get-line>(...)");
        C79043V0l.LJJIIZI((View) value4);
        C26338AVi.LJI(ai8, 0, 0, 0, 0, false, 16);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cf1, viewGroup, false, "from(parent.context)\n   …heet_cell, parent, false)");
    }
}
