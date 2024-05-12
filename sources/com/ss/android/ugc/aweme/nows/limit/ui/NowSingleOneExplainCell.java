package com.ss.android.ugc.aweme.nows.limit.ui;

import X.AnonymousClass391;
import X.C26338AVi;
import X.C32151Nz;
import X.C59052Tl;
import X.C7MY;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NowSingleOneExplainCell extends PowerCell<C59052Tl> {
    public TuxTextView LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C59052Tl item) {
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C7MY.LIZIZ(24);
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setLayoutParams(layoutParams);
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(tuxTextView2.getContext().getString(0));
                return;
            } else {
                o.LJIJI("explainTv");
                throw null;
            }
        }
        o.LJIJI("explainTv");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LJLIL = tuxTextView;
        tuxTextView.setTextColorRes(R.attr.dj);
        TuxTextView tuxTextView2 = this.LJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(61);
            TuxTextView tuxTextView3 = this.LJLIL;
            if (tuxTextView3 != null) {
                C26338AVi.LJIIIZ(tuxTextView3, AnonymousClass391.LIZJ(16), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, 26);
                TuxTextView tuxTextView4 = this.LJLIL;
                if (tuxTextView4 != null) {
                    return tuxTextView4;
                }
                o.LJIJI("explainTv");
                throw null;
            }
            o.LJIJI("explainTv");
            throw null;
        }
        o.LJIJI("explainTv");
        throw null;
    }
}
