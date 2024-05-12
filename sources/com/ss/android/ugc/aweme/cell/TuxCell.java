package com.ss.android.ugc.aweme.cell;

import X.AER;
import X.AI8;
import X.AI9;
import X.C06490Nh;
import X.C19N;
import X.C2068389v;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class TuxCell<T extends AER, S extends AI9> extends BaseCell<T> {
    public S LJLIL;

    public S N(Context context) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public View L(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.u9, viewGroup, false);
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "parent.context");
        S N = N(context);
        this.LJLIL = N;
        if (N != null) {
            o.LJII(LIZIZ, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
            ((AI8) LIZIZ).setAccessory(N);
        }
        S s = this.LJLIL;
        if (s != null) {
            s.LJFF(new AqS154S0100000_4((TuxCell) this, 65));
        }
        Integer LIZIZ2 = C19N.LIZIZ(LIZIZ, "context", R.attr.ci);
        if (LIZIZ2 != null) {
            LIZIZ.setBackgroundColor(LIZIZ2.intValue());
        }
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: P */
    public void onBindItemView(T t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        AI8 ai8 = (AI8) this.itemView.findViewById(R.id.b85);
        ai8.setVariant(t.LJFF());
        ai8.setTitle(t.LJIILIIL());
        CharSequence LJIIJJI = t.LJIIJJI();
        if (LJIIJJI == null) {
            LJIIJJI = t.LJIIL();
        }
        ai8.setSubtitle(LJIIJJI);
        C2068389v LJIIIZ = t.LJIIIZ();
        if (LJIIIZ != null) {
            ai8.setIcon(LJIIIZ);
        }
        ai8.setCellEnabled(t.LJIIIIZZ());
        ai8.setWithSeparator(t.LJII());
        ai8.setLoading(t.LJIIJ());
        ai8.LJ(t.LIZJ(), t.LJ());
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return L(parent);
    }
}
