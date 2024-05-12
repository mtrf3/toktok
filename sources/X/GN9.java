package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class GN9 extends C0A6 {
    public final LinearLayoutManager LJLIL;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    public GN9(LinearLayoutManager linearLayoutManager) {
        this.LJLIL = linearLayoutManager;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        int LJJJI = this.LJLIL.LJJJI();
        int LJJJJZ = this.LJLIL.LJJJJZ();
        int LLILL = this.LJLIL.LLILL();
        GNA gna = (GNA) this;
        DraftFragment draftFragment = gna.LJLILLLLZI;
        if (draftFragment.LJZ || draftFragment.LJZI == draftFragment.Dl().LJLLI - 1 || LJJJI + LLILL < LJJJJZ || LLILL < 0) {
            return;
        }
        H78.LIZ("DraftFragment -> loadMoreItems is running");
        DraftFragment draftFragment2 = gna.LJLILLLLZI;
        if (!draftFragment2.LLI) {
            return;
        }
        draftFragment2.LJZI++;
        draftFragment2.LJZ = true;
        XKX.LIZLLL(draftFragment2.LLFF, null, null, new GLL(draftFragment2, null), 3);
    }
}
