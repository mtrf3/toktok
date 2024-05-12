package com.ss.android.ugc.aweme.poi.search;

import X.C16880lQ;
import X.C59092Tp;
import X.C86V;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PoiIpRecommendTipCell extends PowerCell<C59092Tp> {
    public TuxTextView LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C59092Tp t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(C86V.LJFF(R.string.ozo));
        } else {
            o.LJIJI("textView");
            throw null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.c06, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        TuxTextView tuxTextView = (TuxTextView) LLLLIILL;
        this.LJLIL = tuxTextView;
        return tuxTextView;
    }
}
