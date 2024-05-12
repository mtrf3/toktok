package com.ss.android.ugc.aweme.setting.ui.cell;

import X.C16880lQ;
import X.C85800Xls;
import Y.ACListenerS35S0100000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SettingFooterCell extends BaseCell<C85800Xls> {
    public RelativeLayout LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        TuxTextView tuxTextView;
        super.onItemViewCreated();
        RelativeLayout relativeLayout = this.LJLIL;
        TuxTextView tuxTextView2 = null;
        if (relativeLayout != null) {
            tuxTextView = (TuxTextView) relativeLayout.findViewById(R.id.mz4);
        } else {
            tuxTextView = null;
        }
        this.LJLILLLLZI = tuxTextView;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 129));
        }
        RelativeLayout relativeLayout2 = this.LJLIL;
        if (relativeLayout2 != null) {
            tuxTextView2 = (TuxTextView) relativeLayout2.findViewById(R.id.n3_);
        }
        this.LJLJI = tuxTextView2;
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS35S0100000_15(this, 130));
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View L(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.cko, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.LJLIL = (RelativeLayout) LLLLIILL;
        return LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C85800Xls t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        RelativeLayout relativeLayout = this.LJLIL;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(t.LJLJJLL);
        }
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(t.LJLL);
        }
        TuxTextView tuxTextView2 = this.LJLILLLLZI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(t.LJLLI);
        }
        TuxTextView tuxTextView3 = this.LJLJI;
        if (tuxTextView3 == null) {
            return;
        }
        tuxTextView3.setText(t.LJLJLLL);
    }
}
