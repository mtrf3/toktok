package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TPZ extends LinearLayoutManager {
    public TPZ(Context context) {
        LLJJIII(0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "recyclerView.context");
        C74586TPa c74586TPa = new C74586TPa(context);
        c74586TPa.LIZ = i;
        LLIIIILZ(c74586TPa);
    }
}
