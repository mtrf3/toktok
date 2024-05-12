package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UwF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78799UwF extends RecyclerView.ViewHolder {
    public final RecyclerView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;

    public C78799UwF(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.hc0);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…didate_item_recyclerview)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLIL = recyclerView;
        View findViewById2 = view.findViewById(R.id.b4_);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.candidate_title)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.b47);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.candidate_detail)");
        this.LJLJI = (TuxTextView) findViewById3;
        recyclerView.LJII(new AbstractC030309z() { // from class: X.4JQ
            @Override // X.AbstractC030309z
            public final void LJ(Rect outRect, View view2, RecyclerView parent, C0AC state) {
                o.LJIIIZ(outRect, "outRect");
                o.LJIIIZ(view2, "view");
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(state, "state");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                if (((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition() == state.LIZIZ() - 1) {
                    outRect.right = C7MY.LIZIZ(16);
                } else {
                    outRect.right = C7MY.LIZIZ(8);
                }
                outRect.top = C7MY.LIZIZ(4);
                outRect.bottom = C7MY.LIZIZ(4);
            }
        }, -1);
    }
}
