package X;

import Y.ACListenerS35S0100000_15;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class XXU extends XYS {
    public final RecyclerView LJLILLLLZI;
    public C85014XYc LJLJI;
    public XWV LJLJJI;

    public XXU(View view) {
        super(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.moa);
        TextView textView = (TextView) view.findViewById(R.id.mo9);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.j9k);
        this.LJLILLLLZI = recyclerView;
        textView.setText(view.getContext().getText(R.string.iir));
        int LIZJ = (int) KL2.LIZJ(view.getContext(), 16.0f);
        if (C59859NeR.LIZ()) {
            recyclerView.LJII(new AbstractC030309z() { // from class: X.4Hb
                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                    int i;
                    T28.LJ(rect, "outRect", view2, "view", recyclerView2, "parent", c0ac, "state");
                    super.LJ(rect, view2, recyclerView2, c0ac);
                    int LJJJJIZL = RecyclerView.LJJJJIZL(view2);
                    if (LJJJJIZL < 0) {
                        return;
                    }
                    if (LJJJJIZL % 2 == 0) {
                        rect.right = C17N.LJIILL(8.0d);
                    }
                    AbstractC029409q adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        i = adapter.getItemCount();
                    } else {
                        i = 0;
                    }
                    if (i % 2 == 0) {
                        AbstractC029409q adapter2 = recyclerView2.getAdapter();
                        if (adapter2 != null && LJJJJIZL + 1 == adapter2.getItemCount()) {
                            return;
                        }
                        AbstractC029409q adapter3 = recyclerView2.getAdapter();
                        if (adapter3 != null && LJJJJIZL + 2 == adapter3.getItemCount()) {
                            return;
                        }
                        rect.bottom = C17N.LJIILL(8.0d);
                        return;
                    }
                    AbstractC029409q adapter4 = recyclerView2.getAdapter();
                    if (adapter4 != null && LJJJJIZL + 1 == adapter4.getItemCount()) {
                        return;
                    }
                    rect.bottom = C17N.LJIILL(8.0d);
                }
            }, -1);
        } else {
            recyclerView.LJII(new XYE(LIZJ), -1);
        }
        recyclerView.setNestedScrollingEnabled(false);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 2));
        view.getContext();
        recyclerView.setLayoutManager(new WrapGridLayoutManager(2));
        tuxTextView.setTuxFont(62);
    }
}
