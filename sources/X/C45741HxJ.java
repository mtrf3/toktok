package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.HxJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45741HxJ extends C0A6 {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public C45741HxJ(boolean z) {
        this.LJLILLLLZI = z;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (this.LJLILLLLZI) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        W5I.LIZ().LJIIJJI();
                    }
                } else if (this.LJLIL == 2) {
                    W5I.LIZ().LJIIJJI();
                } else if (W5I.LIZ().LJIIJ()) {
                    W5I.LIZ().LJIILL();
                }
            } else if (W5I.LIZ().LJIIJ()) {
                W5I.LIZ().LJIILL();
            }
        }
        this.LJLIL = i;
    }
}
