package X;

import Y.ACListenerS35S0100000_15;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XXY extends RecyclerView.ViewHolder {
    public G87 LJLIL;
    public N9A LJLILLLLZI;
    public final LinearLayout LJLJI;
    public final RecyclerView LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XXY(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLJI = (LinearLayout) itemView.findViewById(R.id.g4j);
        RecyclerView recyclerView = (RecyclerView) itemView.findViewById(R.id.j9k);
        this.LJLJJI = recyclerView;
        if (recyclerView != null) {
            itemView.getContext();
            recyclerView.setLayoutManager(new WrapGridLayoutManager(1, 0, false));
            recyclerView.setNestedScrollingEnabled(false);
        }
        if (recyclerView != null) {
            final boolean LIZIZ = C72704Sg8.LIZIZ(itemView, "itemView.context");
            recyclerView.LJII(new AbstractC030309z(LIZIZ) { // from class: X.4Hc
                public final boolean LJLIL;

                {
                    this.LJLIL = LIZIZ;
                }

                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view, RecyclerView recyclerView2, C0AC c0ac) {
                    T28.LJ(rect, "outRect", view, "view", recyclerView2, "parent", c0ac, "state");
                    super.LJ(rect, view, recyclerView2, c0ac);
                    int LJJJJIZL = RecyclerView.LJJJJIZL(view);
                    if (LJJJJIZL < 0) {
                        return;
                    }
                    AbstractC029409q adapter = recyclerView2.getAdapter();
                    if (adapter != null && LJJJJIZL + 1 == adapter.getItemCount()) {
                        if (this.LJLIL) {
                            rect.left = C17N.LJIILL(16.0d);
                            return;
                        } else {
                            rect.right = C17N.LJIILL(16.0d);
                            return;
                        }
                    }
                    if (this.LJLIL) {
                        rect.left = C17N.LJIILL(8.0d);
                    } else {
                        rect.right = C17N.LJIILL(8.0d);
                    }
                }
            }, -1);
        }
        new C80098Vc6(C60996Nwm.LJIIIIZZ(itemView.getContext()), C72704Sg8.LIZIZ(itemView, "itemView.context")).LIZIZ(recyclerView);
        TuxTextView tuxTextView = (TuxTextView) itemView.findViewById(R.id.moc);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 4));
        }
    }
}
