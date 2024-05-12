package X;

import Y.AUListenerS98S0100000_10;
import Y.IDiS268S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.experiment.FeedDescSeeMoreConfig;
import com.ss.android.ugc.aweme.feed.experiment.FeedPauseAnimationOptimizationType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OO3 implements OM3, OOA {
    public static final float LJJJJLI = C32151Nz.LJIIZILJ(2);
    public static final float LJJJJLL;
    public static final float LJJJJZ;
    public static final float LJJJJZI;
    public static final float LJJJLIIL;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public boolean LJIIJJI;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public OO7 LJIJ;
    public Context LJIJI;
    public SmartImageView LJIJJ;
    public GradientDrawable LJIJJLI;
    public FrameLayout LJIL;
    public SmartImageView LJJ;
    public View LJJI;
    public View LJJIFFI;
    public View LJJII;
    public View LJJIII;
    public View LJJIIJ;
    public View LJJIIJZLJL;
    public View LJJIIZ;
    public View LJJIIZI;
    public InterfaceC2309294m LJJIJ;
    public View LJJIJIIJI;
    public View LJJIJIIJIL;
    public View LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public Aweme LJJIL;
    public OO8 LJJJ;
    public final float LJJJI;
    public final float LJJJIL;
    public boolean LJJJJ;
    public String LJJJJI;
    public HomePageViewPagerAbility LJJJJIZL;
    public HomeViewPagerAbility LJJJJJ;
    public IDiS268S0100000_4 LJJJJJL;
    public C42508GmG LJJJJL;
    public final ONJ LIZ = new ONJ("video_scale");
    public float LJ = -1.0f;
    public float LJFF = -1.0f;
    public final float LJIIIZ = C32151Nz.LJIIZILJ(8);
    public final float LJIIJ = C32151Nz.LJIIZILJ(Double.valueOf(60.0d));
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 469));
    public final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 468));
    public String LJJIZ = "";

    static {
        int i;
        int i2;
        if (C8D3.LIZ()) {
            i = 60;
        } else {
            i = LiveTryModeCountDownThresholdSetting.DEFAULT;
        }
        LJJJJLL = C32151Nz.LJIIZILJ(Integer.valueOf(i));
        if (C8D3.LIZ()) {
            i2 = 80;
        } else {
            i2 = 160;
        }
        LJJJJZ = C32151Nz.LJIIZILJ(Integer.valueOf(i2));
        LJJJJZI = C32151Nz.LJIIZILJ(30);
        LJJJLIIL = C32151Nz.LJIIZILJ(150);
    }

    public final void LJIIL() {
        this.LJIIJJI = false;
        LJIJ(this.LJIL, 0.0f);
        View view = this.LJJI;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.LJJIFFI;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        View view3 = this.LJJII;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        }
        View view4 = this.LJJIII;
        if (view4 != null) {
            view4.setAlpha(1.0f);
        }
        View view5 = this.LJJIIJ;
        if (view5 != null) {
            view5.setAlpha(1.0f);
        }
        LJIIIZ(false);
        View view6 = this.LJJIIZ;
        if (view6 != null) {
            view6.setVisibility(4);
        }
        View view7 = this.LJJIIZ;
        if (view7 != null) {
            view7.setClickable(false);
        }
        OO7 oo7 = this.LJIJ;
        if (oo7 != null) {
            oo7.setAlpha(0.0f);
        }
        LJIIZILJ(0.0f);
    }

    public final void LJIILL() {
        String str;
        this.LJJIJLIJ = false;
        this.LJIIJJI = false;
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = this.LJJIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.LJFF(str, new OMH(OBQ.BACKGROUND.getType(), this.LJIIJJI));
        LJIIL();
    }

    public final boolean LJIIIIZZ() {
        VideoMaskInfo reportMaskInfo;
        if (!o.LJ(this.LJJIZ, "homepage_hot") || !this.LJIIZILJ || !this.LJJIJLIJ || this.LIZIZ <= 0.0f || this.LJJIL == null) {
            return false;
        }
        SmartImageView smartImageView = this.LJJ;
        if (smartImageView != null && smartImageView.getVisibility() == 0) {
            return false;
        }
        Aweme aweme = this.LJJIL;
        if (aweme != null && aweme.getAwemeType() == 40) {
            return false;
        }
        Aweme aweme2 = this.LJJIL;
        if (aweme2 != null && (reportMaskInfo = aweme2.getReportMaskInfo()) != null && o.LJ(reportMaskInfo.getShowMask(), Boolean.TRUE)) {
            return false;
        }
        View view = this.LJJIIZI;
        if (view != null && view.getVisibility() == 0) {
            return false;
        }
        return true;
    }

    public final void LJIIJJI() {
        View view;
        if (this.LJIIJJI && (view = this.LJJIIJZLJL) != null) {
            view.setVisibility(8);
        }
        HomePageViewPagerAbility homePageViewPagerAbility = this.LJJJJIZL;
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.LJJJJZ(true);
        }
    }

    public OO3() {
        FeedDescSeeMoreConfig feedDescSeeMoreConfig;
        float f;
        float f2 = 0.18f;
        try {
            feedDescSeeMoreConfig = (FeedDescSeeMoreConfig) OO5.LIZ.getValue();
        } catch (Exception unused) {
            feedDescSeeMoreConfig = new FeedDescSeeMoreConfig(0, 0.18f);
        }
        if (feedDescSeeMoreConfig != null) {
            float opacity = feedDescSeeMoreConfig.getOpacity();
            if (0.18f <= opacity && opacity <= 0.7f) {
                f2 = feedDescSeeMoreConfig.getOpacity();
            }
        }
        this.LJJJI = f2;
        FeedPauseAnimationOptimizationType.LIZ.getClass();
        FeedPauseAnimationOptimizationType.IconStyle LIZ = FeedPauseAnimationOptimizationType.LIZ();
        if (LIZ != null) {
            f = LIZ.iconAlpha;
        } else {
            f = 1.0f;
        }
        this.LJJJIL = f;
        this.LJJJJI = "";
    }

    @Override // X.OM3
    public final boolean LIZIZ() {
        return this.LJIIJJI;
    }

    @Override // X.OM3
    public final boolean LIZLLL() {
        return this.LJIILLIIL;
    }

    @Override // X.OOA
    public final boolean LIZ(int i) {
        if (!LJIIIIZZ() || (i >= 0 ? i <= 0 || this.LJIIJJI : !this.LJIIJJI)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0105, code lost:
    
        if (r7.LJIIJJI == false) goto L70;
     */
    @Override // X.OM3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OO3.LIZJ(android.view.MotionEvent):void");
    }

    @Override // X.OOA
    public final boolean LJ(int i) {
        if (o.LJ(this.LJJIZ, "homepage_hot") && i > 0 && this.LJIIJJI) {
            return true;
        }
        return false;
    }

    public final void LJI(OIN oin) {
        this.LJJIIZ = oin;
        if (this.LJIIJJI) {
            if (oin != null) {
                oin.setAlpha(1.0f);
            }
            View view = this.LJJIIZ;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
            return;
        }
        if (oin != null) {
            oin.setAlpha(0.0f);
        }
        View view2 = this.LJJIIZ;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(4);
    }

    public final void LJIIIZ(boolean z) {
        View view;
        if (z) {
            View view2 = this.LJJI;
            if (view2 != null) {
                view2.setAlpha(0.0f);
            }
            View view3 = this.LJJIFFI;
            if (view3 != null) {
                view3.setAlpha(0.0f);
            }
            View view4 = this.LJJII;
            if (view4 != null) {
                view4.setAlpha(0.0f);
            }
            View view5 = this.LJJIII;
            if (view5 != null) {
                view5.setAlpha(0.0f);
            }
            View view6 = this.LJJIIJ;
            if (view6 != null) {
                view6.setAlpha(0.0f);
            }
            View view7 = this.LJJI;
            if (view7 != null) {
                view7.setVisibility(8);
            }
            View view8 = this.LJJIFFI;
            if (view8 != null) {
                view8.setVisibility(8);
            }
            View view9 = this.LJJII;
            if (view9 != null) {
                view9.setVisibility(8);
            }
            View view10 = this.LJJIII;
            if (view10 != null) {
                view10.setVisibility(8);
            }
            View view11 = this.LJJIIJ;
            if (view11 != null) {
                view11.setVisibility(8);
            }
            View view12 = this.LJJIIJZLJL;
            if (view12 != null && view12.getVisibility() == 0 && (view = this.LJJIIJZLJL) != null) {
                view.setVisibility(4);
            }
            LJIIJ(this.LJJIJ, true);
            return;
        }
        View view13 = this.LJJI;
        if (view13 != null) {
            view13.setVisibility(0);
        }
        View view14 = this.LJJIFFI;
        if (view14 != null) {
            view14.setVisibility(0);
        }
        View view15 = this.LJJII;
        if (view15 != null) {
            view15.setVisibility(0);
        }
        View view16 = this.LJJIII;
        if (view16 != null) {
            view16.setVisibility(0);
        }
        View view17 = this.LJJIIJ;
        if (view17 != null) {
            view17.setVisibility(0);
        }
        LJIIJ(this.LJJIJ, false);
    }

    public final void LJIILIIL(boolean z) {
        boolean z2;
        if (z || this.LJIIJJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJJIJLIJ = z2;
        if (z) {
            OO7 oo7 = this.LJIJ;
            if (oo7 == null) {
                return;
            }
            oo7.setVisibility(0);
            return;
        }
        OO7 oo72 = this.LJIJ;
        if (oo72 == null) {
            return;
        }
        oo72.setVisibility(8);
    }

    public final void LJIILLIIL(float f) {
        float f2;
        View view;
        float f3 = 1;
        float f4 = LJJJLIIL;
        float f5 = LJJJJZI;
        float max = Math.max(f3 - ((f * f4) / f5), -0.0f);
        float f6 = f3 - (f5 / f4);
        if (f < f6) {
            f2 = 0.0f;
        } else {
            f2 = ((f - f6) * f4) / f5;
        }
        if (max > 0.0f) {
            View view2 = this.LJJI;
            if (view2 != null) {
                view2.setAlpha(max);
            }
            View view3 = this.LJJIFFI;
            if (view3 != null) {
                view3.setAlpha(max);
            }
            View view4 = this.LJJII;
            if (view4 != null) {
                view4.setAlpha(max);
            }
            View view5 = this.LJJIII;
            if (view5 != null) {
                view5.setAlpha(max);
            }
            View view6 = this.LJJIIJ;
            if (view6 != null) {
                view6.setAlpha(max);
            }
            View view7 = this.LJJIIJZLJL;
            if (view7 != null) {
                view7.setAlpha(max * this.LJJJIL);
            }
            LJIIIZ(false);
        } else {
            LJIIIZ(true);
        }
        if (f2 > 0.0f) {
            View view8 = this.LJJIIZ;
            if (view8 != null) {
                view8.setVisibility(0);
            }
            View view9 = this.LJJIIZ;
            if (view9 != null) {
                view9.setAlpha(f2);
            }
        } else {
            View view10 = this.LJJIIZ;
            if (view10 != null) {
                view10.setVisibility(4);
            }
        }
        View view11 = this.LJJIIZI;
        if (view11 != null && view11.getVisibility() == 0 && (view = this.LJJIIZI) != null) {
            view.setAlpha(Math.max(Math.min(this.LJJJI, f3 - f), 0.0f));
        }
        OO7 oo7 = this.LJIJ;
        if (oo7 == null) {
            return;
        }
        oo7.setAlpha(f);
    }

    public final void LJIIZILJ(float f) {
        ViewOutlineProvider viewOutlineProvider;
        FrameLayout frameLayout;
        if (this.LJIJI == null) {
            return;
        }
        if (this.LJIJJLI == null) {
            GradientDrawable LIZIZ = T28.LIZIZ(0);
            this.LJIJJLI = LIZIZ;
            FrameLayout frameLayout2 = this.LJIL;
            if (frameLayout2 != null) {
                frameLayout2.setForeground(LIZIZ);
            }
        }
        if (this.LJJJJL == null) {
            this.LJJJJL = new C42508GmG(Float.valueOf(this.LJIIIZ));
        }
        FrameLayout frameLayout3 = this.LJIL;
        if (frameLayout3 != null) {
            viewOutlineProvider = frameLayout3.getOutlineProvider();
        } else {
            viewOutlineProvider = null;
        }
        if (viewOutlineProvider == null || ((frameLayout = this.LJIL) != null && !frameLayout.getClipToOutline())) {
            FrameLayout frameLayout4 = this.LJIL;
            if (frameLayout4 != null) {
                frameLayout4.setOutlineProvider(this.LJJJJL);
            }
            FrameLayout frameLayout5 = this.LJIL;
            if (frameLayout5 != null) {
                frameLayout5.setClipToOutline(true);
            }
        }
        float f2 = (f * this.LJIIIZ) / this.LJ;
        C42508GmG c42508GmG = this.LJJJJL;
        if (c42508GmG != null) {
            c42508GmG.LIZ = Float.valueOf(f2);
        }
        FrameLayout frameLayout6 = this.LJIL;
        if (frameLayout6 != null) {
            frameLayout6.invalidateOutline();
        }
    }

    public final void LJFF(Aweme aweme, String str) {
        String str2;
        boolean z;
        this.LJJIL = aweme;
        if (str == null) {
            str = "";
        }
        this.LJJIZ = str;
        this.LJJIJLIJ = false;
        C61798ONe LIZ = C55016LiW.LIZ();
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (LIZ.LIZJ(OBQ.BACKGROUND.getType(), str2) && C79081V1x.LJIJJ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ.LJII(aweme, "[bindData] video is scaling");
        this.LJIIJJI = z;
        this.LJJJJ = false;
    }

    public final void LJIIJ(InterfaceC2309294m interfaceC2309294m, boolean z) {
        View view;
        View view2;
        View view3;
        if (interfaceC2309294m == null || interfaceC2309294m.LIZ() == null) {
            return;
        }
        if (interfaceC2309294m.getScene() != AnonymousClass999.ACE_SURVEY && interfaceC2309294m.getScene() != AnonymousClass999.AD_SURVEY) {
            return;
        }
        View view4 = null;
        if (this.LJJIJIIJI == null) {
            View rootView = interfaceC2309294m.getRootView();
            if (rootView != null) {
                view3 = rootView.findViewById(R.id.spark_ad_sticker_view);
            } else {
                view3 = null;
            }
            this.LJJIJIIJI = view3;
        }
        if (this.LJJIJIIJIL == null) {
            View rootView2 = interfaceC2309294m.getRootView();
            if (rootView2 != null) {
                view2 = rootView2.findViewById(R.id.d6j);
            } else {
                view2 = null;
            }
            this.LJJIJIIJIL = view2;
        }
        if (this.LJJIJIL == null) {
            View rootView3 = interfaceC2309294m.getRootView();
            if (rootView3 != null) {
                view4 = rootView3.findViewById(R.id.ad_feed_card_container);
            }
            this.LJJIJIL = view4;
        }
        if (z) {
            View view5 = this.LJJIJIIJI;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = this.LJJIJIIJIL;
            if (view6 == null) {
                return;
            }
            view6.setVisibility(8);
            return;
        }
        View view7 = this.LJJIJIIJI;
        if (view7 != null) {
            view7.setVisibility(0);
        }
        View view8 = this.LJJIJIIJIL;
        if (view8 != null) {
            view8.setVisibility(0);
        }
        View view9 = this.LJJIJIL;
        if (view9 == null || view9.getVisibility() != 0 || (view = this.LJJIFFI) == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final void LJIJ(View view, float f) {
        float f2;
        float f3;
        if (view != null) {
            if (this.LJJJJ) {
                f2 = this.LIZIZ + this.LJIIJ;
                f3 = this.LIZJ;
            } else {
                f2 = this.LIZIZ;
                f3 = this.LIZJ;
            }
            view.setTranslationY((-(f2 + f3)) * f);
            float f4 = 1 - f;
            view.setScaleX((this.LJ * f) + f4);
            view.setScaleY((this.LJ * f) + f4);
        }
    }

    public final void LJIILJJIL(float f, float f2, boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(new SJK());
        ofFloat.setDuration(Math.max(Math.abs(f2 - f) * LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 350L));
        ofFloat.addUpdateListener(new AUListenerS98S0100000_10(this, 6));
        if (z) {
            ofFloat.addListener((OO4) this.LJIIL.getValue());
        } else {
            ofFloat.addListener((OO4) this.LJIILIIL.getValue());
        }
        ofFloat.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(android.content.Context r6, X.C90T r7, X.OO7 r8, android.widget.FrameLayout r9, com.bytedance.lighten.loader.SmartImageView r10, android.view.View r11, android.view.View r12, android.view.View r13, android.view.View r14, android.view.View r15, android.view.View r16, android.view.View r17, X.InterfaceC2309294m r18) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OO3.LJII(android.content.Context, X.90T, X.OO7, android.widget.FrameLayout, com.bytedance.lighten.loader.SmartImageView, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, X.94m):void");
    }
}
