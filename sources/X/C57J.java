package X;

import Y.ARunnableS38S0100000_2;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.57J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57J extends C0A6 {
    public RecyclerView LJLIL;
    public AqS168S0100000_2 LJLILLLLZI;
    public final ARunnableS38S0100000_2 LJLJI = new ARunnableS38S0100000_2(this, 175);
    public final HashSet<Integer> LJLJJI = new HashSet<>();

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            recyclerView.removeCallbacks(this.LJLJI);
            recyclerView.post(this.LJLJI);
        }
    }
}
