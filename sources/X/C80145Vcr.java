package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Vcr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80145Vcr extends LinearLayoutManager {
    public C80145Vcr(int i) {
        super(i, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C80144Vcq c80144Vcq = new C80144Vcq(recyclerView.getContext());
        c80144Vcq.LIZ = i;
        LLIIIILZ(c80144Vcq);
    }
}
