package X;

import Y.ARunnableS6S0101000_2;
import Y.ARunnableS8S0201000_5;
import android.content.Context;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;

/* renamed from: X.LnK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnDrawListenerC55314LnK implements ViewTreeObserver.OnDrawListener {
    public boolean LJLIL;
    public final /* synthetic */ DetailFragmentPanel LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        DetailFragmentPanel detailFragmentPanel;
        C80796VnM c80796VnM;
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        Context context = this.LJLILLLLZI.getContext();
        if (context != null) {
            if (C46343IGt.LIZ(this.LJLILLLLZI.getEventType())) {
                C57022Lq.LIZ.LJLIL.postDelayed(new ARunnableS8S0201000_5(1, this, context, 15), (((Number) C46343IGt.LIZ.getValue()).intValue() >> 1) * 500);
            } else {
                C16970lZ.LJFF(context, "common_feed_item_feed");
                C16970lZ.LJFF(context, "common_feed_item_feed");
            }
            if (((Boolean) DQZ.LIZJ.getValue()).booleanValue() && (c80796VnM = (detailFragmentPanel = this.LJLILLLLZI).mViewPager) != null) {
                ARunnableS6S0101000_2 aRunnableS6S0101000_2 = new ARunnableS6S0101000_2(0, this, 1);
                detailFragmentPanel.LLILLL = aRunnableS6S0101000_2;
                c80796VnM.postDelayed(aRunnableS6S0101000_2, 1200L);
            }
        }
        C55537Lqv c55537Lqv = this.LJLILLLLZI.LLILIL;
        if (c55537Lqv != null) {
            c55537Lqv.LIZIZ();
        }
        C55537Lqv c55537Lqv2 = this.LJLILLLLZI.LLILL;
        if (c55537Lqv2 != null) {
            c55537Lqv2.LIZIZ();
        }
        C55537Lqv c55537Lqv3 = this.LJLILLLLZI.LLILLIZIL;
        if (c55537Lqv3 != null) {
            c55537Lqv3.LIZIZ();
        }
        this.LJLILLLLZI.mViewPager.post(new ARunnableS6S0101000_2(3, this, 0));
    }

    public ViewTreeObserverOnDrawListenerC55314LnK(DetailFragmentPanel detailFragmentPanel) {
        this.LJLILLLLZI = detailFragmentPanel;
    }
}
