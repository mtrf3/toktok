package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.journey.step.interestselector.SelectInterestsComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2T extends C0A6 {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ SelectInterestsComponent LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ C76732zl LJLJJI;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        C76732zl c76732zl;
        int i2;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0 || (i2 = (c76732zl = this.LJLJJI).element) > 5) {
            return;
        }
        if (i2 < 5) {
            c76732zl.element = i2 + 1;
            return;
        }
        G2H g2h = G2H.INTEREST_SELECTION_SCROLL_ACTIVITY;
        C188727au c188727au = new C188727au();
        c188727au.LJ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "duration_since_launch");
        c188727au.LJIIIZ("vid", (String) this.LJLILLLLZI.LJZL.getValue());
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
        C36222EJm.LIZIZ(g2h, map);
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL.element += i2;
        if (i2 == 0 || !this.LJLILLLLZI.isViewValid() || (i3 = this.LJLJI.element) == -1) {
            return;
        }
        this.LJLILLLLZI._$_findCachedViewById(R.id.jcg).setY((((this.LJLIL.element * 1.0f) / (i3 - this.LJLILLLLZI.Gl().getHeight())) * (this.LJLILLLLZI.Gl().getHeight() - this.LJLILLLLZI._$_findCachedViewById(R.id.jcg).getHeight())) + this.LJLILLLLZI._$_findCachedViewById(R.id.l_2).getHeight());
    }

    public G2T(C76732zl c76732zl, SelectInterestsComponent selectInterestsComponent, C76732zl c76732zl2, C76732zl c76732zl3) {
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = selectInterestsComponent;
        this.LJLJI = c76732zl2;
        this.LJLJJI = c76732zl3;
    }
}
