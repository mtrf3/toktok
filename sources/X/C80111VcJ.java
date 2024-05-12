package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.VcJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80111VcJ extends C0A6 {
    public final InterfaceC80119VcR LJLIL;

    public C80111VcJ(InterfaceC80119VcR iScrollHandler) {
        o.LJIIIZ(iScrollHandler, "iScrollHandler");
        this.LJLIL = iScrollHandler;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL.LJLZ(i, recyclerView);
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL.LJIIL(recyclerView, i, i2);
    }
}
