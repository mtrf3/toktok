package com.ss.android.ugc.aweme.trending.ui.list;

import X.C1DI;
import X.C32151Nz;
import X.MC0;
import X.MC4;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingSheetRichCell extends PowerCell<MC0> {
    public static final int LJLJJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
    public TextView LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;
    public SmartImageView LJLJJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        TrendingEventModel trendingEventModel;
        MC0 item;
        MC4 mc4;
        super.onViewAttachedToWindow();
        MC0 item2 = getItem();
        if (item2 != null && (trendingEventModel = item2.LJLIL) != null && (item = getItem()) != null && (mc4 = item.LJLJI) != null) {
            mc4.LIZ(true, trendingEventModel);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        TrendingEventModel trendingEventModel;
        MC0 item;
        MC4 mc4;
        super.onViewDetachedFromWindow();
        MC0 item2 = getItem();
        if (item2 != null && (trendingEventModel = item2.LJLIL) != null && (item = getItem()) != null && (mc4 = item.LJLJI) != null) {
            mc4.LIZ(false, trendingEventModel);
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
    public final void onBindItemView(X.MC0 r8) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetRichCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZ = C1DI.LIZ(viewGroup, "parent", R.layout.ctw, viewGroup, false, "view");
        View findViewById = LIZ.findViewById(R.id.ll1);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.trending_rich_cell_number)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = LIZ.findViewById(R.id.ll2);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.trending_rich_cell_title)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = LIZ.findViewById(R.id.ll3);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.t…ing_rich_cell_view_count)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = LIZ.findViewById(R.id.ll0);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.t…ng_rich_cell_fresco_view)");
        this.LJLJJI = (SmartImageView) findViewById4;
        return LIZ;
    }
}
