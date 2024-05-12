package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.journey.step.interestselector.SelectTopicInterestsComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2X extends C0A6 {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ SelectTopicInterestsComponent LJLJI;

    public G2X(SelectTopicInterestsComponent selectTopicInterestsComponent) {
        this.LJLJI = selectTopicInterestsComponent;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        int i2;
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        SelectTopicInterestsComponent selectTopicInterestsComponent = this.LJLJI;
        C40864G2a c40864G2a = selectTopicInterestsComponent.LLF;
        int i4 = c40864G2a.LIZ;
        if (selectTopicInterestsComponent.LLFF != null) {
            c40864G2a.LIZ = Math.max(i4, r0.LLILLJJLI() - 1);
            C40864G2a c40864G2a2 = this.LJLJI.LLF;
            java.util.Map<Integer, Integer> map = c40864G2a2.LIZIZ;
            Integer valueOf = Integer.valueOf(c40864G2a2.LIZ);
            C40864G2a c40864G2a3 = this.LJLJI.LLF;
            Integer num = (Integer) ((LinkedHashMap) c40864G2a3.LIZIZ).get(Integer.valueOf(c40864G2a3.LIZ));
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            map.put(valueOf, Integer.valueOf(Math.max(i2, 4)));
            if (i != 0 || (i3 = this.LJLILLLLZI) > 5) {
                return;
            }
            if (i3 < 5) {
                this.LJLILLLLZI = i3 + 1;
                return;
            }
            G2H g2h = G2H.INTEREST_SELECTION_SCROLL_ACTIVITY;
            C188727au c188727au = new C188727au();
            c188727au.LJ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "duration_since_launch");
            c188727au.LJIIIZ("vid", (String) this.LJLJI.LJZL.getValue());
            java.util.Map<String, String> map2 = c188727au.LIZ;
            o.LJIIIIZZ(map2, "newBuilder()\n           …               .builder()");
            C36222EJm.LIZIZ(g2h, map2);
            return;
        }
        o.LJIJI("outerLayoutManager");
        throw null;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL += i2;
        if (!this.LJLJI.isViewValid() || this.LJLJI._$_findCachedViewById(R.id.l_2).getHeight() <= 0) {
            return;
        }
        this.LJLJI._$_findCachedViewById(R.id.l_2).setAlpha((this.LJLIL * 1.0f) / this.LJLJI._$_findCachedViewById(R.id.l_2).getHeight());
    }
}
