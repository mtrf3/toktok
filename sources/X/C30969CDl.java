package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.CDl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30969CDl extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "recyclerView.context");
        C30970CDm c30970CDm = new C30970CDm(context);
        c30970CDm.LIZ = i;
        LLIIIILZ(c30970CDm);
    }
}
