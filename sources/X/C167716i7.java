package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6i7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167716i7 extends AbstractC167696i5 {
    @Override // X.AbstractC167696i5
    public final void LJZ(RecyclerView.ViewHolder holder, C167736i9 c167736i9) {
        o.LJIIIZ(holder, "holder");
    }

    @Override // X.AbstractC167696i5
    public final List<C167736i9> LJLLLLLL(int i) {
        return C47261Igj.LJJIJ(new C167736i9(new Effect(null, 1, null), true, true, false, i, 12, 1944));
    }

    @Override // X.AbstractC167696i5
    public final RecyclerView.ViewHolder LJZI(ViewGroup parent, int i, C167726i8 clickListener) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(clickListener, "clickListener");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.jj, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) LLLLIILL;
        View ivSelector = frameLayout.findViewById(R.id.jl3);
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.eyc);
        C81232VuO c81232VuO = (C81232VuO) frameLayout.findViewById(R.id.ek5);
        o.LJIIIIZZ(ivSelector, "ivSelector");
        return new C168986kA(frameLayout, imageView, c81232VuO, ivSelector, clickListener, null);
    }
}
