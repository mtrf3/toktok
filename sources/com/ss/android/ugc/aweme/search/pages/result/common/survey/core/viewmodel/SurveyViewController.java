package com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel;

import X.ActivityC45651qj;
import X.C18950ol;
import X.C221108m2;
import X.C29701Eo;
import X.C48891JGt;
import X.C62822Ol8;
import X.C68182ly;
import X.InterfaceC48888JGq;
import X.K30;
import Y.ALAdapterS6S0100000_8;
import Y.ARunnableS27S0200000_8;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo.SurveyDetailResponse;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SurveyViewController implements InterfaceC48888JGq {
    public static final /* synthetic */ int LJZ = 0;
    public ViewStub LJLIL;
    public ActivityC45651qj LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public ViewGroup LJLJJLL;
    public List<TuxIconView> LJLJL;
    public TextView LJLJLJ;
    public View LJLJLLL;
    public C29701Eo LJLL;
    public SearchSurveyConfig LJLLI = new SearchSurveyConfig();
    public SurveyDetailResponse.Data LJLLILLLL = new SurveyDetailResponse.Data(null, null, 3, null);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 261));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 264));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 263));
    public boolean LJLLLLLL;
    public int LJLZ;

    public final K30 LIZ() {
        return (K30) this.LJLLJ.getValue();
    }

    public final boolean LIZIZ() {
        View view = this.LJLJI;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        View view2 = this.LJLJI;
        if (view2 != null) {
            if (view2.getAlpha() != 1.0f) {
                return false;
            }
            return true;
        }
        o.LJIJI("rootView");
        throw null;
    }

    public final void LIZLLL() {
        boolean z;
        View view = this.LJLJI;
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (view != null) {
                view.setVisibility(8);
            } else {
                o.LJIJI("rootView");
                throw null;
            }
        }
        this.LJLLLLLL = false;
        this.LJLZ = 0;
        LIZ().removeCallbacksAndMessages(null);
        LIZ().post(new ARunnableS27S0200000_8(this, (SurveyViewModel) this.LJLLL.getValue(), 34));
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj != null) {
            C68182ly.LIZLLL(activityC45651qj, this);
        } else {
            o.LJIJI("activity");
            throw null;
        }
    }

    @Override // X.InterfaceC48888JGq
    public final void onResume() {
        if (this.LJLLLLLL && LIZIZ()) {
            this.LJLLLLLL = false;
            LIZ().LIZ(this.LJLZ);
        }
    }

    @Override // X.InterfaceC48888JGq
    public final void onStop() {
        View view = this.LJLJI;
        if (view != null) {
            if (view.getVisibility() == 0) {
                LIZ().removeCallbacksAndMessages(null);
                this.LJLLLLLL = true;
                return;
            }
            return;
        }
        o.LJIJI("rootView");
        throw null;
    }

    public SurveyViewController() {
        C221108m2.LIZIZ(new AqS158S0100000_8(this, 262));
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C48891JGt.onCreate(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C48891JGt.onDestroy(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C48891JGt.onPause(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C48891JGt.onStart(this);
    }

    public final void LIZJ(long j) {
        if (!LIZIZ()) {
            LIZLLL();
            return;
        }
        View view = this.LJLJI;
        if (view != null) {
            float height = view.getHeight();
            View view2 = this.LJLJI;
            if (view2 != null) {
                o.LJII(view2.getLayoutParams(), "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                float f = height + ((ViewGroup.MarginLayoutParams) r1).bottomMargin;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setStartDelay(j);
                animatorSet.setDuration(300L);
                animatorSet.setInterpolator(C18950ol.LIZIZ(0.25f, 1.0f, 0.25f, 1.0f));
                Animator[] animatorArr = new Animator[2];
                View view3 = this.LJLJI;
                if (view3 != null) {
                    animatorArr[0] = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f);
                    View view4 = this.LJLJI;
                    if (view4 != null) {
                        animatorArr[1] = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                        animatorSet.playTogether(animatorArr);
                        animatorSet.addListener(new ALAdapterS6S0100000_8(this, 3));
                        animatorSet.start();
                        return;
                    }
                    o.LJIJI("rootView");
                    throw null;
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0058, code lost:
    
        if (r7 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.Integer r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController.LJ(java.lang.Integer):void");
    }
}
