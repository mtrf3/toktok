package X;

import Y.ARunnableS14S0101000_10;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;

/* renamed from: X.FRb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38967FRb implements InterfaceC36312EMy {
    public final /* synthetic */ FeedRecommendFragment LIZ;

    @Override // X.InterfaceC36312EMy
    public final void LIZ() {
        ActivityC45651qj mo49getActivity;
        if (C36311EMx.LJ != null && (!r0.isEmpty())) {
            int i = 3;
            if (DUE.LJFF(false)) {
                FeedRecommendFragment feedRecommendFragment = this.LIZ;
                if (feedRecommendFragment.LLI || (mo49getActivity = feedRecommendFragment.mo49getActivity()) == null) {
                    return;
                }
                mo49getActivity.runOnUiThread(new ARunnableS14S0101000_10(3, feedRecommendFragment, 0));
                return;
            }
            if (!DUE.LJ() && !DUE.LIZLLL()) {
                return;
            }
            FeedRecommendFragment feedRecommendFragment2 = this.LIZ;
            Boolean bool = Boolean.TRUE;
            ActivityC45651qj mo49getActivity2 = feedRecommendFragment2.mo49getActivity();
            if (mo49getActivity2 == null) {
                return;
            }
            mo49getActivity2.runOnUiThread(new C09H(i, feedRecommendFragment2, bool));
        }
    }

    public C38967FRb(FeedRecommendFragment feedRecommendFragment) {
        this.LIZ = feedRecommendFragment;
    }
}
