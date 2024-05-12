package X;

import Y.IDRunnableS6S0101000;
import android.transition.Transition;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;

/* renamed from: X.Lor, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55409Lor extends C55422Lp4 {
    public final /* synthetic */ DetailActivity LIZ;

    public C55409Lor(DetailActivity detailActivity) {
        this.LIZ = detailActivity;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        DetailActivity detailActivity = this.LIZ;
        if (!detailActivity.LJLJLJ && detailActivity.LJLJL != null) {
            detailActivity.LJLJLJ = true;
            detailActivity.LJLJL.animate().alpha(0.0f).withEndAction(new IDRunnableS6S0101000(3, detailActivity, 6)).setDuration(50L).start();
        }
    }
}
