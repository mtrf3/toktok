package com.ss.android.ugc.aweme.watch.history.ui;

import X.AbstractC72298SZa;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C191537fR;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C72299SZb;
import X.C72302SZe;
import X.C72304SZg;
import X.C72319SZv;
import X.C72321SZx;
import X.InterfaceC191547fS;
import X.InterfaceC74236TBo;
import X.KUR;
import X.KUY;
import X.SYT;
import X.SZP;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class WatchHistoryFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public C191537fR LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;
    public KUR LJLJJI;
    public final C72321SZx LJLJJL = new C72321SZx(this);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 963));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 962));

    static {
        TBT tbt = new TBT(WatchHistoryFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/watch/history/ui/IFooterControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void P() {
        KUR kur = this.LJLJJI;
        if (kur != null) {
            kur.LJI();
        }
        KUR kur2 = this.LJLJJI;
        if (kur2 != null) {
            kur2.LJIIIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        this.LJLJJI = (KUR) view;
        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.lj);
        KUR kur = this.LJLJJI;
        if (kur != null) {
            kur.setLayoutParams(new RecyclerView.LayoutParams(-1, dimensionPixelSize));
        }
        TextView textView = (TextView) C16880lQ.LLLZIIL(R.layout.dsp, C16880lQ.LLZIL(this.itemView.getContext()), null);
        this.LJLILLLLZI = textView;
        if (textView != null) {
            textView.setGravity(17);
        }
        TextView textView2 = this.LJLILLLLZI;
        if (textView2 != null) {
            textView2.setText(R.string.hvf);
        }
        TextView textView3 = this.LJLILLLLZI;
        if (textView3 != null) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            textView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        }
        TextView textView4 = (TextView) C16880lQ.LLLZIIL(R.layout.dsq, C16880lQ.LLZIL(this.itemView.getContext()), null);
        this.LJLJI = textView4;
        if (textView4 != null) {
            textView4.setText(R.string.hve);
        }
        TextView textView5 = this.LJLJI;
        if (textView5 != null) {
            textView5.setGravity(17);
        }
        TextView textView6 = this.LJLJI;
        if (textView6 != null) {
            Context context2 = this.itemView.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            textView6.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
        }
        KUR kur2 = this.LJLJJI;
        if (kur2 != null) {
            KUY LIZ = KUY.LIZ(this.itemView.getContext());
            LIZ.LIZIZ(this.LJLILLLLZI);
            LIZ.LIZJ(this.LJLJI);
            kur2.setBuilder(LIZ);
        }
        TextView textView7 = this.LJLJI;
        if (textView7 != null) {
            C16880lQ.LJIJI(textView7, new ACListenerS32S0100000_12(this, 95));
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: L */
    public final void onBindItemView(SYT t) {
        RecyclerView recyclerView;
        CharSequence charSequence;
        TextView textView;
        o.LJIIIZ(t, "t");
        AbstractC72298SZa abstractC72298SZa = t.LJLJI.LJLILLLLZI;
        if (abstractC72298SZa instanceof C72304SZg) {
            P();
            return;
        }
        if (abstractC72298SZa instanceof C72299SZb) {
            SZP type = abstractC72298SZa.LIZ;
            o.LJIIIZ(type, "type");
            if (C72319SZv.LIZ[type.ordinal()] != 1 || (recyclerView = (RecyclerView) this.LJLJJLL.getValue()) == null) {
                return;
            }
            View view = this.itemView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
            KUR kur = (KUR) view;
            TextView textView2 = this.LJLJI;
            if (textView2 != null) {
                charSequence = textView2.getText();
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(charSequence, this.itemView.getResources().getString(R.string.pj8)) && (textView = this.LJLJI) != null) {
                textView.setText(R.string.pj8);
            }
            kur.LJIIIIZZ();
            if (this.LJLIL == null) {
                this.LJLIL = new C191537fR(recyclerView, (InterfaceC191547fS) this.LJLJL.getValue());
            }
            C191537fR c191537fR = this.LJLIL;
            if (c191537fR == null) {
                return;
            }
            c191537fR.LJLJI = true;
            return;
        }
        if (!(abstractC72298SZa instanceof C72302SZe)) {
            return;
        }
        SZP szp = abstractC72298SZa.LIZIZ;
        if (szp == null || szp == SZP.Refresh) {
            KUR kur2 = this.LJLJJI;
            if (kur2 == null) {
                return;
            }
            kur2.LJI();
            return;
        }
        KUR kur3 = this.LJLJJI;
        if (kur3 == null) {
            return;
        }
        kur3.LJII();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(SYT syt) {
        onBindItemView(syt);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new KUR(parent.getContext(), null);
    }
}
