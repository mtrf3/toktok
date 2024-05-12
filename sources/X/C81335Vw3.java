package X;

import Y.IDAListenerS146S0200000_14;
import Y.IDAListenerS238S0100000_14;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import o3.h0;

/* renamed from: X.Vw3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81335Vw3 extends ViewGroup implements InterfaceC16670l5, InterfaceC16600ky, InterfaceC54976Lhs {
    public static final int[] LLIILZL;
    public final int LJLIL;
    public final Scroller LJLILLLLZI;
    public float LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public View LJLJJLL;
    public InterfaceC54978Lhu LJLJL;
    public boolean LJLJLJ;
    public InterfaceC81353VwL LJLJLLL;
    public float LJLL;
    public final int[] LJLLI;
    public final int[] LJLLILLLL;
    public boolean LJLLJ;
    public final C16690l7 LJLLL;
    public final C16610kz LJLLLL;
    public final int LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public float LJZI;
    public float LJZL;
    public boolean LL;
    public final DecelerateInterpolator LLD;
    public T4V LLF;
    public int LLFF;
    public C81343VwB LLFFF;
    public final int LLFII;
    public final int LLFZ;
    public C81340Vw8 LLI;
    public C81360VwS LLIFFJFJJ;
    public boolean LLII;
    public C81342VwA LLIIII;
    public int LLIIIILZ;
    public boolean LLIIIJ;
    public int LLIIIL;
    public C81340Vw8 LLIIIZ;
    public final IDAListenerS238S0100000_14 LLIIJI;
    public final C81337Vw5 LLIIJLIL;
    public final C81347VwF LLIIL;
    public final C81352VwK LLIILII;

    public void setAnimationProgress(float f) {
    }

    public void setColorScheme(int... iArr) {
    }

    public void setOnChildScrollUpCallback(InterfaceC81356VwO interfaceC81356VwO) {
    }

    public void setOnOverScrollListener(InterfaceC81357VwP interfaceC81357VwP) {
    }

    public void setOnSwipeChangeListener(InterfaceC81355VwN interfaceC81355VwN) {
    }

    static {
        C16880lQ.LJLLJ(C81335Vw3.class);
        LLIILZL = new int[]{R.attr.enabled};
    }

    public final void LIZ() {
        if (this.LJLJJLL == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.LLF)) {
                    this.LJLJJLL = childAt;
                    return;
                }
            }
        }
    }

    public final void LIZLLL() {
        this.LLIILII.LIZIZ(true);
        this.LLIFFJFJJ.stop();
        setColorViewAlpha(255);
        if (this.LL) {
            setAnimationProgress(0.0f);
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LJLILLLLZI.computeScrollOffset()) {
            scrollTo(this.LJLILLLLZI.getCurrX(), this.LJLILLLLZI.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LJLLL;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LJLLLL.LJIIIZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LJLLLL.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.LJLLLL.LJIIL(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZLLL();
    }

    @Override // X.InterfaceC54976Lhs
    public final boolean O6() {
        return this.LJLJJI;
    }

    public int getProgressCircleDiameter() {
        return this.LLIIIL;
    }

    public int getProgressViewEndOffset() {
        return this.LLIIIILZ;
    }

    public int getProgressViewStartOffset() {
        return this.LLFF;
    }

    private void setColorViewAlpha(int i) {
        this.LLIFFJFJJ.LJLILLLLZI.LJIJJ = i;
    }

    public final void LIZIZ(float f) {
        IDAListenerS238S0100000_14 iDAListenerS238S0100000_14;
        if (f > this.LJLJI) {
            LJ(true, true);
            return;
        }
        this.LJLJJI = false;
        C81360VwS c81360VwS = this.LLIFFJFJJ;
        C81362VwU c81362VwU = c81360VwS.LJLILLLLZI;
        c81362VwU.LJ = 0.0f;
        c81362VwU.LIZ();
        C81362VwU c81362VwU2 = c81360VwS.LJLILLLLZI;
        c81362VwU2.LJFF = 0.0f;
        c81362VwU2.LIZ();
        if (!this.LL) {
            iDAListenerS238S0100000_14 = new IDAListenerS238S0100000_14(this, 6);
        } else {
            iDAListenerS238S0100000_14 = null;
        }
        C81352VwK c81352VwK = this.LLIILII;
        c81352VwK.getClass();
        IDAListenerS146S0200000_14 iDAListenerS146S0200000_14 = new IDAListenerS146S0200000_14(c81352VwK, iDAListenerS238S0100000_14, 1);
        this.LLIILII.LIZIZ(false);
        if (this.LL) {
            C81342VwA c81342VwA = new C81342VwA(this);
            this.LLIIII = c81342VwA;
            c81342VwA.setDuration(150L);
            iDAListenerS146S0200000_14.onAnimationEnd(this.LLIIII);
        } else {
            this.LLIIL.reset();
            this.LLIIL.setDuration(200L);
            this.LLIIL.setInterpolator(this.LLD);
            iDAListenerS146S0200000_14.onAnimationEnd(this.LLIIJLIL);
        }
        C81362VwU c81362VwU3 = this.LLIFFJFJJ.LJLILLLLZI;
        if (c81362VwU3.LJIILJJIL) {
            c81362VwU3.LJIILJJIL = false;
            c81362VwU3.LIZ();
        }
        this.LJLILLLLZI.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
        invalidate();
        this.LLF.LIZJ();
    }

    public final void LIZJ(float f) {
        int i;
        C81340Vw8 c81340Vw8;
        C81340Vw8 c81340Vw82;
        C81362VwU c81362VwU = this.LLIFFJFJJ.LJLILLLLZI;
        if (!c81362VwU.LJIILJJIL) {
            c81362VwU.LJIILJJIL = true;
            c81362VwU.LIZ();
        }
        float f2 = f / this.LJLJI;
        float max = (((float) Math.max(Math.min(1.0f, Math.abs(f2)) - 0.4d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.LJLJI;
        if (this.LLII) {
            i = this.LLIIIILZ - this.LLFF;
        } else {
            i = this.LLIIIILZ;
        }
        float f3 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        if (this.LL) {
            setAnimationProgress(Math.min(1.0f, f / this.LJLJI));
        }
        if (f < this.LJLJI) {
            if (this.LLIFFJFJJ.LJLILLLLZI.LJIJJ > 76 && ((c81340Vw82 = this.LLIIIZ) == null || !c81340Vw82.hasStarted() || c81340Vw82.hasEnded())) {
                C81340Vw8 c81340Vw83 = new C81340Vw8(this, this.LLIFFJFJJ.LJLILLLLZI.LJIJJ, 76);
                c81340Vw83.setDuration(300L);
                this.LLIIIZ = c81340Vw83;
            }
        } else if (this.LLIFFJFJJ.LJLILLLLZI.LJIJJ < 255 && ((c81340Vw8 = this.LLI) == null || !c81340Vw8.hasStarted() || c81340Vw8.hasEnded())) {
            C81340Vw8 c81340Vw84 = new C81340Vw8(this, this.LLIFFJFJJ.LJLILLLLZI.LJIJJ, 255);
            c81340Vw84.setDuration(300L);
            this.LLI = c81340Vw84;
        }
        float atan = (float) Math.atan(f2);
        scrollTo(0, (int) ((-this.LJLJI) * atan));
        this.LLF.setProgress(Math.max(0.0f, Math.min(1.0f, atan - 0.5f)));
        C81360VwS c81360VwS = this.LLIFFJFJJ;
        float min = Math.min(0.8f, max * 0.8f);
        C81362VwU c81362VwU2 = c81360VwS.LJLILLLLZI;
        c81362VwU2.LJ = 0.0f;
        c81362VwU2.LIZ();
        C81362VwU c81362VwU3 = c81360VwS.LJLILLLLZI;
        c81362VwU3.LJFF = min;
        c81362VwU3.LIZ();
        C81360VwS c81360VwS2 = this.LLIFFJFJJ;
        float min2 = Math.min(1.0f, max);
        C81362VwU c81362VwU4 = c81360VwS2.LJLILLLLZI;
        if (min2 != c81362VwU4.LJIILLIIL) {
            c81362VwU4.LJIILLIIL = min2;
            c81362VwU4.LIZ();
        }
        float LIZ = C1I1.LIZ(pow, 2.0f, (max * 0.4f) - 0.25f, 0.5f);
        C81362VwU c81362VwU5 = this.LLIFFJFJJ.LJLILLLLZI;
        c81362VwU5.LJI = LIZ;
        c81362VwU5.LIZ();
        this.LLIILII.LIZIZ(false);
        InterfaceC81353VwL interfaceC81353VwL = this.LJLJLLL;
        if (interfaceC81353VwL != null && f > this.LJLJI && !this.LJLJLJ) {
            this.LJLJLJ = true;
            interfaceC81353VwL.l0();
        }
    }

    public final void LJFF(float f) {
        float f2 = this.LJZL;
        float f3 = f - f2;
        int i = this.LJLIL;
        if (f3 > i && !this.LJLZ) {
            this.LJZI = f2 + i;
            this.LJLZ = true;
            this.LLIFFJFJJ.LJLILLLLZI.LJIJJ = 76;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        LIZ();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || this.LJLJJLL.canScrollVertically(-1) || this.LJLJJI || this.LJLLJ) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.LJZ) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.LJZ = motionEvent.getPointerId(i);
                            }
                        }
                    }
                } else {
                    int i2 = this.LJZ;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    LJFF(motionEvent.getY(findPointerIndex));
                }
            }
            this.LJLZ = false;
            this.LJZ = -1;
        } else {
            int pointerId = motionEvent.getPointerId(0);
            this.LJZ = pointerId;
            this.LJLZ = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.LJZL = motionEvent.getY(findPointerIndex2);
        }
        return this.LJLZ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.LJLLL.LIZIZ(0);
        this.LJLLJ = false;
        float f = this.LJLL;
        if (f > 0.0f) {
            LIZIZ(f);
            this.LJLL = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || this.LJLJJLL.canScrollVertically(-1) || this.LJLJJI || this.LJLLJ) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.LJZ) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    this.LJZ = motionEvent.getPointerId(i);
                                }
                            }
                        } else {
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (actionIndex2 < 0) {
                                return false;
                            }
                            this.LJZ = motionEvent.getPointerId(actionIndex2);
                        }
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.LJZ);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    LJFF(y);
                    if (this.LJLZ) {
                        float f = (y - this.LJZI) * 0.5f;
                        if (f > 0.0f) {
                            LIZJ(f);
                        } else {
                            LIZJ(0.0f);
                            return false;
                        }
                    }
                }
            }
            int findPointerIndex2 = motionEvent.findPointerIndex(this.LJZ);
            if (findPointerIndex2 < 0) {
                return false;
            }
            if (this.LJLZ) {
                float y2 = (motionEvent.getY(findPointerIndex2) - this.LJZI) * 0.5f;
                this.LJLZ = false;
                LIZIZ(y2);
            }
            this.LJZ = -1;
            return false;
        }
        this.LJZ = motionEvent.getPointerId(0);
        this.LJLZ = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setColorSchemeColors(int... iArr) {
        LIZ();
        C81360VwS c81360VwS = this.LLIFFJFJJ;
        C81362VwU c81362VwU = c81360VwS.LJLILLLLZI;
        c81362VwU.LJIIIZ = iArr;
        c81362VwU.LIZIZ(0);
        c81360VwS.LJLILLLLZI.LIZIZ(0);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C04330Ez.LIZIZ(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.LJLJI = i;
    }

    public void setDoNotCatchException(boolean z) {
        this.LJLJJL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            LIZLLL();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LJLLLL.LJIIJ(z);
    }

    public void setOnPullAndRefreshListener(InterfaceC81353VwL interfaceC81353VwL) {
        this.LJLJLLL = interfaceC81353VwL;
    }

    @Override // X.InterfaceC54976Lhs
    public void setOnRefreshListener(InterfaceC54978Lhu interfaceC54978Lhu) {
        this.LJLJL = interfaceC54978Lhu;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.LLIFFJFJJ.LJLILLLLZI.LJIL = i;
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C04330Ez.LIZIZ(getContext(), i));
    }

    @Override // X.InterfaceC54976Lhs
    public void setRefreshing(boolean z) {
        if (z && this.LJLJJI != z) {
            this.LJLJJI = z;
            this.LLIIIJ = false;
            IDAListenerS238S0100000_14 iDAListenerS238S0100000_14 = this.LLIIJI;
            this.LLIFFJFJJ.LJLILLLLZI.LJIJJ = 255;
            C81343VwB c81343VwB = new C81343VwB(this);
            this.LLFFF = c81343VwB;
            c81343VwB.setDuration(this.LJLLLLLL);
            if (iDAListenerS238S0100000_14 != null) {
                iDAListenerS238S0100000_14.onAnimationEnd(this.LLFFF);
            }
            this.LLF.LIZIZ();
            LJI(this.LJLILLLLZI, getScrollY(), (int) (-this.LJLJI));
            return;
        }
        LJ(z, false);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.LLIIIL = (int) (displayMetrics.density * 56.0f);
        } else {
            this.LLIIIL = (int) (displayMetrics.density * 40.0f);
        }
        this.LLIFFJFJJ.LIZJ(i);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LJLLLL.LJIIJJI(i, 0);
    }

    public C81335Vw3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = -1.0f;
        this.LJLLI = new int[2];
        this.LJLLILLLL = new int[2];
        this.LJZ = -1;
        this.LLIIJI = new IDAListenerS238S0100000_14(this, 5);
        this.LLIIJLIL = new C81337Vw5(this);
        this.LLIIL = new C81347VwF(this);
        this.LLIILII = new C81352VwK();
        this.LJLIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLILLLLZI = new Scroller(context, new AccelerateDecelerateInterpolator());
        this.LJLLLLLL = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.LLD = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        this.LLIIIL = (int) (40.0f * f);
        this.LLFII = (int) (f * 56.0f);
        this.LLFZ = (int) (f * 32.0f);
        C81360VwS c81360VwS = new C81360VwS(getContext(), this);
        this.LLIFFJFJJ = c81360VwS;
        c81360VwS.LJLILLLLZI.LJIL = -328966;
        h0.LJJI(this);
        int i = (int) (displayMetrics.density * 56.0f);
        this.LLIIIILZ = i;
        this.LJLJI = i;
        this.LJLLL = new C16690l7();
        this.LJLLLL = new C16610kz(this);
        setNestedScrollingEnabled(true);
        this.LLFF = -this.LLIIIL;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LLIILZL);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        T4V t4v = new T4V(getContext(), null);
        this.LLF = t4v;
        addView(t4v);
    }

    public final void LJ(boolean z, boolean z2) {
        this.LLIILII.getClass();
        if (this.LJLJJI != z) {
            this.LLIIIJ = z2;
            LIZ();
            this.LJLJJI = z;
            if (z) {
                IDAListenerS238S0100000_14 iDAListenerS238S0100000_14 = this.LLIIJI;
                this.LLIILII.LIZIZ(false);
                this.LLIIJLIL.reset();
                this.LLIIJLIL.setDuration(200L);
                this.LLIIJLIL.setInterpolator(this.LLD);
                this.LLF.setCycleBias(1);
                this.LLF.LIZIZ();
                this.LJLILLLLZI.startScroll(0, getScrollY(), 0, (-getScrollY()) - this.LLFII, Math.abs(((-getScrollY()) - this.LLFII) * 2));
                invalidate();
                if (iDAListenerS238S0100000_14 != null) {
                    iDAListenerS238S0100000_14.onAnimationEnd(this.LLIIJLIL);
                    return;
                }
                return;
            }
            this.LJLILLLLZI.forceFinished(true);
            this.LJLILLLLZI.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
            invalidate();
            this.LLF.LIZJ();
        }
    }

    @Override // X.InterfaceC54976Lhs
    public final void P6(int i, int i2) {
        this.LLII = true;
        this.LLFF = i;
        this.LL = false;
        this.LLIIIILZ = i2;
        LIZLLL();
        this.LJLJJI = false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLLLL.LIZIZ(f, f2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LJLJJLL == null) {
            LIZ();
        }
        View view = this.LJLJJLL;
        if (view == null) {
            return;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } catch (IllegalStateException e) {
            C36922EeM.LIZ(e);
            PEH.LIZLLL(e, "DoubleBallSwipeRefreshLayout");
            if (this.LJLJJL) {
                throw e;
            }
        }
        this.LLF.measure(View.MeasureSpec.makeMeasureSpec(this.LLFZ, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLFZ, 1073741824));
    }

    public void LJI(Scroller scroller, int i, int i2) {
        scroller.startScroll(0, i, 0, i2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLLLL.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.LJLLL.LIZ(i, 0);
        startNestedScroll(i & 2);
        this.LJLL = 0.0f;
        this.LJLLJ = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.LJLJJI && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.LJLLLL.LIZLLL(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.LJLL;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.LJLL = 0.0f;
                } else {
                    this.LJLL = f - f2;
                    iArr[1] = i2;
                }
                LIZJ(this.LJLL);
            }
        }
        int[] iArr2 = this.LJLLI;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LJLLLL.LJFF(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.LJLJJLL == null) {
            LIZ();
        }
        View view = this.LJLJJLL;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        try {
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            PEH.LIZLLL(e, "DoubleBallSwipeRefreshLayout");
            if (this.LJLJJL) {
                throw e;
            }
        }
        int measuredWidth2 = this.LLF.getMeasuredWidth();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        this.LLF.layout(i5, -((this.LLFII + this.LLF.getMeasuredHeight()) / 2), measuredWidth2 + i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.LJLLILLLL);
        if (i4 + this.LJLLILLLL[1] < 0 && !this.LJLJJLL.canScrollVertically(-1)) {
            float abs = this.LJLL + Math.abs(r6);
            this.LJLL = abs;
            LIZJ(abs);
        }
    }
}
