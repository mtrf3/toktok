package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.UjB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77989UjB extends LinearLayoutManager {
    public C77989UjB(Context context) {
        LLJJIII(0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "recyclerView.context");
        C77991UjD c77991UjD = new C77991UjD(context);
        c77991UjD.LIZ = i;
        LLIIIILZ(c77991UjD);
    }
}
