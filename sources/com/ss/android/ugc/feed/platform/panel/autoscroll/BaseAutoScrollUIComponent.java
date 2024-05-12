package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.C210018Mb;
import X.C221108m2;
import X.C48754JBm;
import X.C48755JBn;
import X.C62822Ol8;
import X.LFH;
import Y.ARunnableS40S0100000_4;
import Y.IDAListenerS3S0110000_8;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class BaseAutoScrollUIComponent extends BasePanelUIComponent {
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxIconView LJLJL;
    public View LJLJLJ;
    public CountDownTimer LJLJLLL;
    public final C62822Ol8 LJLL;

    public abstract String A3();

    public boolean v3() {
        return false;
    }

    public BaseAutoScrollUIComponent() {
        new LinkedHashMap();
        this.LJLJJI = C221108m2.LIZIZ(C48755JBn.LJLIL);
        this.LJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 385));
    }

    public final boolean E3() {
        o.LJIIIIZZ(this.LJLJJI.getValue(), "<get-keva>(...)");
        return !((Keva) r2).getBoolean(A3(), false);
    }

    public final void C3() {
        if (getContainerView().getVisibility() == 8) {
            return;
        }
        LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LJJIJ(false);
        x3(false);
    }

    public final void F3() {
        boolean z;
        Aweme currentAweme;
        if (getContainerView().getVisibility() == 0) {
            return;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLL.getValue();
        if (iViewPagerComponentAbility != null && (currentAweme = iViewPagerComponentAbility.getCurrentAweme()) != null) {
            z = C210018Mb.LIZIZ(currentAweme);
        } else {
            z = false;
        }
        getContainerView().setVisibility(0);
        if (E3() && !z) {
            LFH lfh = LFH.LIZIZ;
            lfh.LIZLLL().LJIILLIIL().LIZLLL().LJJIJ(true);
            this.LJLJJL = true;
            Object value = this.LJLJJI.getValue();
            o.LJIIIIZZ(value, "<get-keva>(...)");
            ((Keva) value).storeBoolean(A3(), true);
            getContainerView().post(new ARunnableS40S0100000_4(this, 80));
            TuxTextView tuxTextView = this.LJLJJLL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
            TuxIconView tuxIconView = this.LJLJL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
            }
            TuxTextView tuxTextView2 = this.LJLJJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setAlpha(1.0f);
            }
            x3(true);
            this.LJLJLLL = new CountDownTimer(3000L, 1000L, new C48754JBm(this));
            lfh.LIZLLL().LJIILLIIL().LIZLLL().LJII(true);
            CountDownTimer countDownTimer = this.LJLJLLL;
            if (countDownTimer != null) {
                countDownTimer.start();
                return;
            }
            return;
        }
        getContainerView().post(new ARunnableS40S0100000_4(this, 81));
        this.LJLJJL = false;
        TuxIconView tuxIconView2 = this.LJLJL;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(0);
        }
        TuxTextView tuxTextView3 = this.LJLJJLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setVisibility(8);
        }
        x3(true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJJLL = (TuxTextView) view.findViewById(R.id.aap);
        this.LJLJL = (TuxIconView) view.findViewById(R.id.aam);
        this.LJLJLJ = view.findViewById(R.id.aak);
        LFH.LIZIZ.LIZLLL().LJII().LJJIJL(this.LJLJLJ);
    }

    public final void x3(final boolean z) {
        float f;
        getContainerView().setVisibility(0);
        View containerView = getContainerView();
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        containerView.setAlpha(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.97Q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                o.LJIIIZ(it, "it");
                float animatedFraction = it.getAnimatedFraction();
                View containerView2 = BaseAutoScrollUIComponent.this.getContainerView();
                if (!z) {
                    animatedFraction = 1.0f - animatedFraction;
                }
                containerView2.setAlpha(animatedFraction);
                BaseAutoScrollUIComponent.this.getContainerView().requestLayout();
            }
        });
        ofFloat.addListener(new IDAListenerS3S0110000_8(this, z, 0));
        ofFloat.start();
    }
}
