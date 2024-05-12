package X;

import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MIX extends C0A6 {
    public final int LJLIL = ViewConfiguration.get(EF7.LIZIZ()).getScaledTouchSlop();

    public static void LJIILLIIL(RecyclerView recyclerView, boolean z) {
        TrendingTopicViewHolder trendingTopicViewHolder;
        int adapterPosition;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(i));
            if (LJJJJJL instanceof TrendingTopicViewHolder) {
                if (z && LLILL <= (adapterPosition = (trendingTopicViewHolder = (TrendingTopicViewHolder) LJJJJJL).getAdapterPosition()) && adapterPosition <= LLILLJJLI) {
                    C56490MFa c56490MFa = trendingTopicViewHolder.LJLLLL;
                    if (c56490MFa != null) {
                        c56490MFa.LJIJ(trendingTopicViewHolder.LJLJLJ, false);
                    }
                } else {
                    ((TrendingTopicViewHolder) LJJJJJL).Q();
                }
            }
        }
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            LJIILLIIL(recyclerView, true);
            C0A2 layoutManager = recyclerView.getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).LLILL();
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (Math.abs(i2) > this.LJLIL) {
            return;
        }
        LJIILLIIL(recyclerView, true);
    }
}
