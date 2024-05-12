package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.RdO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC69986RdO implements Runnable {
    public final RecyclerView LJLIL;
    public final int LJLILLLLZI;
    public boolean LJLJI;
    public final /* synthetic */ PdpViewModel LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJI.sx0(this.LJLILLLLZI, this.LJLIL, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC69986RdO(int i, RecyclerView recyclerView, PdpViewModel pdpViewModel, boolean z) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJJI = pdpViewModel;
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }
}
