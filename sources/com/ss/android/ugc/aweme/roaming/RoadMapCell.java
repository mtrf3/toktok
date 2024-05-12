package com.ss.android.ugc.aweme.roaming;

import X.AnonymousClass391;
import X.C1FJ;
import X.C26338AVi;
import X.C32151Nz;
import X.C86753ap;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RoadMapCell extends PowerCell<C86753ap> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C86753ap c86753ap) {
        C86753ap t = c86753ap;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        ((TextView) view).setText(t.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C26338AVi.LJIIIZ(tuxTextView, AnonymousClass391.LIZJ(16), C1FJ.LIZIZ(12), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 16);
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColorRes(R.attr.gv);
        return tuxTextView;
    }
}
