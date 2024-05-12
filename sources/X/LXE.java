package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ui.FeedNearbyFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LXE implements C2MJ {
    public int LJLIL;
    public final /* synthetic */ FeedNearbyFragment LJLILLLLZI;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    public LXE(FeedNearbyFragment feedNearbyFragment) {
        this.LJLILLLLZI = feedNearbyFragment;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.LJLIL = this.LJLILLLLZI.Jl().mViewPager.getCurrentItem();
        }
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        Aweme ya = this.LJLILLLLZI.ya();
        if (ya != null) {
            FeedNearbyFragment feedNearbyFragment = this.LJLILLLLZI;
            String aid = ya.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            C48480J0y.LJII(aid);
            if (i < 10) {
                feedNearbyFragment.Il().rv0(i);
            }
        }
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        if (i < 10 && this.LJLIL == i && f > 0.05f) {
            this.LJLILLLLZI.Il().rv0(i + 1);
        }
    }
}
