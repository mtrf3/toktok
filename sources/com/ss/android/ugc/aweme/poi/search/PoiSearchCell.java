package com.ss.android.ugc.aweme.poi.search;

import X.AbstractC029409q;
import X.C06490Nh;
import X.C13930gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C65352Pkq;
import X.C78926UyI;
import X.C7MY;
import X.C85316Xe4;
import X.C85321Xe9;
import X.C85326XeE;
import X.C85330XeI;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS205S0200000_15;

/* loaded from: classes16.dex */
public final class PoiSearchCell extends PowerCell<C85316Xe4> {
    public TuxTextView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public final C214378bB LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;

    public final PoiSearchVM M() {
        return (PoiSearchVM) this.LJLJJI.getValue();
    }

    public PoiSearchCell() {
        C85330XeI c85330XeI = C85330XeI.LJLIL;
        this.LJLJJI = new C214378bB(C65352Pkq.LIZ(PoiSearchVM.class), c85330XeI, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C85326XeE.INSTANCE, null, null);
        this.LJLJJL = C7MY.LIZIZ(16);
        this.LJLJJLL = C7MY.LIZIZ(12);
        this.LJLJL = C7MY.LIZIZ(20);
    }

    public final int L() {
        int itemCount;
        AbstractC029409q<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
        int i = 0;
        if (bindingAdapter != null && (itemCount = bindingAdapter.getItemCount()) >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                AbstractC029409q<? extends RecyclerView.ViewHolder> bindingAdapter2 = getBindingAdapter();
                if (bindingAdapter2 != null && bindingAdapter2.getItemViewType(i2) == getItemViewType()) {
                    break;
                }
                i++;
                if (i2 == itemCount) {
                    break;
                }
                i2++;
            }
        }
        return getLayoutPosition() - i;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C13930gf.LIZ(itemView, new C85321Xe9(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C85316Xe4 r10) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c18, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.mec);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_poi_name)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.me_);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_poi_address)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = LIZIZ.findViewById(R.id.meb);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_poi_distance)");
        this.LJLJI = (TuxTextView) findViewById3;
        C16880lQ.LJIIJ(new IDaS205S0200000_15(this, LIZIZ, 0), LIZIZ);
        return LIZIZ;
    }
}
