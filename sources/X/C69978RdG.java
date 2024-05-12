package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RdG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69978RdG extends C0A6 {
    public int LJLIL;
    public final /* synthetic */ PdpBodyWidget LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C69978RdG(PdpBodyWidget pdpBodyWidget, int i) {
        this.LJLILLLLZI = pdpBodyWidget;
        this.LJLJI = i;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (this.LJLIL > C27162AlK.LJIIJ) {
            this.LJLILLLLZI.getViewModel().Sv0("glide");
            C70414RkI c70414RkI = this.LJLILLLLZI.getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIZ("fulltodetail");
            }
        }
        Iterator it = ((ArrayList) this.LJLILLLLZI.getViewModel().LJLLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC88472Yns) it.next()).invoke(Integer.valueOf(i));
        }
        if (i == 0) {
            ((InterfaceC69803RaR) C73340SqO.LJIILJJIL(this.LJLILLLLZI.getViewModel(), InterfaceC69803RaR.class)).V20(this.LJLJI, recyclerView);
            if (!recyclerView.canScrollVertically(-1)) {
                new C69993RdV(this.LJLILLLLZI.getViewModel().jw0()).LJIIJ();
                this.LJLIL = 0;
                PdpViewModel viewModel = this.LJLILLLLZI.getViewModel();
                int i2 = this.LJLIL;
                viewModel.getClass();
                viewModel.setState(new AqS36S0001000_12(i2, 0));
            }
        } else if (i != 1) {
            return;
        }
        this.LJLILLLLZI.getViewModel().LLJLL = false;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL += i2;
        PdpViewModel viewModel = this.LJLILLLLZI.getViewModel();
        int i3 = this.LJLIL;
        viewModel.getClass();
        viewModel.setState(new AqS36S0001000_12(i3, 0));
        ((InterfaceC69803RaR) C73340SqO.LJIILJJIL(this.LJLILLLLZI.getViewModel(), InterfaceC69803RaR.class)).V20(this.LJLJI, recyclerView);
        PdpViewModel viewModel2 = this.LJLILLLLZI.getViewModel();
        int i4 = this.LJLJI;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        viewModel2.getClass();
        if (C34513Dgb.LIZ != 0) {
            recyclerView.removeCallbacks(viewModel2.LLLFFI);
            if (z) {
                if (viewModel2.LLLFZ) {
                    return;
                }
                PdpViewModel.rx0(i4, recyclerView, viewModel2, true);
            } else {
                if (!viewModel2.LLLFZ) {
                    return;
                }
                PdpViewModel.rx0(i4, recyclerView, viewModel2, false);
            }
        }
    }
}
