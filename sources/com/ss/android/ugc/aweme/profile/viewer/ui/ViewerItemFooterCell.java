package com.ss.android.ugc.aweme.profile.viewer.ui;

import X.C191537fR;
import X.C1DI;
import X.C221108m2;
import X.C223338pd;
import X.C44384HbQ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C72315SZr;
import X.C72316SZs;
import X.InterfaceC191547fS;
import X.InterfaceC74236TBo;
import X.SYT;
import X.SZP;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ViewerItemFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public C191537fR LJLIL;
    public SZP LJLILLLLZI = SZP.Refresh;
    public final C72316SZs LJLJI = new C72316SZs(this);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 843));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 842));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 833));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 834));

    static {
        TBT tbt = new TBT(ViewerItemFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/profile/viewer/ui/IFooterControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void M() {
        ((C223338pd) this.itemView.findViewById(R.id.chz)).setVisibility(8);
        if (((Boolean) this.LJLJL.getValue()).booleanValue()) {
            this.itemView.findViewById(R.id.m11).setVisibility(0);
            ((TextView) this.itemView.findViewById(R.id.m11)).setText(C44384HbQ.LJJZ(R.string.pgy));
        } else {
            this.itemView.findViewById(R.id.m11).setVisibility(8);
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N() {
        RecyclerView recyclerView;
        ((C223338pd) this.itemView.findViewById(R.id.chz)).setVisibility(8);
        this.itemView.findViewById(R.id.m11).setVisibility(8);
        if (C72315SZr.LIZ[this.LJLILLLLZI.ordinal()] == 1 && (recyclerView = (RecyclerView) this.LJLJJI.getValue()) != null) {
            this.itemView.findViewById(R.id.m11).setVisibility(0);
            ((TextView) this.itemView.findViewById(R.id.m11)).setText(C44384HbQ.LJJZ(R.string.pj8));
            if (this.LJLIL == null) {
                this.LJLIL = new C191537fR(recyclerView, (InterfaceC191547fS) this.LJLJJL.getValue());
            }
            C191537fR c191537fR = this.LJLIL;
            if (c191537fR != null) {
                c191537fR.LJLJI = true;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void P() {
        this.itemView.findViewById(R.id.m11).setVisibility(8);
        C223338pd c223338pd = (C223338pd) this.itemView.findViewById(R.id.chz);
        c223338pd.setVisibility(0);
        ((C223338pd) c223338pd.findViewById(R.id.chz)).LIZIZ();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: L */
    public final void onBindItemView(SYT t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.LJLILLLLZI = t.LJLJI.LJLILLLLZI.LIZ;
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(SYT syt) {
        onBindItemView(syt);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c8z, viewGroup, false, "from(parent.context)\n   …er_footer, parent, false)");
    }
}
