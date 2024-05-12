package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BQR extends PagerAdapter {
    public final List<BQQ> LJLILLLLZI;
    public final LayoutInflater LJLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return view == object;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLILLLLZI.size();
    }

    public BQR(Context context, List<BQQ> list) {
        this.LJLILLLLZI = list;
        Object LLILL = C16880lQ.LLILL(context, "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.LJLJI = (LayoutInflater) LLILL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(this.LJLJI, R.layout.cud, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        View findViewById = LLLLIILL.findViewById(R.id.fb7);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.a4l);
        TextView textView2 = (TextView) LLLLIILL.findViewById(R.id.a4k);
        if (i < this.LJLILLLLZI.size()) {
            C15490jB.LIZJ(findViewById, C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), ((BQQ) ListProtector.get(this.LJLILLLLZI, i)).LIZJ));
            textView.setText(((BQQ) ListProtector.get(this.LJLILLLLZI, i)).LIZ);
            textView2.setText(((BQQ) ListProtector.get(this.LJLILLLLZI, i)).LIZIZ);
        }
        container.addView(LLLLIILL);
        return LLLLIILL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }
}
