package X;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import kotlin.jvm.internal.o;

/* renamed from: X.RxC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC71214RxC implements Runnable {
    public final /* synthetic */ AbstractC71187Rwl LJLIL;
    public final /* synthetic */ InterfaceC68342mE<BaseResponse<PopProductResp>> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ long LJLJJL;

    public RunnableC71214RxC(AbstractC71187Rwl abstractC71187Rwl, InterfaceC68342mE<BaseResponse<PopProductResp>> interfaceC68342mE, long j, boolean z, long j2) {
        this.LJLIL = abstractC71187Rwl;
        this.LJLILLLLZI = interfaceC68342mE;
        this.LJLJI = j;
        this.LJLJJI = z;
        this.LJLJJL = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            ViewModel slotViewModel = this.LJLIL.LJLIL;
            o.LJIIIIZZ(slotViewModel, "slotViewModel");
            C78565UsT.LJJIJ(slotViewModel, MBB.INSTANCE, new C71191Rwp(this.LJLILLLLZI, this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, null));
        } finally {
            if (LIZ) {
            }
        }
    }
}
