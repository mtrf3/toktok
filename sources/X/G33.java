package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G33 extends C0A6 {
    public final /* synthetic */ StaggeredGridLayoutManager LJLIL;
    public final /* synthetic */ TopicInterestAdapter LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        int i2;
        o.LJIIIZ(recyclerView, "recyclerView");
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.LJLIL;
        Integer LJJJZ = ORY.LJJJZ(staggeredGridLayoutManager.LLILII(new int[staggeredGridLayoutManager.LJLZ]));
        java.util.Map<Integer, Integer> map = this.LJLILLLLZI.LJLJL.LIZIZ;
        Integer valueOf = Integer.valueOf(this.LJLJI);
        Integer num = (Integer) ((LinkedHashMap) this.LJLILLLLZI.LJLJL.LIZIZ).get(Integer.valueOf(this.LJLJI));
        int i3 = 0;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if (LJJJZ != null) {
            i3 = LJJJZ.intValue();
        }
        map.put(valueOf, Integer.valueOf(Math.max(i2, i3)));
    }

    public G33(int i, StaggeredGridLayoutManager staggeredGridLayoutManager, TopicInterestAdapter topicInterestAdapter) {
        this.LJLIL = staggeredGridLayoutManager;
        this.LJLILLLLZI = topicInterestAdapter;
        this.LJLJI = i;
    }
}
