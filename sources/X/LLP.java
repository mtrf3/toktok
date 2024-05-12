package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LLP extends LLN {
    public final ActivityC45651qj LIZIZ;
    public ScrollSwitchStateManager LIZJ;
    public HomeViewPagerAbility LIZLLL;

    public final ScrollSwitchStateManager LIZ() {
        if (this.LIZJ == null) {
            this.LIZJ = C84193Sd.LIZ(this.LIZIZ);
        }
        return this.LIZJ;
    }

    public LLP(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZIZ = activity;
    }

    @Override // X.LLN, X.InterfaceC208778Hh
    public final boolean LIZJ(float f, int i) {
        ScrollSwitchStateManager LIZ;
        HomeViewPagerAbility homeViewPagerAbility;
        ScrollSwitchStateManager LIZ2;
        Aweme aweme = C3SZ.LIZ(this.LIZIZ).LJLJLLL;
        boolean z = false;
        if (i == -1 && (LIZ2 = LIZ()) != null && TextUtils.equals("page_feed", LIZ2.hv0()) && aweme != null && aweme.getIsSubAweme()) {
            return false;
        }
        if (!C9T4.LIZIZ(aweme) && i == -1) {
            ScrollSwitchStateManager LIZ3 = LIZ();
            if (LIZ3 != null && TextUtils.equals("page_feed", LIZ3.hv0())) {
                if (C2049682q.LIZ(aweme)) {
                    if (C61127Nyt.LIZIZ(aweme) && C2049682q.LIZ(aweme) && Math.abs(f) >= C7MY.LIZIZ(40)) {
                        C5S1 c5s1 = new C5S1(this.LIZIZ);
                        c5s1.LIZJ(R.string.i4z);
                        c5s1.LJ();
                    }
                    return false;
                }
                if (C61127Nyt.LIZIZ(aweme)) {
                    return false;
                }
                C5S1 c5s12 = new C5S1(this.LIZIZ);
                c5s12.LIZJ(R.string.i4z);
                c5s12.LJ();
                return false;
            }
        } else if (i == 1 && (LIZ = LIZ()) != null && TextUtils.equals("page_feed", LIZ.hv0()) && C53765L8f.LJIJ()) {
            if (this.LIZLLL == null) {
                MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(this.LIZIZ);
                if (LJJLIIIJJI != null) {
                    homeViewPagerAbility = C78880UxY.LJJJJIZL(LJJLIIIJJI);
                } else {
                    homeViewPagerAbility = null;
                }
                this.LIZLLL = homeViewPagerAbility;
            }
            HomeViewPagerAbility homeViewPagerAbility2 = this.LIZLLL;
            if (homeViewPagerAbility2 == null || homeViewPagerAbility2.dL() != 0) {
                return false;
            }
        }
        ScrollSwitchStateManager LIZ4 = LIZ();
        o.LJI(LIZ4);
        if (TextUtils.equals("HOME", LIZ4.LJLZ) && i == -1) {
            C52181Kdt c52181Kdt = C52180Kds.LIZ;
            o.LJI(c52181Kdt);
            if (c52181Kdt.LIZ == 1) {
                z = true;
            }
        }
        return !z;
    }

    @Override // X.LLN, X.InterfaceC208778Hh
    public final boolean LIZLLL(float f, float f2) {
        if (C61127Nyt.LIZIZ(C3SZ.LIZ(this.LIZIZ).LJLJLLL)) {
            return false;
        }
        return super.LIZLLL(f, f2);
    }
}
