package com.ss.android.ugc.aweme.video;

import X.C15380j0;
import X.C16880lQ;
import X.C191537fR;
import X.C1DI;
import X.C221108m2;
import X.C223338pd;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73018SlC;
import X.InterfaceC191547fS;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;

/* loaded from: classes13.dex */
public final class SubOnlyVideoFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public C191537fR LJLIL;
    public C223338pd LJLILLLLZI;
    public TuxTextView LJLJI;
    public final C73018SlC LJLJJI = new C73018SlC(this);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 922));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 921));

    static {
        TBT tbt = new TBT(SubOnlyVideoFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/video/IFooterControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void M() {
        C223338pd c223338pd = this.LJLILLLLZI;
        if (c223338pd != null) {
            c223338pd.LIZJ();
            c223338pd.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(C15380j0.LJIILJJIL(R.string.hvf));
            C16880lQ.LJJJJI(tuxTextView, null);
            tuxTextView.setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N() {
        C223338pd c223338pd = this.LJLILLLLZI;
        if (c223338pd != null) {
            c223338pd.LIZJ();
            c223338pd.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(C15380j0.LJIILJJIL(R.string.hve));
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS32S0100000_12(this, 83));
            tuxTextView.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) this.LJLJJL.getValue();
        if (recyclerView != null) {
            if (this.LJLIL == null) {
                this.LJLIL = new C191537fR(recyclerView, (InterfaceC191547fS) this.LJLJJLL.getValue());
            }
            C191537fR c191537fR = this.LJLIL;
            if (c191537fR != null) {
                c191537fR.LJLJI = true;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void P() {
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        C223338pd c223338pd = this.LJLILLLLZI;
        if (c223338pd != null) {
            c223338pd.setVisibility(0);
            c223338pd.LIZIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LJLILLLLZI = (C223338pd) this.itemView.findViewById(R.id.g94);
        this.LJLJI = (TuxTextView) this.itemView.findViewById(R.id.kf7);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bp2, viewGroup, false, "from(parent.context).inf…eo_footer, parent, false)");
    }
}
