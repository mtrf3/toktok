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
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import o3.h0;

/* renamed from: X.Vw2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81334Vw2 extends ViewGroup implements InterfaceC16670l5, InterfaceC16600ky, InterfaceC54976Lhs {
    public static final String LLIILZL = C16880lQ.LJLLJ(C81334Vw2.class);
    public static final int[] LLIIZ;
    public View LJLIL;
    public InterfaceC54978Lhu LJLILLLLZI;
    public boolean LJLJI;
    public final int LJLJJI;
    public float LJLJJL;
    public boolean LJLJJLL;
    public float LJLJL;
    public final C16690l7 LJLJLJ;
    public final C16610kz LJLJLLL;
    public final int[] LJLL;
    public final int[] LJLLI;
    public boolean LJLLILLLL;
    public final int LJLLJ;
    public int LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public boolean LJZI;
    public final DecelerateInterpolator LJZL;
    public C80462Vhy LL;
    public int LLD;
    public int LLF;
    public float LLFF;
    public int LLFFF;
    public int LLFII;
    public C81359VwR LLFZ;
    public C81345VwD LLI;
    public C81346VwE LLIFFJFJJ;
    public C81339Vw7 LLII;
    public C81339Vw7 LLIIII;
    public C81341Vw9 LLIIIILZ;
    public boolean LLIIIJ;
    public int LLIIIL;
    public boolean LLIIIZ;
    public final IDAListenerS238S0100000_14 LLIIJI;
    public final C81336Vw4 LLIIJLIL;
    public final C81344VwC LLIIL;
    public final C81351VwJ LLIILII;

    public void setOnChildScrollUpCallback(InterfaceC81354VwM interfaceC81354VwM) {
    }

    public void setOnSwipeChangeListener(InterfaceC81355VwN interfaceC81355VwN) {
    }

    static {
        C16880lQ.LJLLJ(C81334Vw2.class);
        LLIIZ = new int[]{R.attr.enabled};
    }

    private void LIZ() {
        if (this.LJLIL == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.LL)) {
                    this.LJLIL = childAt;
                    return;
                }
            }
        }
    }

    public final void LJ() {
        this.LLIILII.LIZIZ(true);
        this.LL.clearAnimation();
        this.LLFZ.stop();
        this.LL.setVisibility(8);
        setColorViewAlpha(255);
        if (this.LJZI) {
            setAnimationProgress(0.0f);
        } else {
            LJI(this.LLFFF - this.LJLLL);
        }
        this.LJLLL = this.LL.getTop();
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LJLJLJ;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LJLJLLL.LJIIIZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LJLJLLL.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.LJLJLLL.LJIIL(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJ();
    }

    @Override // X.InterfaceC54976Lhs
    public final boolean O6() {
        return this.LJLJI;
    }

    public int getProgressCircleDiameter() {
        return this.LLIIIL;
    }

    public int getProgressViewEndOffset() {
        return this.LLFII;
    }

    public int getProgressViewStartOffset() {
        return this.LLFFF;
    }

    private void LIZIZ(float f) {
        IDAListenerS238S0100000_14 iDAListenerS238S0100000_14;
        if (f > this.LJLJJL) {
            LJFF(true, true);
            return;
        }
        this.LJLJI = false;
        C81359VwR c81359VwR = this.LLFZ;
        C81361VwT c81361VwT = c81359VwR.LJLILLLLZI;
        c81361VwT.LJ = 0.0f;
        c81361VwT.LIZ();
        C81361VwT c81361VwT2 = c81359VwR.LJLILLLLZI;
        c81361VwT2.LJFF = 0.0f;
        c81361VwT2.LIZ();
        if (!this.LJZI) {
            iDAListenerS238S0100000_14 = new IDAListenerS238S0100000_14(this, 1);
        } else {
            iDAListenerS238S0100000_14 = null;
        }
        int i = this.LJLLL;
        C81351VwJ c81351VwJ = this.LLIILII;
        c81351VwJ.getClass();
        IDAListenerS146S0200000_14 iDAListenerS146S0200000_14 = new IDAListenerS146S0200000_14(c81351VwJ, iDAListenerS238S0100000_14, 1);
        this.LLIILII.LIZIZ(false);
        if (this.LJZI) {
            this.LLF = i;
            this.LLFF = this.LL.getScaleX();
            C81341Vw9 c81341Vw9 = new C81341Vw9(this);
            this.LLIIIILZ = c81341Vw9;
            c81341Vw9.setDuration(150L);
            C80462Vhy c80462Vhy = this.LL;
            c80462Vhy.LJLIL = iDAListenerS146S0200000_14;
            c80462Vhy.clearAnimation();
            this.LL.startAnimation(this.LLIIIILZ);
        } else {
            this.LLF = i;
            this.LLIIL.reset();
            this.LLIIL.setDuration(200L);
            this.LLIIL.setInterpolator(this.LJZL);
            C80462Vhy c80462Vhy2 = this.LL;
            c80462Vhy2.LJLIL = iDAListenerS146S0200000_14;
            c80462Vhy2.clearAnimation();
            this.LL.startAnimation(this.LLIIL);
        }
        C81361VwT c81361VwT3 = this.LLFZ.LJLILLLLZI;
        if (!c81361VwT3.LJIILJJIL) {
            return;
        }
        c81361VwT3.LJIILJJIL = false;
        c81361VwT3.LIZ();
    }

    private void LIZJ(float f) {
        int i;
        C81339Vw7 c81339Vw7;
        C81339Vw7 c81339Vw72;
        C81361VwT c81361VwT = this.LLFZ.LJLILLLLZI;
        if (!c81361VwT.LJIILJJIL) {
            c81361VwT.LJIILJJIL = true;
            c81361VwT.LIZ();
        }
        float min = Math.min(1.0f, Math.abs(f / this.LJLJJL));
        float max = (((float) Math.max(min - 0.4d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.LJLJJL;
        if (this.LLIIIZ) {
            i = this.LLFII - this.LLFFF;
        } else {
            i = this.LLFII;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.LLFFF + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.LL.getVisibility() != 0) {
            this.LL.setVisibility(0);
        }
        if (!this.LJZI) {
            this.LL.setScaleX(1.0f);
            this.LL.setScaleY(1.0f);
        }
        if (this.LJZI) {
            setAnimationProgress(Math.min(1.0f, f / this.LJLJJL));
        }
        if (f < this.LJLJJL) {
            if (this.LLFZ.LJLILLLLZI.LJIJJ > 76 && ((c81339Vw72 = this.LLII) == null || !c81339Vw72.hasStarted() || c81339Vw72.hasEnded())) {
                C81339Vw7 c81339Vw73 = new C81339Vw7(this, this.LLFZ.LJLILLLLZI.LJIJJ, 76);
                c81339Vw73.setDuration(300L);
                C80462Vhy c80462Vhy = this.LL;
                c80462Vhy.LJLIL = null;
                c80462Vhy.clearAnimation();
                this.LL.startAnimation(c81339Vw73);
                this.LLII = c81339Vw73;
            }
        } else if (this.LLFZ.LJLILLLLZI.LJIJJ < 255 && ((c81339Vw7 = this.LLIIII) == null || !c81339Vw7.hasStarted() || c81339Vw7.hasEnded())) {
            C81339Vw7 c81339Vw74 = new C81339Vw7(this, this.LLFZ.LJLILLLLZI.LJIJJ, 255);
            c81339Vw74.setDuration(300L);
            C80462Vhy c80462Vhy2 = this.LL;
            c80462Vhy2.LJLIL = null;
            c80462Vhy2.clearAnimation();
            this.LL.startAnimation(c81339Vw74);
            this.LLIIII = c81339Vw74;
        }
        C81359VwR c81359VwR = this.LLFZ;
        float min2 = Math.min(0.8f, max * 0.8f);
        C81361VwT c81361VwT2 = c81359VwR.LJLILLLLZI;
        c81361VwT2.LJ = 0.0f;
        c81361VwT2.LIZ();
        C81361VwT c81361VwT3 = c81359VwR.LJLILLLLZI;
        c81361VwT3.LJFF = min2;
        c81361VwT3.LIZ();
        C81359VwR c81359VwR2 = this.LLFZ;
        float min3 = Math.min(1.0f, max);
        C81361VwT c81361VwT4 = c81359VwR2.LJLILLLLZI;
        if (min3 != c81361VwT4.LJIILLIIL) {
            c81361VwT4.LJIILLIIL = min3;
            c81361VwT4.LIZ();
        }
        float LIZ = C1I1.LIZ(pow, 2.0f, (max * 0.4f) - 0.25f, 0.5f);
        C81361VwT c81361VwT5 = this.LLFZ.LJLILLLLZI;
        c81361VwT5.LJI = LIZ;
        c81361VwT5.LIZ();
        LJI(i2 - this.LJLLL);
        this.LLIILII.LIZIZ(false);
    }

    private void LJII(float f) {
        float f2 = this.LJLLLLLL;
        float f3 = f - f2;
        int i = this.LJLJJI;
        if (f3 > i && !this.LJLZ) {
            this.LJLLLL = f2 + i;
            this.LJLZ = true;
            this.LLFZ.LJLILLLLZI.LJIJJ = 76;
        }
    }

    private void setColorViewAlpha(int i) {
        this.LL.getBackground().setAlpha(i);
        this.LLFZ.LJLILLLLZI.LJIJJ = i;
    }

    public final void LIZLLL(float f) {
        LJI((this.LLF + ((int) ((this.LLFFF - r1) * f))) - this.LL.getTop());
    }

    public final void LJI(int i) {
        this.LL.bringToFront();
        h0.LJIIL(i, this.LL);
        this.LJLLL = this.LL.getTop();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        LIZ();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || this.LJLIL.canScrollVertically(-1) || this.LJLJI || this.LJLLILLLL) {
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
                    LJII(motionEvent.getY(findPointerIndex));
                }
            }
            this.LJLZ = false;
            this.LJZ = -1;
        } else {
            LJI(this.LLFFF - this.LL.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.LJZ = pointerId;
            this.LJLZ = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.LJLLLLLL = motionEvent.getY(findPointerIndex2);
        }
        return this.LJLZ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.LJLJLJ.LIZIZ(0);
        this.LJLLILLLL = false;
        float f = this.LJLJL;
        if (f > 0.0f) {
            LIZIZ(f);
            this.LJLJL = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || this.LJLIL.canScrollVertically(-1) || this.LJLJI || this.LJLLILLLL) {
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
                    LJII(y);
                    if (this.LJLZ) {
                        float f = (y - this.LJLLLL) * 0.5f;
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
                float y2 = (motionEvent.getY(findPointerIndex2) - this.LJLLLL) * 0.5f;
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

    public void setAnimationProgress(float f) {
        this.LL.setScaleX(f);
        this.LL.setScaleY(f);
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        LIZ();
        C81359VwR c81359VwR = this.LLFZ;
        C81361VwT c81361VwT = c81359VwR.LJLILLLLZI;
        c81361VwT.LJIIIZ = iArr;
        c81361VwT.LIZIZ(0);
        c81359VwR.LJLILLLLZI.LIZIZ(0);
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
        this.LJLJJL = i;
    }

    public void setDoNotCatchException(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            LJ();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LJLJLLL.LJIIJ(z);
    }

    @Override // X.InterfaceC54976Lhs
    public void setOnRefreshListener(InterfaceC54978Lhu interfaceC54978Lhu) {
        this.LJLILLLLZI = interfaceC54978Lhu;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.LL.setBackgroundColor(i);
        this.LLFZ.LJLILLLLZI.LJIL = i;
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C04330Ez.LIZIZ(getContext(), i));
    }

    @Override // X.InterfaceC54976Lhs
    public void setRefreshing(boolean z) {
        int i;
        if (z && this.LJLJI != z) {
            this.LJLJI = z;
            if (!this.LLIIIZ) {
                i = this.LLFII + this.LLFFF;
            } else {
                i = this.LLFII;
            }
            LJI(i - this.LJLLL);
            this.LLIIIJ = false;
            IDAListenerS238S0100000_14 iDAListenerS238S0100000_14 = this.LLIIJI;
            this.LL.setVisibility(0);
            this.LLFZ.LJLILLLLZI.LJIJJ = 255;
            C81345VwD c81345VwD = new C81345VwD(this);
            this.LLI = c81345VwD;
            c81345VwD.setDuration(this.LJLLJ);
            if (iDAListenerS238S0100000_14 != null) {
                this.LL.LJLIL = iDAListenerS238S0100000_14;
            }
            this.LL.clearAnimation();
            this.LL.startAnimation(this.LLI);
            return;
        }
        LJFF(z, false);
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
        this.LL.setImageDrawable(null);
        this.LLFZ.LIZJ(i);
        this.LL.setImageDrawable(this.LLFZ);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LJLJLLL.LJIIJJI(i, 0);
    }

    public C81334Vw2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = -1.0f;
        this.LJLL = new int[2];
        this.LJLLI = new int[2];
        this.LJZ = -1;
        this.LLD = -1;
        this.LLIIJI = new IDAListenerS238S0100000_14(this, 0);
        this.LLIIJLIL = new C81336Vw4(this);
        this.LLIIL = new C81344VwC(this);
        this.LLIILII = new C81351VwJ();
        this.LJLJJI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLLJ = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.LJZL = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.LLIIIL = (int) (displayMetrics.density * 40.0f);
        this.LL = new C80462Vhy(getContext());
        C81359VwR c81359VwR = new C81359VwR(getContext(), this);
        this.LLFZ = c81359VwR;
        c81359VwR.LJLILLLLZI.LJIL = -328966;
        this.LL.setImageDrawable(c81359VwR);
        this.LL.setVisibility(8);
        addView(this.LL);
        h0.LJJI(this);
        int i = (int) (displayMetrics.density * 64.0f);
        this.LLFII = i;
        this.LJLJJL = i;
        this.LJLJLJ = new C16690l7();
        this.LJLJLLL = new C16610kz(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.LLIIIL;
        this.LJLLL = i2;
        this.LLFFF = i2;
        LIZLLL(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LLIIZ);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void LJFF(boolean z, boolean z2) {
        this.LLIILII.getClass();
        if (this.LJLJI != z) {
            this.LLIIIJ = z2;
            LIZ();
            this.LJLJI = z;
            if (z) {
                int i = this.LJLLL;
                IDAListenerS238S0100000_14 iDAListenerS238S0100000_14 = this.LLIIJI;
                this.LLIILII.LIZIZ(false);
                this.LLF = i;
                this.LLIIJLIL.reset();
                this.LLIIJLIL.setDuration(200L);
                this.LLIIJLIL.setInterpolator(this.LJZL);
                if (iDAListenerS238S0100000_14 != null) {
                    this.LL.LJLIL = iDAListenerS238S0100000_14;
                }
                this.LL.clearAnimation();
                this.LL.startAnimation(this.LLIIJLIL);
                return;
            }
            IDAListenerS238S0100000_14 iDAListenerS238S0100000_142 = this.LLIIJI;
            C81346VwE c81346VwE = new C81346VwE(this);
            this.LLIFFJFJJ = c81346VwE;
            c81346VwE.setDuration(150L);
            C80462Vhy c80462Vhy = this.LL;
            c80462Vhy.LJLIL = iDAListenerS238S0100000_142;
            c80462Vhy.clearAnimation();
            this.LL.startAnimation(this.LLIFFJFJJ);
        }
    }

    @Override // X.InterfaceC54976Lhs
    public final void P6(int i, int i2) {
        this.LJZI = false;
        this.LLFFF = i;
        this.LLFII = i2;
        this.LLIIIZ = true;
        LJ();
        this.LJLJI = false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLJLLL.LIZIZ(f, f2);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.LLD;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            return i2 + 1;
        }
        return i2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LJLIL == null) {
            LIZ();
        }
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } catch (IllegalStateException e) {
            C36922EeM.LIZ(e);
            PEH.LIZLLL(e, LLIILZL);
            if (this.LJLJJLL) {
                throw e;
            }
        }
        this.LL.measure(View.MeasureSpec.makeMeasureSpec(this.LLIIIL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLIIIL, 1073741824));
        this.LLD = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.LL) {
                this.LLD = i3;
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLJLLL.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.LJLJLJ.LIZ(i, 0);
        startNestedScroll(i & 2);
        this.LJLJL = 0.0f;
        this.LJLLILLLL = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.LJLJI && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.LJLJLLL.LIZLLL(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.LJLJL;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.LJLJL = 0.0f;
                } else {
                    this.LJLJL = f - f2;
                    iArr[1] = i2;
                }
                LIZJ(this.LJLJL);
            }
        }
        if (this.LLIIIZ && i2 > 0 && this.LJLJL == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.LL.setVisibility(8);
        }
        int[] iArr2 = this.LJLL;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LJLJLLL.LJFF(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.LJLIL == null) {
            LIZ();
        }
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        try {
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            PEH.LIZLLL(e, LLIILZL);
            if (this.LJLJJLL) {
                throw e;
            }
        }
        int measuredWidth2 = this.LL.getMeasuredWidth();
        int measuredHeight2 = this.LL.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.LJLLL;
        this.LL.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.LJLLI);
        if (i4 + this.LJLLI[1] < 0 && !this.LJLIL.canScrollVertically(-1)) {
            float abs = this.LJLJL + Math.abs(r6);
            this.LJLJL = abs;
            LIZJ(abs);
        }
    }
}
