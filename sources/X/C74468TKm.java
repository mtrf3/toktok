package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.TKm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74468TKm extends C0A6 {
    public int LJLIL = -1;
    public boolean LJLILLLLZI;
    public final /* synthetic */ C74467TKl LJLJI;

    public C74468TKm(C74467TKl c74467TKl) {
        this.LJLJI = c74467TKl;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 2) {
            if (this.LJLIL == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLILLLLZI = z;
        } else if (i == 0) {
            if (this.LJLIL == 1 || this.LJLILLLLZI) {
                C0A2 layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    int LLILL = linearLayoutManager.LLILL();
                    OSZ osz = (OSZ) ORZ.LJLLLLLL(this.LJLJI.LIZIZ.LJZL(LLILL), this.LJLJI.LIZ.getData());
                    if (osz != null) {
                        this.LJLJI.LJI.onNext(osz.getFirst());
                    }
                }
            } else {
                return;
            }
        }
        this.LJLIL = i;
    }
}
