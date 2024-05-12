package com.ss.android.ugc.aweme.trending.ui.list;

import X.C1DI;
import X.C32151Nz;
import X.C56411MBz;
import X.MC3;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingSheetCell extends PowerCell<C56411MBz> {
    public static final int LJLJJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
    public TextView LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        TrendingEventModel trendingEventModel;
        C56411MBz item;
        MC3 mc3;
        super.onViewAttachedToWindow();
        C56411MBz item2 = getItem();
        if (item2 != null && (trendingEventModel = item2.LJLIL) != null && (item = getItem()) != null && (mc3 = item.LJLJI) != null) {
            mc3.LIZ(true, trendingEventModel);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        TrendingEventModel trendingEventModel;
        C56411MBz item;
        MC3 mc3;
        super.onViewDetachedFromWindow();
        C56411MBz item2 = getItem();
        if (item2 != null && (trendingEventModel = item2.LJLIL) != null && (item = getItem()) != null && (mc3 = item.LJLJI) != null) {
            mc3.LIZ(false, trendingEventModel);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L18;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C56411MBz r8) {
        /*
            r7 = this;
            X.MBz r8 = (X.C56411MBz) r8
            java.lang.String r0 = "t"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            android.widget.TextView r6 = r7.LJLIL
            r5 = 0
            if (r6 == 0) goto Lca
            int r3 = r7.getAdapterPosition()
            r4 = 0
            if (r3 < 0) goto Lbb
            r0 = 3
            if (r3 >= r0) goto Lbb
            r0 = 1
        L17:
            r1 = 2131099712(0x7f060040, float:1.7811785E38)
            if (r0 == 0) goto Lb6
            r2 = 2131099712(0x7f060040, float:1.7811785E38)
        L1f:
            int r0 = r3 + 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.setText(r0)
            android.content.Context r0 = r6.getContext()
            int r0 = X.C04330Ez.LIZIZ(r0, r2)
            r6.setTextColor(r0)
            android.widget.TextView r3 = r7.LJLILLLLZI
            if (r3 == 0) goto Lc4
            com.ss.android.ugc.aweme.search.TrendingEventModel r0 = r8.LJLIL
            int r0 = r0.getIconType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = X.DIS.LIZ(r0)
            if (r0 == 0) goto L7f
            int r0 = r0.intValue()
            X.89v r2 = new X.89v
            r2.<init>()
            r2.LIZ = r0
            android.content.Context r0 = r3.getContext()
            int r0 = X.C04330Ez.LIZIZ(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LIZLLL = r0
            android.content.Context r1 = r3.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.SY9 r1 = r2.LIZ(r1)
            int r0 = com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetCell.LJLJJI
            r1.setBounds(r4, r4, r0, r0)
            com.ss.android.ugc.aweme.search.TrendingEventModel r0 = r8.LJLIL
            java.lang.String r0 = r0.getTrendingName()
            X.C51102K3u.LIZLLL(r3, r0, r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L88
        L7f:
            com.ss.android.ugc.aweme.search.TrendingEventModel r0 = r8.LJLIL
            java.lang.String r0 = r0.getTrendingName()
            r3.setText(r0)
        L88:
            android.widget.TextView r2 = r7.LJLJI
            if (r2 == 0) goto Lbe
            com.ss.android.ugc.aweme.search.TrendingEventModel r0 = r8.LJLIL
            java.lang.Long r0 = r0.getHeatValue()
            if (r0 == 0) goto Lb3
            long r0 = r0.longValue()
        L98:
            java.lang.String r0 = X.C77123UOp.LJJIIJ(r0)
            r2.setText(r0)
            android.view.View r1 = r7.itemView
            boolean r0 = r8.LJLILLLLZI
            r1.setSelected(r0)
            android.view.View r2 = r7.itemView
            Y.ACListenerS29S0100000_9 r1 = new Y.ACListenerS29S0100000_9
            r0 = 97
            r1.<init>(r8, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            return
        Lb3:
            r0 = 0
            goto L98
        Lb6:
            r2 = 2131099729(0x7f060051, float:1.781182E38)
            goto L1f
        Lbb:
            r0 = 0
            goto L17
        Lbe:
            java.lang.String r0 = "viewCountText"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        Lc4:
            java.lang.String r0 = "titleText"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        Lca:
            java.lang.String r0 = "numberText"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZ = C1DI.LIZ(viewGroup, "parent", R.layout.ctv, viewGroup, false, "view");
        View findViewById = LIZ.findViewById(R.id.lkk);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.trending_cell_number)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = LIZ.findViewById(R.id.lkl);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.trending_cell_title)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = LIZ.findViewById(R.id.lkm);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.trending_cell_view_count)");
        this.LJLJI = (TextView) findViewById3;
        return LIZ;
    }
}
