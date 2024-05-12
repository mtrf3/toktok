package X;

import Y.IDAListenerS76S0100000_8;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.JBm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48754JBm implements JC4 {
    public final /* synthetic */ BaseAutoScrollUIComponent LJLIL;

    @Override // X.JC4
    public final void onStart() {
    }

    @Override // X.JC4
    public final void LIZ() {
        if (this.LJLIL.v3()) {
            final BaseAutoScrollUIComponent baseAutoScrollUIComponent = this.LJLIL;
            final TuxTextView tuxTextView = baseAutoScrollUIComponent.LJLJJLL;
            final View view = baseAutoScrollUIComponent.LJLJLJ;
            if (tuxTextView != null && view != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                final int width = tuxTextView.getWidth();
                final int width2 = view.getWidth();
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.97P
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        o.LJIIIZ(it, "it");
                        if (BaseAutoScrollUIComponent.this.getContainerView() == null || tuxTextView == null) {
                            return;
                        }
                        float animatedFraction = it.getAnimatedFraction();
                        float f = 1.0f - animatedFraction;
                        tuxTextView.setAlpha(f);
                        int i = (int) (animatedFraction * width);
                        if (C26338AVi.LIZLLL(tuxTextView)) {
                            tuxTextView.setScrollX(i);
                        } else {
                            tuxTextView.setScrollX(-i);
                        }
                        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = (int) (f * width);
                        }
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = width2 - i;
                        }
                        BaseAutoScrollUIComponent.this.getContainerView().requestLayout();
                    }
                });
                ofFloat.addListener(new IDAListenerS76S0100000_8(baseAutoScrollUIComponent, 5));
                ofFloat.start();
            }
        }
        LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LJJIJ(false);
    }

    public C48754JBm(BaseAutoScrollUIComponent baseAutoScrollUIComponent) {
        this.LJLIL = baseAutoScrollUIComponent;
    }

    @Override // X.JC4
    public final void LJIILIIL(long j) {
        Aweme currentAweme;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.LJLL.getValue();
        if (iViewPagerComponentAbility != null && (currentAweme = iViewPagerComponentAbility.getCurrentAweme()) != null && C210018Mb.LIZIZ(currentAweme)) {
            CountDownTimer countDownTimer = this.LJLIL.LJLJLLL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            LIZ();
        }
    }
}
