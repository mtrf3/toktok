package X;

import Y.ACListenerS29S0100000_9;
import Y.AUListenerS71S0101000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.LkD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55121LkD extends FrameLayout {
    public KUR LJLIL;
    public C80794VnK LJLILLLLZI;
    public InterfaceC54976Lhs LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public InterfaceC55123LkF LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public ValueAnimator LJLLILLLL;
    public long LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public View LJLLLLLL;

    public final void LIZ() {
        this.LJLLILLLL = ValueAnimator.ofFloat(0.0f, 1.0f);
        int viewPagerMarginTop = getViewPagerMarginTop();
        int i = (viewPagerMarginTop * (-200)) / this.LJLL;
        if (i < 0) {
            i = 200;
        }
        ValueAnimator valueAnimator = this.LJLLILLLL;
        if (valueAnimator != null) {
            valueAnimator.setDuration(i);
        }
        ValueAnimator valueAnimator2 = this.LJLLILLLL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS71S0101000_9(this, viewPagerMarginTop, 2));
        }
        ValueAnimator valueAnimator3 = this.LJLLILLLL;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new IDAListenerS77S0100000_9(this, 3));
        }
        ValueAnimator valueAnimator4 = this.LJLLILLLL;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
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
        this.LJLJLLL = -1;
        if (this.LJLILLLLZI != null) {
            LIZ();
        }
        if (this.LJLLJ != -1 && !TextUtils.isEmpty(this.LJLLL)) {
            this.LJLLJ = -1L;
        }
    }

    public final int getViewPagerMarginTop() {
        C80794VnK c80794VnK = this.LJLILLLLZI;
        if (c80794VnK == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = c80794VnK.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.LJLLLL = true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final KUR LIZIZ(boolean z) {
        if (this.LJLIL == null && z && this.LJLLLL) {
            try {
                this.LJLIL = new KUR(getContext(), null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C17N.LJIILL(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C17N.LJIILL(49.0d));
                addView(this.LJLIL, 0, layoutParams);
                if (this.LJLLLLLL == null) {
                    View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dsp, C16880lQ.LLZIL(getContext()), null);
                    o.LJII(LLLZIIL, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) LLLZIIL;
                    textView.setGravity(17);
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    Integer LJI = C79045V0n.LJI(R.attr.dm, context);
                    o.LJI(LJI);
                    textView.setTextColor(LJI.intValue());
                    this.LJLLLLLL = textView;
                }
                KUR kur = this.LJLIL;
                o.LJI(kur);
                KUY LIZ = KUY.LIZ(getContext());
                ACListenerS29S0100000_9 aCListenerS29S0100000_9 = new ACListenerS29S0100000_9(this, 20);
                C50258Jny c50258Jny = new C50258Jny(LIZ.LIZ);
                c50258Jny.LIZ(R.string.hve);
                C50259Jnz c50259Jnz = c50258Jny.LIZ;
                C51612KNk c51612KNk = new C51612KNk(LIZ.LIZ);
                c51612KNk.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c51612KNk.setStatus(c50259Jnz);
                LIZ.LIZLLL = c51612KNk;
                C16880lQ.LJIIJ(aCListenerS29S0100000_9, c51612KNk);
                LIZ.LIZIZ(this.LJLLLLLL);
                kur.setBuilder(LIZ);
            } catch (Exception e) {
                this.LJLIL = null;
                C16880lQ.LLLLIIL(e);
            }
        }
        KUR kur2 = this.LJLIL;
        if (kur2 != null && kur2.LIZLLL()) {
            this.LJLJLLL = -1;
        }
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
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
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.VnK r0 = r6.LJLILLLLZI
            r2 = 0
            if (r0 == 0) goto L4c
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L4c
            X.VnK r0 = r6.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r0)
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            if (r0 == 0) goto L4c
            X.VnK r0 = r6.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r0)
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r1 = r0.getCount()
            r5 = 1
            int r1 = r1 - r5
            X.VnK r0 = r6.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.getCurrentItem()
            if (r1 != r0) goto L4c
            X.VnK r0 = r6.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LLILZLL
            if (r0 != 0) goto L4c
            X.Lhs r0 = r6.LJLJI
            if (r0 == 0) goto L4d
            boolean r0 = r0.O6()
            if (r0 == 0) goto L4d
        L4c:
            return r2
        L4d:
            int r1 = r7.getAction()
            if (r1 == 0) goto L9c
            if (r1 == r5) goto L99
            r0 = 2
            if (r1 == r0) goto L5e
            r0 = 3
            if (r1 == r0) goto L99
        L5b:
            boolean r0 = r6.LJLJJL
            return r0
        L5e:
            float r4 = r7.getY()
            float r3 = r6.LJLJJLL
            float r2 = r3 - r4
            int r0 = r6.LJLJJI
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7b
            boolean r0 = r6.LJLJJL
            if (r0 != 0) goto L7b
            r6.LJLJJL = r5
            android.animation.ValueAnimator r0 = r6.LJLLILLLL
            if (r0 == 0) goto L5b
            r0.cancel()
            goto L5b
        L7b:
            float r4 = r4 - r3
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5b
            boolean r0 = r6.LJLJJL
            if (r0 != 0) goto L5b
            X.VnK r0 = r6.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.getTop()
            if (r0 >= 0) goto L5b
            r6.LJLJJL = r5
            android.animation.ValueAnimator r0 = r6.LJLLILLLL
            if (r0 == 0) goto L5b
            r0.cancel()
            goto L5b
        L99:
            r6.LJLJJL = r2
            goto L5b
        L9c:
            r6.LJLJJL = r2
            float r0 = r7.getY()
            r6.LJLJJLL = r0
            r6.LJLJL = r0
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55121LkD.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        C80794VnK c80794VnK;
        InterfaceC54976Lhs interfaceC54976Lhs;
        int i;
        o.LJIIIZ(event, "event");
        KUR LIZIZ = LIZIZ(true);
        if (LIZIZ != null && (c80794VnK = this.LJLILLLLZI) != null && c80794VnK.getAdapter() != null) {
            C80794VnK c80794VnK2 = this.LJLILLLLZI;
            o.LJI(c80794VnK2);
            if (c80794VnK2.getAdapter().getCount() != 0) {
                C80794VnK c80794VnK3 = this.LJLILLLLZI;
                o.LJI(c80794VnK3);
                int count = c80794VnK3.getAdapter().getCount() - 1;
                C80794VnK c80794VnK4 = this.LJLILLLLZI;
                o.LJI(c80794VnK4);
                if (count == c80794VnK4.getCurrentItem()) {
                    C80794VnK c80794VnK5 = this.LJLILLLLZI;
                    o.LJI(c80794VnK5);
                    if (!c80794VnK5.LLILZLL && ((interfaceC54976Lhs = this.LJLJI) == null || !interfaceC54976Lhs.O6())) {
                        int action = event.getAction();
                        if (action != 0) {
                            if (action != 1) {
                                if (action != 2) {
                                    if (action == 3 && this.LJLJJL) {
                                        LIZ();
                                        this.LJLJJL = false;
                                    }
                                } else if (this.LJLJJL) {
                                    float y = event.getY();
                                    int i2 = (int) ((y - this.LJLJL) / 1.0f);
                                    this.LJLJL = y;
                                    int viewPagerMarginTop = getViewPagerMarginTop();
                                    int i3 = viewPagerMarginTop + i2;
                                    if (i3 > 0) {
                                        i2 = -viewPagerMarginTop;
                                    }
                                    if (i3 >= (-this.LJLL)) {
                                        setViewPagerMarginTopByDelta(i2);
                                        if (LIZIZ.LIZLLL()) {
                                            LIZIZ.LJIIIZ();
                                        } else {
                                            KUR LIZIZ2 = LIZIZ(true);
                                            if (LIZIZ2 != null) {
                                                LIZIZ2.setVisibility(0);
                                            }
                                            Context context = getContext();
                                            o.LJIIIIZZ(context, "context");
                                            Integer LJI = C79045V0n.LJI(R.attr.d4, context);
                                            o.LJI(LJI);
                                            setBackgroundColor(LJI.intValue());
                                        }
                                    }
                                }
                            } else if (this.LJLJJL) {
                                if (getViewPagerMarginTop() > (-this.LJLLI) || (i = this.LJLJLLL) == 1 || i == 2) {
                                    LIZ();
                                } else {
                                    this.LJLLILLLL = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    int viewPagerMarginTop2 = getViewPagerMarginTop();
                                    int i4 = ((this.LJLLI + viewPagerMarginTop2) * (-200)) / this.LJLL;
                                    if (i4 < 0) {
                                        i4 = 200;
                                    }
                                    ValueAnimator valueAnimator = this.LJLLILLLL;
                                    if (valueAnimator != null) {
                                        valueAnimator.setDuration(i4);
                                    }
                                    ValueAnimator valueAnimator2 = this.LJLLILLLL;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.addUpdateListener(new AUListenerS71S0101000_9(this, viewPagerMarginTop2, 5));
                                    }
                                    ValueAnimator valueAnimator3 = this.LJLLILLLL;
                                    if (valueAnimator3 != null) {
                                        valueAnimator3.addListener(new IDAListenerS77S0100000_9(this, 18));
                                    }
                                    ValueAnimator valueAnimator4 = this.LJLLILLLL;
                                    if (valueAnimator4 != null) {
                                        valueAnimator4.start();
                                    }
                                }
                                this.LJLJJL = false;
                            }
                        } else {
                            this.LJLJJL = false;
                        }
                        return super.onTouchEvent(event);
                    }
                }
            }
        }
        return false;
    }

    public final void setLabel(String str) {
        this.LJLLL = str;
    }

    public final void setLoadMoreEmptyView(View view) {
        this.LJLLLLLL = view;
        this.LJLIL = null;
    }

    public final void setLoadMoreListener(InterfaceC55123LkF interfaceC55123LkF) {
        this.LJLJLJ = interfaceC55123LkF;
    }

    public final void setViewPagerMarginTopByDelta(int i) {
        C80794VnK c80794VnK = this.LJLILLLLZI;
        if (c80794VnK == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c80794VnK.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = marginLayoutParams.topMargin + i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = -i2;
        C80794VnK c80794VnK2 = this.LJLILLLLZI;
        o.LJI(c80794VnK2);
        c80794VnK2.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55121LkD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJLLL = -1;
        this.LJLLJ = -1L;
        this.LJLJJI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLLI = (int) (getContext().getResources().getDisplayMetrics().density * 109);
        this.LJLL = (int) (getContext().getResources().getDisplayMetrics().density * 218);
    }
}
