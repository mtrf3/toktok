package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6i6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167706i6 extends AbstractC167696i5 {
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C150065uk.LJLIL);

    @Override // X.AbstractC167696i5
    public final List<C167736i9> LJLLLLLL(int i) {
        return null;
    }

    @Override // X.AbstractC167696i5
    public final void LJZ(RecyclerView.ViewHolder holder, C167736i9 c167736i9) {
        o.LJIIIZ(holder, "holder");
    }

    @Override // X.AbstractC167696i5
    public final RecyclerView.ViewHolder LJZI(ViewGroup parent, int i, C167726i8 clickListener) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(clickListener, "clickListener");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.jf, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) LLLLIILL;
        View ivSelector = frameLayout.findViewById(R.id.jl3);
        C81232VuO c81232VuO = (C81232VuO) frameLayout.findViewById(R.id.ek5);
        c81232VuO.setRoundRadius((int) ((Resources.getSystem().getDisplayMetrics().density * 10) + 0.5f));
        TDV tdv = (TDV) frameLayout.findViewById(R.id.k82);
        o.LJIIIIZZ(ivSelector, "ivSelector");
        C168986kA c168986kA = new C168986kA(frameLayout, null, c81232VuO, ivSelector, clickListener, tdv);
        c168986kA.LJLJJLL = new C169036kF(c81232VuO, ivSelector, tdv);
        return c168986kA;
    }
}
