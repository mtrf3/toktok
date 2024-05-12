package com.ss.android.ugc.aweme.music.assem.list;

import X.AbstractC72298SZa;
import X.C191537fR;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C72299SZb;
import X.C72302SZe;
import X.C72304SZg;
import X.C72317SZt;
import X.C72318SZu;
import X.C73305Spp;
import X.C73306Spq;
import X.C78983UzD;
import X.InterfaceC191547fS;
import X.InterfaceC74236TBo;
import X.SYT;
import X.SZP;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class MusicFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public C191537fR LJLIL;
    public C73305Spp LJLILLLLZI;
    public final C72317SZt LJLJI = new C72317SZt(this);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 781));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 780));

    static {
        TBT tbt = new TBT(MusicFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/music/assem/list/IFooterControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void P() {
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            C78983UzD.LJJLIIIJL(c73305Spp);
        }
        C73305Spp c73305Spp2 = this.LJLILLLLZI;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        this.LJLILLLLZI = (C73305Spp) view;
        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.lj);
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setLayoutParams(new RecyclerView.LayoutParams(-1, dimensionPixelSize));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: L */
    public final void onBindItemView(SYT t) {
        RecyclerView recyclerView;
        o.LJIIIZ(t, "t");
        AbstractC72298SZa abstractC72298SZa = t.LJLJI.LJLILLLLZI;
        if (abstractC72298SZa instanceof C72304SZg) {
            P();
            return;
        }
        if (abstractC72298SZa instanceof C72299SZb) {
            SZP type = abstractC72298SZa.LIZ;
            o.LJIIIZ(type, "type");
            if (C72318SZu.LIZ[type.ordinal()] != 1 || (recyclerView = (RecyclerView) this.LJLJJI.getValue()) == null) {
                return;
            }
            View view = this.itemView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
            C73306Spq c73306Spq = new C73306Spq();
            String string = this.itemView.getResources().getString(R.string.pj8);
            o.LJIIIIZZ(string, "itemView.resources.getSt…string.pull_up_load_more)");
            c73306Spq.LJI = string;
            c73306Spq.LJIIIIZZ = new AqS178S0100000_12(this, 393);
            ((C73305Spp) view).setStatus(c73306Spq);
            if (this.LJLIL == null) {
                this.LJLIL = new C191537fR(recyclerView, (InterfaceC191547fS) this.LJLJJL.getValue());
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
            C73305Spp c73305Spp = this.LJLILLLLZI;
            if (c73305Spp == null) {
                return;
            }
            C78983UzD.LJJIL(c73305Spp);
            return;
        }
        C73305Spp c73305Spp2 = this.LJLILLLLZI;
        if (c73305Spp2 != null) {
            C78983UzD.LJJLIIIJL(c73305Spp2);
        }
        C73305Spp c73305Spp3 = this.LJLILLLLZI;
        if (c73305Spp3 == null) {
            return;
        }
        C73306Spq c73306Spq2 = new C73306Spq();
        String string2 = this.itemView.getResources().getString(R.string.hvf);
        o.LJIIIIZZ(string2, "itemView.resources.getSt…string.load_status_empty)");
        c73306Spq2.LJI = string2;
        c73305Spp3.setStatus(c73306Spq2);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(SYT syt) {
        onBindItemView(syt);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new C73305Spp(context, null, 6);
    }
}
