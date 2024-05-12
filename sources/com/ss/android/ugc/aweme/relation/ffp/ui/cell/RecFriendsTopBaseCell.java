package com.ss.android.ugc.aweme.relation.ffp.ui.cell;

import X.C16880lQ;
import X.C53341Kwb;
import X.C78897Uxp;
import X.C99W;
import X.P2U;
import X.SY4;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS203S0200000_10;

/* loaded from: classes11.dex */
public abstract class RecFriendsTopBaseCell<T extends P2U> extends PowerCell<T> {
    public TuxIconView LJLIL;
    public TuxTextView LJLILLLLZI;
    public SY4 LJLJI;
    public TuxTextView LJLJJI;

    public abstract void N(T t);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.axz;
    }

    public final TuxTextView L() {
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("countTextView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.ecz);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.icon_view)");
        this.LJLIL = (TuxIconView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.lao);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.title_tv)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.bre);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.connect_btn)");
        this.LJLJI = (SY4) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.bw6);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.count_tv)");
        this.LJLJJI = (TuxTextView) findViewById4;
        if (!C99W.LIZ || this.LJLJI != null) {
            return;
        }
        o.LJIJI("connectBtn");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new IDaS203S0200000_10((RecFriendsTopBaseCell) this, (P2U) t, 0), itemView);
        if (C53341Kwb.LIZ()) {
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C78897Uxp.LJJJJJ(itemView2, 0);
        }
    }
}
