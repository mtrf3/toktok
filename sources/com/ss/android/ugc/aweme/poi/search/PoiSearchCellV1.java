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
import X.C85324XeC;
import X.C85327XeF;
import X.C85331XeJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.experiment.PoiSearchConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS205S0200000_15;

/* loaded from: classes16.dex */
public final class PoiSearchCellV1 extends PowerCell<C85316Xe4> {
    public TuxTextView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public final C214378bB LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;

    public final PoiSearchVM N() {
        return (PoiSearchVM) this.LJLJJL.getValue();
    }

    public PoiSearchCellV1() {
        C85331XeJ c85331XeJ = C85331XeJ.LJLIL;
        this.LJLJJL = new C214378bB(C65352Pkq.LIZ(PoiSearchVM.class), c85331XeJ, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C85327XeF.INSTANCE, null, null);
        this.LJLJJLL = C7MY.LIZIZ(16);
        this.LJLJL = C7MY.LIZIZ(12);
        this.LJLJLJ = C7MY.LIZIZ(20);
    }

    public final String L() {
        Integer num = PoiSearchConfig.LIZ().showCategoryStyle;
        if (num != null && num.intValue() != 0) {
            TuxTextView tuxTextView = this.LJLJJI;
            if (tuxTextView != null) {
                CharSequence text = tuxTextView.getText();
                if (text != null && text.length() != 0) {
                    TuxTextView tuxTextView2 = this.LJLJJI;
                    if (tuxTextView2 != null) {
                        if (tuxTextView2.getVisibility() == 0) {
                            return "1";
                        }
                    } else {
                        o.LJIJI("tvPoiCategory");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("tvPoiCategory");
                throw null;
            }
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public final int M() {
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
        C13930gf.LIZ(itemView, new C85324XeC(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C85316Xe4 r11) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchCellV1.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c19, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.mec);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_poi_name)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.me_);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_poi_address)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = LIZIZ.findViewById(R.id.meb);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_poi_distance)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = LIZIZ.findViewById(R.id.mea);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.tv_poi_category)");
        this.LJLJJI = (TuxTextView) findViewById4;
        C16880lQ.LJIIJ(new IDaS205S0200000_15(this, LIZIZ, 1), LIZIZ);
        return LIZIZ;
    }
}
