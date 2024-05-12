package X;

import Y.IDCListenerS137S0100000_29;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.Zoh, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91071Zoh extends FrameLayout {
    public int LJLIL;
    public KUR LJLILLLLZI;
    public View LJLJI;
    public final int LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public InterfaceC55112Lk4 LJLJLLL;
    public int LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public ValueAnimator LJLLJ;
    public long LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public Drawable LJLZ;
    public boolean LJZ;

    public final void LIZ() {
        this.LJLLJ = ValueAnimator.ofFloat(0.0f, 1.0f);
        int viewPagerMarginTop = getViewPagerMarginTop();
        ValueAnimator valueAnimator = this.LJLLJ;
        if (valueAnimator != null) {
            valueAnimator.setDuration(200);
        }
        ValueAnimator valueAnimator2 = this.LJLLJ;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new DecelerateInterpolator());
        }
        ValueAnimator valueAnimator3 = this.LJLLJ;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new C91069Zof(this, viewPagerMarginTop));
        }
        ValueAnimator valueAnimator4 = this.LJLLJ;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new C91070Zog());
        }
        ValueAnimator valueAnimator5 = this.LJLLJ;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        KUR LIZIZ = LIZIZ(false);
        if (LIZIZ != null) {
            LIZIZ.setVisibility(8);
        }
    }

    public final void LIZJ() {
        KUR LIZIZ = LIZIZ(false);
        if (LIZIZ != null) {
            LIZIZ.LJI();
        }
        this.LJLL = -1;
        if (this.LJLJI != null) {
            LIZ();
        }
        if (this.LJLLL != -1 && !TextUtils.isEmpty(this.LJLLLL)) {
            this.LJLLL = -1L;
        }
    }

    public final void LIZLLL() {
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
        }
        if (getViewPagerMarginTop() != 0) {
            LIZ();
        }
    }

    public final int getViewPagerMarginTop() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.LJLJI;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return 0;
        }
        return marginLayoutParams.topMargin;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.LJLLLLLL = true;
        } catch (Exception e) {
            PEH.LIZLLL(e, "DspLoadMoreFrameLayout");
        }
    }

    public final boolean getFinishInflated() {
        return this.LJLLLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91071Zoh(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        new LinkedHashMap();
        this.LJLL = -1;
        this.LJLLL = -1L;
        this.LJLJJI = ViewConfiguration.get(activityC45651qj).getScaledTouchSlop();
        this.LJLLILLLL = (int) (getContext().getResources().getDisplayMetrics().density * 109);
        this.LJLLI = (int) (getContext().getResources().getDisplayMetrics().density * 218);
    }

    public final KUR LIZIZ(boolean z) {
        int i;
        KUR kur;
        boolean z2 = false;
        if (this.LJLILLLLZI == null && z && this.LJLLLLLL) {
            try {
                this.LJLILLLLZI = new KUR(getContext(), null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C17N.LJIILL(60.0d));
                layoutParams.gravity = 80;
                if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(getContext()) && C61447O9r.LJIILJJIL == 0) {
                    i = BasePlayerFragment.LLFF;
                } else {
                    i = 0;
                }
                layoutParams.setMargins(0, 0, 0, i);
                addView(this.LJLILLLLZI, 0, layoutParams);
                KUY LIZ = KUY.LIZ(getContext());
                IDCListenerS137S0100000_29 iDCListenerS137S0100000_29 = new IDCListenerS137S0100000_29(this, 1);
                C50258Jny c50258Jny = new C50258Jny(LIZ.LIZ);
                c50258Jny.LIZ(R.string.hve);
                C50259Jnz c50259Jnz = c50258Jny.LIZ;
                C51612KNk c51612KNk = new C51612KNk(LIZ.LIZ);
                c51612KNk.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c51612KNk.setStatus(c50259Jnz);
                LIZ.LIZLLL = c51612KNk;
                C16880lQ.LJIIJ(iDCListenerS137S0100000_29, c51612KNk);
                KUR kur2 = this.LJLILLLLZI;
                if (kur2 != null) {
                    kur2.setBuilder(LIZ);
                }
                Drawable drawable = this.LJLZ;
                if (drawable != null && (kur = this.LJLILLLLZI) != null) {
                    kur.setBackgroundDrawable(drawable);
                }
            } catch (Exception e) {
                this.LJLILLLLZI = null;
                this.LJLZ = null;
                PEH.LIZLLL(e, "DspLoadMoreFrameLayout");
            }
        }
        KUR kur3 = this.LJLILLLLZI;
        if (kur3 != null) {
            if (kur3.LIZLLL()) {
                z2 = true;
            }
            if (z2) {
                this.LJLL = -1;
            }
        }
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (r1 != 3) goto L15;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            android.view.View r0 = r6.LJLJI
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r6.LJZ
            if (r0 != 0) goto Lf
        Le:
            return r2
        Lf:
            int r1 = r7.getAction()
            if (r1 == 0) goto L6e
            r4 = 1
            if (r1 == r4) goto L6b
            r0 = 2
            if (r1 == r0) goto L21
            r0 = 3
            if (r1 == r0) goto L6b
        L1e:
            boolean r0 = r6.LJLJJL
            return r0
        L21:
            float r5 = r7.getY()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "y: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "  mInitY: "
            r1.append(r0)
            float r0 = r6.LJLJL
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            float r3 = r6.LJLJL
            float r2 = r3 - r5
            int r1 = r6.LJLJJI
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4d
            boolean r0 = r6.LJLJJL
            if (r0 == 0) goto L61
        L4d:
            float r5 = r5 - r3
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1e
            boolean r0 = r6.LJLJJL
            if (r0 != 0) goto L1e
            android.view.View r0 = r6.LJLJI
            if (r0 == 0) goto L1e
            int r0 = r0.getTop()
            if (r0 >= 0) goto L1e
        L61:
            r6.LJLJJL = r4
            android.animation.ValueAnimator r0 = r6.LJLLJ
            if (r0 == 0) goto L1e
            r0.cancel()
            goto L1e
        L6b:
            r6.LJLJJL = r2
            goto L1e
        L6e:
            r6.LJLJJL = r2
            float r0 = r7.getY()
            r6.LJLJL = r0
            r6.LJLJLJ = r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91071Zoh.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r5 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
    
        r6 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0084, code lost:
    
        if (r5 < 0) goto L43;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91071Zoh.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBottomViewBackground(Drawable drawable) {
        KUR LIZIZ = LIZIZ(false);
        if (LIZIZ != null) {
            LIZIZ.setBackgroundDrawable(drawable);
        } else {
            this.LJLZ = drawable;
        }
    }

    public final void setCanLoadMore(boolean z) {
        this.LJZ = z;
    }

    public final void setFinishInflated(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setLabel(String str) {
        this.LJLLLL = str;
    }

    public final void setLoadMoreListener(InterfaceC55112Lk4 interfaceC55112Lk4) {
        this.LJLJLLL = interfaceC55112Lk4;
    }

    public final void setViewPagerMarginTopByDelta(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.LJLJI;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        int i2 = marginLayoutParams.topMargin + i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = -i2;
        View view2 = this.LJLJI;
        if (view2 == null) {
            return;
        }
        view2.setLayoutParams(marginLayoutParams);
    }
}
