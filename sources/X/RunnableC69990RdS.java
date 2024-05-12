package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.RdS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC69990RdS implements Runnable {
    public final RecyclerView LJLIL;
    public final int LJLILLLLZI;
    public final /* synthetic */ PdpViewModel LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.ux0(this.LJLILLLLZI, this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC69990RdS(PdpViewModel pdpViewModel, RecyclerView recyclerView, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJI = pdpViewModel;
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = i;
    }
}
