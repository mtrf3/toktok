package X;

import Y.ACListenerS27S0100000_7;
import Y.AUListenerS70S0101000_8;
import Y.IDAListenerS75S0100000_7;
import Y.IDAListenerS76S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public class KUP extends FrameLayout {
    public KUR LJLIL;
    public C80795VnL LJLILLLLZI;
    public InterfaceC54976Lhs LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public ValueAnimator LJLLI;
    public long LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public View LJLLLL;

    public final void LIZ() {
        this.LJLLI = ValueAnimator.ofFloat(0.0f, 1.0f);
        int viewPagerMarginTop = getViewPagerMarginTop();
        int i = (viewPagerMarginTop * (-200)) / this.LJLJLLL;
        if (i < 0) {
            i = 200;
        }
        this.LJLLI.setDuration(i);
        this.LJLLI.addUpdateListener(new AUListenerS70S0101000_8(this, viewPagerMarginTop, 1));
        this.LJLLI.addListener(new IDAListenerS75S0100000_7(this, 0));
        this.LJLLI.start();
        KUR LIZIZ = LIZIZ(false);
        if (LIZIZ != null) {
            LIZIZ.setVisibility(8);
        }
    }

    public void setLoadMoreListener(KUQ kuq) {
    }

    public int getViewPagerMarginTop() {
        C80795VnL c80795VnL = this.LJLILLLLZI;
        if (c80795VnL == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) c80795VnL.getLayoutParams()).topMargin;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.LJLLL = true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final KUR LIZIZ(boolean z) {
        if (this.LJLIL == null && z && this.LJLLL) {
            try {
                this.LJLIL = new KUR(getContext(), null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C17N.LJIILL(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C17N.LJIILL(49.0d));
                addView(this.LJLIL, 0, layoutParams);
                if (this.LJLLLL == null) {
                    TextView textView = (TextView) C16880lQ.LLLZIIL(R.layout.dsp, C16880lQ.LLZIL(getContext()), null);
                    textView.setGravity(17);
                    textView.setTextColor(getContext().getResources().getColor(R.color.bg));
                    this.LJLLLL = textView;
                }
                KUR kur = this.LJLIL;
                KUY LIZ = KUY.LIZ(getContext());
                ACListenerS27S0100000_7 aCListenerS27S0100000_7 = new ACListenerS27S0100000_7(this, 62);
                C50258Jny c50258Jny = new C50258Jny(LIZ.LIZ);
                c50258Jny.LIZ(R.string.hve);
                C50259Jnz c50259Jnz = c50258Jny.LIZ;
                C51612KNk c51612KNk = new C51612KNk(LIZ.LIZ);
                c51612KNk.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c51612KNk.setStatus(c50259Jnz);
                LIZ.LIZLLL = c51612KNk;
                C16880lQ.LJIIJ(aCListenerS27S0100000_7, c51612KNk);
                LIZ.LIZIZ(this.LJLLLL);
                kur.setBuilder(LIZ);
            } catch (Exception e) {
                this.LJLIL = null;
                C16880lQ.LLLLIIL(e);
            }
        }
        KUR kur2 = this.LJLIL;
        if (kur2 != null && kur2.LIZLLL()) {
            this.LJLJLJ = -1;
        }
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r1 != 3) goto L24;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.VnL r0 = r6.LJLILLLLZI
            r2 = 0
            if (r0 == 0) goto L3b
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L3b
            X.VnL r0 = r6.LJLILLLLZI
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            if (r0 == 0) goto L3b
            X.VnL r0 = r6.LJLILLLLZI
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r1 = r0.getCount()
            r5 = 1
            int r1 = r1 - r5
            X.VnL r0 = r6.LJLILLLLZI
            int r0 = r0.getCurrentItem()
            if (r1 != r0) goto L3b
            X.VnL r0 = r6.LJLILLLLZI
            boolean r0 = r0.LLILZLL
            if (r0 != 0) goto L3b
            X.Lhs r0 = r6.LJLJI
            if (r0 == 0) goto L3c
            boolean r0 = r0.O6()
            if (r0 == 0) goto L3c
        L3b:
            return r2
        L3c:
            int r1 = r7.getAction()
            if (r1 == 0) goto L88
            if (r1 == r5) goto L85
            r0 = 2
            if (r1 == r0) goto L4d
            r0 = 3
            if (r1 == r0) goto L85
        L4a:
            boolean r0 = r6.LJLJJL
            return r0
        L4d:
            float r4 = r7.getY()
            float r3 = r6.LJLJJLL
            float r2 = r3 - r4
            int r0 = r6.LJLJJI
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6a
            boolean r0 = r6.LJLJJL
            if (r0 != 0) goto L6a
            r6.LJLJJL = r5
            android.animation.ValueAnimator r0 = r6.LJLLI
            if (r0 == 0) goto L4a
            r0.cancel()
            goto L4a
        L6a:
            float r4 = r4 - r3
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4a
            boolean r0 = r6.LJLJJL
            if (r0 != 0) goto L4a
            X.VnL r0 = r6.LJLILLLLZI
            int r0 = r0.getTop()
            if (r0 >= 0) goto L4a
            r6.LJLJJL = r5
            android.animation.ValueAnimator r0 = r6.LJLLI
            if (r0 == 0) goto L4a
            r0.cancel()
            goto L4a
        L85:
            r6.LJLJJL = r2
            goto L4a
        L88:
            r6.LJLJJL = r2
            float r0 = r7.getY()
            r6.LJLJJLL = r0
            r6.LJLJL = r0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KUP.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C80795VnL c80795VnL;
        InterfaceC54976Lhs interfaceC54976Lhs;
        int i;
        KUR LIZIZ = LIZIZ(true);
        if (LIZIZ == null || (c80795VnL = this.LJLILLLLZI) == null || c80795VnL.getAdapter() == null || this.LJLILLLLZI.getAdapter().getCount() == 0 || this.LJLILLLLZI.getAdapter().getCount() - 1 != this.LJLILLLLZI.getCurrentItem() || this.LJLILLLLZI.LLILZLL || ((interfaceC54976Lhs = this.LJLJI) != null && interfaceC54976Lhs.O6())) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.LJLJJL) {
                        LIZ();
                        this.LJLJJL = false;
                    }
                } else if (this.LJLJJL) {
                    float y = motionEvent.getY();
                    int i2 = (int) ((y - this.LJLJL) / 1.0f);
                    this.LJLJL = y;
                    int viewPagerMarginTop = getViewPagerMarginTop();
                    int i3 = viewPagerMarginTop + i2;
                    if (i3 > 0) {
                        i2 = -viewPagerMarginTop;
                    }
                    if (i3 >= (-this.LJLJLLL)) {
                        setViewPagerMarginTopByDelta(i2);
                        if (LIZIZ.LIZLLL()) {
                            LIZIZ.LJIIIZ();
                        } else {
                            KUR LIZIZ2 = LIZIZ(true);
                            if (LIZIZ2 != null) {
                                LIZIZ2.setVisibility(0);
                            }
                            setBackgroundColor(getContext().getResources().getColor(R.color.b5));
                        }
                    }
                }
            } else if (this.LJLJJL) {
                if (getViewPagerMarginTop() > (-this.LJLL) || (i = this.LJLJLJ) == 1 || i == 2) {
                    LIZ();
                } else {
                    this.LJLLI = ValueAnimator.ofFloat(0.0f, 1.0f);
                    int viewPagerMarginTop2 = getViewPagerMarginTop();
                    int i4 = ((this.LJLL + viewPagerMarginTop2) * (-200)) / this.LJLJLLL;
                    if (i4 < 0) {
                        i4 = 200;
                    }
                    this.LJLLI.setDuration(i4);
                    this.LJLLI.addUpdateListener(new AUListenerS70S0101000_8(this, viewPagerMarginTop2, 2));
                    this.LJLLI.addListener(new IDAListenerS76S0100000_8(this, 1));
                    this.LJLLI.start();
                }
                this.LJLJJL = false;
            }
        } else {
            this.LJLJJL = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setLabel(String str) {
        this.LJLLJ = str;
    }

    public void setViewPagerMarginTopByDelta(int i) {
        C80795VnL c80795VnL = this.LJLILLLLZI;
        if (c80795VnL == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c80795VnL.getLayoutParams();
        int i2 = marginLayoutParams.topMargin + i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = -i2;
        this.LJLILLLLZI.setLayoutParams(marginLayoutParams);
    }

    public KUP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLJ = -1;
        this.LJLLILLLL = -1L;
        this.LJLJJI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLL = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.LJLJLLL = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
    }
}
