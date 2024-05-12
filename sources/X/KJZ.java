package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJZ<T extends Fragment> extends AbstractC51498KJa<T> {
    public final ActivityC45651qj LJLJLLL;
    public final KEP LJLL;
    public SearchResultParam LJLLI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        ActivityC45651qj activityC45651qj = this.LJLJLLL;
        if (activityC45651qj != null) {
            if (i == C51214K8c.LJI()) {
                return activityC45651qj.getString(R.string.fdg);
            }
            if (i == C51214K8c.LJII()) {
                return activityC45651qj.getString(R.string.fdh);
            }
            if (i == C51214K8c.LIZLLL()) {
                return "LIVE";
            }
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object fragment) {
        Fragment fragment2;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(fragment, "fragment");
        Fragment fragment3 = (Fragment) fragment;
        if (LJJIIJ(i)) {
            if (this.LJLJJLL && (fragment2 = (Fragment) this.LJLILLLLZI.get(i)) != null) {
                String LJJIIZ = AbstractC51500KJc.LJJIIZ(container.getId(), i);
                if (this.LJLJJI.LJJJIL(LJJIIZ) == null) {
                    if (this.LJLJJL == null) {
                        FragmentManager fragmentManager = this.LJLJJI;
                        this.LJLJJL = C1B6.LIZ(fragmentManager, fragmentManager);
                    }
                    C1B3 c1b3 = this.LJLJJL;
                    if (c1b3 != null) {
                        c1b3.LJIIIIZZ(container.getId(), 1, fragment2, LJJIIZ);
                    }
                    this.LJLILLLLZI.remove(i);
                }
            }
            LJIIJJI(container);
        }
        Fragment fragment4 = this.LJLJI;
        if (fragment3 != fragment4) {
            if (fragment4 != null) {
                fragment4.setMenuVisibility(false);
                this.LJLJI.setUserVisibleHint(false);
            }
            fragment3.setMenuVisibility(true);
            fragment3.setUserVisibleHint(true);
            this.LJLJI = fragment3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KJZ(FragmentManager fm, ActivityC45651qj activity, int i, KEM ecomResultService) {
        super(fm, i);
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(ecomResultService, "ecomResultService");
        this.LJLJLLL = activity;
        this.LJLL = ecomResultService;
    }
}
