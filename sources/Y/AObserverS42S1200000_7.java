package Y;

import X.ActivityC45651qj;
import X.C26045AKb;
import androidx.lifecycle.Observer;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class AObserverS42S1200000_7 implements Observer {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS42S1200000_7 aObserverS42S1200000_7, Object obj) {
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObserverS42S1200000_7.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aObserverS42S1200000_7.l2;
        String str = aObserverS42S1200000_7.s0;
        feedRecommendFragment.getClass();
        if (((Integer) obj).intValue() >= 2 && !feedRecommendFragment.LLIIIZ.booleanValue()) {
            feedRecommendFragment.LLIIIZ = Boolean.TRUE;
            if (feedRecommendFragment.LLIIIL == 2) {
                feedRecommendFragment.LLIIIL = 0;
                SmartRouter.buildRoute(activityC45651qj, FeedRecommendFragment.Kl(str)).open();
            }
        }
    }

    public static final void onChanged$1(AObserverS42S1200000_7 aObserverS42S1200000_7, Object obj) {
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObserverS42S1200000_7.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aObserverS42S1200000_7.l2;
        String str = aObserverS42S1200000_7.s0;
        feedRecommendFragment.getClass();
        int intValue = ((Integer) obj).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4 && intValue != 5) {
                            return;
                        }
                    }
                }
            }
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIZ(activityC45651qj.getResources().getString(R.string.hc8));
            c26045AKb.LJIIJ();
            feedRecommendFragment.LLIIIL = 1;
            return;
        }
        if (feedRecommendFragment.LLIIIZ.booleanValue()) {
            SmartRouter.buildRoute(activityC45651qj, FeedRecommendFragment.Kl(str)).open();
        } else {
            feedRecommendFragment.LLIIIL = 2;
        }
    }

    public AObserverS42S1200000_7(FeedRecommendFragment feedRecommendFragment, ActivityC45651qj activityC45651qj, String str, int i) {
        this.$t = i;
        this.l1 = feedRecommendFragment;
        this.l2 = activityC45651qj;
        this.s0 = str;
    }
}
