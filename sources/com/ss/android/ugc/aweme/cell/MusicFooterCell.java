package com.ss.android.ugc.aweme.cell;

import X.AbstractC72298SZa;
import X.C16880lQ;
import X.C191537fR;
import X.C1DD;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C72299SZb;
import X.C72302SZe;
import X.C72304SZg;
import X.C72320SZw;
import X.C72322SZy;
import X.EF7;
import X.InterfaceC191547fS;
import X.InterfaceC74236TBo;
import X.KUR;
import X.KUY;
import X.SYT;
import X.SZP;
import X.TBT;
import Y.ACListenerS32S0100000_12;
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
public class MusicFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public static final CharSequence LJLJLLL;
    public static final CharSequence LJLL;
    public C191537fR LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;
    public KUR LJLJJI;
    public final C72322SZy LJLJJL = new C72322SZy(this);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 116));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 115));

    static {
        TBT tbt = new TBT(MusicFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/cell/IFooterControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
        String string = EF7.LIZIZ().getString(R.string.hvf);
        o.LJIIIIZZ(string, "AppContextManager.getApp…string.load_status_empty)");
        LJLJLLL = string;
        LJLL = C1DD.LIZLLL(R.string.hve, "AppContextManager.getApp….load_status_click_retry)");
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
        TextView textView2 = (TextView) C16880lQ.LLLZIIL(R.layout.dsq, C16880lQ.LLZIL(this.itemView.getContext()), null);
        this.LJLJI = textView2;
        if (textView2 != null) {
            textView2.setText(R.string.hve);
        }
        TextView textView3 = this.LJLJI;
        if (textView3 != null) {
            textView3.setGravity(17);
        }
        KUR kur2 = this.LJLJJI;
        if (kur2 != null) {
            KUY LIZ = KUY.LIZ(this.itemView.getContext());
            LIZ.LIZIZ(this.LJLILLLLZI);
            LIZ.LIZJ(this.LJLJI);
            kur2.setBuilder(LIZ);
        }
        TextView textView4 = this.LJLJI;
        if (textView4 != null) {
            C16880lQ.LJIJI(textView4, new ACListenerS32S0100000_12(this, 31));
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: L */
    public final void onBindItemView(SYT t) {
        RecyclerView recyclerView;
        CharSequence charSequence;
        TextView textView;
        o.LJIIIZ(t, "t");
        TextView textView2 = this.LJLJI;
        if (textView2 != null) {
            textView2.setText(LJLL);
        }
        TextView textView3 = this.LJLJI;
        if (textView3 != null) {
            textView3.setTextColor(-16777216);
        }
        TextView textView4 = this.LJLILLLLZI;
        if (textView4 != null) {
            textView4.setText(LJLJLLL);
        }
        TextView textView5 = this.LJLILLLLZI;
        if (textView5 != null) {
            textView5.setTextColor(-16777216);
        }
        AbstractC72298SZa abstractC72298SZa = t.LJLJI.LJLILLLLZI;
        if (abstractC72298SZa instanceof C72304SZg) {
            P();
            return;
        }
        if (abstractC72298SZa instanceof C72299SZb) {
            SZP type = abstractC72298SZa.LIZ;
            o.LJIIIZ(type, "type");
            if (C72320SZw.LIZ[type.ordinal()] != 1 || (recyclerView = (RecyclerView) this.LJLJJLL.getValue()) == null) {
                return;
            }
            View view = this.itemView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
            KUR kur = (KUR) view;
            TextView textView6 = this.LJLJI;
            if (textView6 != null) {
                charSequence = textView6.getText();
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
        Q(abstractC72298SZa.LIZIZ);
    }

    public void Q(SZP szp) {
        if (szp == null || szp == SZP.Refresh) {
            KUR kur = this.LJLJJI;
            if (kur != null) {
                kur.LJI();
                return;
            }
            return;
        }
        KUR kur2 = this.LJLJJI;
        if (kur2 == null) {
            return;
        }
        kur2.LJII();
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
