package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.C0d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30623C0d extends LinearLayoutManager {
    public boolean LLIIIJ;

    public C30623C0d() {
        super(0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C74589TPd c74589TPd = new C74589TPd(recyclerView.getContext());
        c74589TPd.LJIILL = this.LLIIIJ;
        c74589TPd.LIZ = i;
        LLIIIILZ(c74589TPd);
    }
}
