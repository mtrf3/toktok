package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class G32 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TopicInterestAdapter LJLIL;
    public final /* synthetic */ StaggeredGridLayoutManager LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public G32(int i, StaggeredGridLayoutManager staggeredGridLayoutManager, TopicInterestAdapter topicInterestAdapter) {
        this.LJLIL = topicInterestAdapter;
        this.LJLILLLLZI = staggeredGridLayoutManager;
        this.LJLJI = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        C40864G2a c40864G2a = this.LJLIL.LJLJL;
        c40864G2a.LIZ = Math.max(c40864G2a.LIZ, r0.LJLJJL.LLILLJJLI() - 1);
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.LJLILLLLZI;
        Integer LJJJZ = ORY.LJJJZ(staggeredGridLayoutManager.LLILII(new int[staggeredGridLayoutManager.LJLZ]));
        java.util.Map<Integer, Integer> map = this.LJLIL.LJLJL.LIZIZ;
        Integer valueOf = Integer.valueOf(this.LJLJI);
        Integer num = (Integer) ((LinkedHashMap) this.LJLIL.LJLJL.LIZIZ).get(Integer.valueOf(this.LJLJI));
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (LJJJZ != null) {
            i2 = LJJJZ.intValue();
        }
        map.put(valueOf, Integer.valueOf(Math.max(i, i2)));
    }
}
