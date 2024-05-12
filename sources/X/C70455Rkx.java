package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.widget.PdpBodyAssem;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rkx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70455Rkx extends C0A6 {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ PdpBodyAssem LJLJJI;

    public C70455Rkx(PdpBodyAssem pdpBodyAssem) {
        this.LJLJJI = pdpBodyAssem;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != this.LJLILLLLZI && i == 0 && this.LJLIL) {
            C78946Uyc.LJJIIJ(recyclerView, new C70936Rsi(), C70440Rki.LJLIL);
            this.LJLIL = false;
        }
        this.LJLILLLLZI = i;
        if (i == 0) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LJLJJI.LJLLI.getValue();
            ((Number) this.LJLJJI.LJLZ.getValue()).intValue();
            assemViewModel.getVmDispatcher().getState();
            if (!recyclerView.canScrollVertically(-1)) {
                new C69993RdV(this.LJLJJI.I3()).LJIIJ();
                this.LJLJI = 0;
                PdpMainViewModel H3 = this.LJLJJI.H3();
                int i2 = this.LJLJI;
                H3.getClass();
                H3.setState(new AqS36S0001000_12(i2, 12));
            }
        } else if (i != 1) {
            return;
        }
        this.LJLJJI.LJLLI.getValue();
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL = true;
        this.LJLJI += i2;
        PdpMainViewModel H3 = this.LJLJJI.H3();
        int i3 = this.LJLJI;
        H3.getClass();
        H3.setState(new AqS36S0001000_12(i3, 12));
    }
}
