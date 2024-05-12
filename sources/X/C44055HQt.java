package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HQt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44055HQt implements InterfaceC44054HQs {
    public final ViewGroup LIZ;

    @Override // X.InterfaceC44054HQs
    public final void LIZ() {
        View findViewById = this.LIZ.findViewById(R.id.hen);
        o.LJIIIIZZ(findViewById, "rootView.outlineView");
        C87277YNd.LJJIJIIJI(findViewById, false);
        RecyclerView recyclerView = (RecyclerView) this.LIZ.findViewById(R.id.k4z);
        this.LIZ.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        ((RecyclerView) this.LIZ.findViewById(R.id.k4z)).LJII(new C44056HQu(this), -1);
    }

    public C44055HQt(ViewGroup rootView) {
        o.LJIIIZ(rootView, "rootView");
        this.LIZ = rootView;
    }
}
