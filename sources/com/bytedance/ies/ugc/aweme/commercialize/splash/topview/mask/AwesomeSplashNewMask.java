package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import X.C025908h;
import X.C16880lQ;
import X.C5H3;
import X.C60047NhT;
import X.C63081OpJ;
import X.KL2;
import X.NSC;
import X.ViewOnClickListenerC60048NhU;
import X.ViewOnClickListenerC60049NhV;
import Y.ALAdapterS3S0000000_10;
import Y.ARunnableS46S0100000_10;
import Y.IDTListenerS119S0100000_10;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AwesomeSplashNewMask extends RelativeLayout implements NSC {
    public int LJLIL;
    public final Map<String, String> LJLILLLLZI;
    public final Context LJLJI;
    public boolean LJLJJI;
    public Aweme LJLJJL;
    public AwemeSplashInfo LJLJJLL;
    public AwemeSplashInfo.SkipInfo LJLJL;
    public AwemeSplashInfo.LabelInfo LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public ViewPropertyAnimator LJLLILLLL;
    public boolean LJLLJ;
    public ARunnableS46S0100000_10 LJLLL;
    public ObjectAnimator LJLLLL;
    public long LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final C5H3 LJZL;
    public final C5H3 LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public final C60047NhT LLFF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AwesomeSplashNewMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    @Override // X.NSC
    public final void LIZ() {
        this.LJLJJI = true;
        remove();
    }

    private final GestureDetector getMaskGestureDetector() {
        return (GestureDetector) this.LLD.getValue();
    }

    private final ImageView getPromptIv() {
        return (ImageView) this.LJZI.getValue();
    }

    private final RelativeLayout getPromptTotal() {
        return (RelativeLayout) this.LJLZ.getValue();
    }

    private final TextView getPromptTv() {
        return (TextView) this.LJZ.getValue();
    }

    private final TopViewSkipButton getSkipButton() {
        return (TopViewSkipButton) this.LJZL.getValue();
    }

    private final TextView getSponsorSign() {
        return (TextView) this.LL.getValue();
    }

    private final ImageView getTopPromptIv() {
        return (ImageView) this.LLF.getValue();
    }

    @Override // X.NSC
    public final void remove() {
        if (this.LJLLL != null) {
            getPromptTotal().removeCallbacks(this.LJLLL);
            this.LJLLL = null;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.LJLLILLLL;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.LJLLILLLL = null;
        }
        ObjectAnimator objectAnimator = this.LJLLLL;
        if (objectAnimator != null) {
            C16880lQ.LJLJJLL(objectAnimator);
            ObjectAnimator objectAnimator2 = this.LJLLLL;
            o.LJI(objectAnimator2);
            objectAnimator2.cancel();
            this.LJLLLL = null;
        }
        ImageView promptIv = getPromptIv();
        o.LJIIIIZZ(promptIv, "promptIv");
        int i = 0;
        TextView promptTv = getPromptTv();
        o.LJIIIIZZ(promptTv, "promptTv");
        View[] viewArr = {promptIv, promptTv};
        do {
            viewArr[i].clearAnimation();
            i++;
        } while (i < 2);
        TopViewSkipButton skipButton = getSkipButton();
        PthreadTimer pthreadTimer = skipButton.LJLJL;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        skipButton.LJLJL = null;
        skipButton.LJLJJLL.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ady);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.topMargin;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            marginLayoutParams.topMargin = C63081OpJ.LJJJJLI(context) + i;
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setOnTouchListener(new IDTListenerS119S0100000_10(this, 0));
    }

    public static final void LIZJ(AwesomeSplashNewMask awesomeSplashNewMask) {
        AwemeRawAd awemeRawAd;
        C16880lQ.LJIJI(awesomeSplashNewMask.getPromptTv(), ViewOnClickListenerC60049NhV.LJLIL);
        Aweme aweme = awesomeSplashNewMask.LJLJJL;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C025908h.LIZLLL("draw_ad", "othershow", awemeRawAd, "tips", "refer");
    }

    public final void LIZIZ(boolean z) {
        String enterAppText;
        AwemeSplashInfo awemeSplashInfo = this.LJLJJLL;
        if (awemeSplashInfo == null || (enterAppText = awemeSplashInfo.getEnterAppText()) == null || enterAppText.length() == 0) {
            return;
        }
        int i = this.LJLJLLL;
        if (i != 6) {
            if (i != 7) {
                return;
            }
            KL2.LJIILLIIL(0, getPromptTotal());
            KL2.LJIILLIIL(8, getPromptIv());
            TextView promptTv = getPromptTv();
            o.LJIIIIZZ(promptTv, "promptTv");
            LIZLLL(z, promptTv);
            TextView promptTv2 = getPromptTv();
            AwemeSplashInfo awemeSplashInfo2 = this.LJLJJLL;
            o.LJI(awemeSplashInfo2);
            promptTv2.setText(awemeSplashInfo2.getEnterAppText());
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getPromptTv(), "translationY", 0.0f, -KL2.LIZJ(this.LJLJI, 8.0f), 0.0f);
            this.LJLLLL = ofFloat;
            if (z && ofFloat != null) {
                ofFloat.setStartDelay(300L);
            }
            ObjectAnimator objectAnimator = this.LJLLLL;
            if (objectAnimator != null) {
                objectAnimator.setDuration(2000L);
            }
            ObjectAnimator objectAnimator2 = this.LJLLLL;
            if (objectAnimator2 != null) {
                objectAnimator2.addListener(new ALAdapterS3S0000000_10(0));
            }
            ObjectAnimator objectAnimator3 = this.LJLLLL;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
            LIZJ(this);
            return;
        }
        KL2.LJIILLIIL(0, getPromptTotal());
        TextView promptTv3 = getPromptTv();
        AwemeSplashInfo awemeSplashInfo3 = this.LJLJJLL;
        o.LJI(awemeSplashInfo3);
        promptTv3.setText(awemeSplashInfo3.getEnterAppText());
        TextView promptTv4 = getPromptTv();
        o.LJIIIIZZ(promptTv4, "promptTv");
        ImageView promptIv = getPromptIv();
        o.LJIIIIZZ(promptIv, "promptIv");
        LIZLLL(z, promptTv4, promptIv);
        LIZJ(this);
        C16880lQ.LJIILLIIL(getPromptIv(), ViewOnClickListenerC60048NhU.LJLIL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(ev);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    @Override // X.NSC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvent(X.C55008LiO r12) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask.onEvent(X.LiO):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        int i;
        o.LJIIIZ(event, "event");
        super.onTouchEvent(event);
        GestureDetector maskGestureDetector = getMaskGestureDetector();
        if (!this.LJLJJI && (i = this.LJLIL) != 1 && i != 4) {
            maskGestureDetector.onTouchEvent(event);
        }
        if (this.LJLIL != 4) {
            return true;
        }
        return false;
    }

    public static final void LIZLLL(boolean z, View... viewArr) {
        if (z) {
            for (View view : viewArr) {
                view.setAlpha(0.0f);
                KL2.LJIILLIIL(0, view);
                view.animate().alpha(1.0f).setDuration(300L).setListener(null);
            }
            return;
        }
        for (View view2 : viewArr) {
            KL2.LJIILLIIL(0, view2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AwesomeSplashNewMask(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r4, r0)
            r0 = 0
            r3.<init>(r4, r5, r0)
            r0 = 4
            r3.LJLIL = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.LJLILLLLZI = r0
            r3.LJLJI = r4
            r0 = 1
            r3.LJLLJ = r0
            X.8m0 r2 = X.EnumC221088m0.NONE
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 45
            r1.<init>(r3, r0)
            X.5H3 r0 = X.C221108m2.LIZ(r2, r1)
            r3.LJLZ = r0
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 46
            r1.<init>(r3, r0)
            X.5H3 r0 = X.C221108m2.LIZ(r2, r1)
            r3.LJZ = r0
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 44
            r1.<init>(r3, r0)
            X.5H3 r0 = X.C221108m2.LIZ(r2, r1)
            r3.LJZI = r0
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 47
            r1.<init>(r3, r0)
            X.5H3 r0 = X.C221108m2.LIZ(r2, r1)
            r3.LJZL = r0
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 48
            r1.<init>(r3, r0)
            X.5H3 r0 = X.C221108m2.LIZ(r2, r1)
            r3.LL = r0
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 43
            r1.<init>(r3, r0)
            X.5H3 r0 = X.C221108m2.LIZ(r2, r1)
            r3.LLD = r0
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 49
            r1.<init>(r3, r0)
            X.5H3 r0 = X.C221108m2.LIZ(r2, r1)
            r3.LLF = r0
            X.NhT r0 = new X.NhT
            r0.<init>(r3)
            r3.LLFF = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
