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
import X.C85192Xc4;
import X.C85316Xe4;
import X.C85325XeD;
import X.C85328XeG;
import X.C85329XeH;
import X.C85332XeK;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import q03.IDaS205S0200000_15;

/* loaded from: classes16.dex */
public final class PoiSearchCellV2 extends PowerCell<C85316Xe4> {
    public TuxTextView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public SpannableString LJLJJI;
    public final C214378bB LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public boolean LJLJLLL;

    public final PoiSearchVM M() {
        return (PoiSearchVM) this.LJLJJL.getValue();
    }

    public PoiSearchCellV2() {
        C85332XeK c85332XeK = C85332XeK.LJLIL;
        this.LJLJJL = new C214378bB(C65352Pkq.LIZ(PoiSearchVM.class), c85332XeK, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C85328XeG.INSTANCE, null, null);
        this.LJLJJLL = C7MY.LIZIZ(16);
        this.LJLJL = C7MY.LIZIZ(12);
        this.LJLJLJ = C7MY.LIZIZ(20);
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
        C13930gf.LIZ(itemView, new C85325XeD(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C85316Xe4 r16) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchCellV2.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c1_, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.mec);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_poi_name)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.me_);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_poi_address)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = LIZIZ.findViewById(R.id.meb);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_poi_distance)");
        this.LJLJI = (TuxTextView) findViewById3;
        C16880lQ.LJIIJ(new IDaS205S0200000_15(this, LIZIZ, 2), LIZIZ);
        Context context = LIZIZ.getContext();
        o.LJIIIIZZ(context, "context");
        C85329XeH c85329XeH = new C85329XeH(context);
        SpannableString spannableString = new SpannableString(c85329XeH.LIZJ);
        spannableString.setSpan(c85329XeH.LIZIZ.getValue(), 0, c85329XeH.LIZJ.length(), 17);
        this.LJLJJI = spannableString;
        return LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(TuxTextView tuxTextView, C85316Xe4 c85316Xe4) {
        boolean z;
        List<Position> list = c85316Xe4.LJLILLLLZI;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str = ((C85192Xc4) M().getState()).LJLIL;
            if (str == null || str.length() == 0) {
                tuxTextView.setTuxFont(42);
                return;
            } else {
                tuxTextView.setTuxFont(41);
                return;
            }
        }
        tuxTextView.setTuxFont(41);
    }
}
