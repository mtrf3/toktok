package androidx.swiperefreshlayout.widget;

import X.C03330Bd;
import X.C03340Be;
import X.C04330Ez;
import X.C07T;
import X.C16360ka;
import X.C16610kz;
import X.C16690l7;
import X.C16880lQ;
import X.C16N;
import X.C16O;
import X.C16P;
import X.C16Q;
import X.C16R;
import X.C16S;
import X.C16T;
import X.C1I1;
import X.InterfaceC03350Bf;
import X.InterfaceC03360Bg;
import X.InterfaceC16600ky;
import X.InterfaceC16670l5;
import Y.IDAListenerS228S0100000;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import o3.h0;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC16670l5, InterfaceC16600ky {
    public static final int[] LLIILII;
    public View LJLIL;
    public InterfaceC03360Bg LJLILLLLZI;
    public boolean LJLJI;
    public final int LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public final C16690l7 LJLJL;
    public final C16610kz LJLJLJ;
    public final int[] LJLJLLL;
    public final int[] LJLL;
    public boolean LJLLI;
    public final int LJLLILLLL;
    public int LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public final DecelerateInterpolator LJZI;
    public C16N LJZL;
    public int LL;
    public int LLD;
    public float LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public C16P LLFZ;
    public C16Q LLI;
    public C16R LLIFFJFJJ;
    public C16S LLII;
    public C16S LLIIII;
    public C16T LLIIIILZ;
    public boolean LLIIIJ;
    public int LLIIIL;
    public boolean LLIIIZ;
    public final IDAListenerS228S0100000 LLIIJI;
    public final C03330Bd LLIIJLIL;
    public final C03340Be LLIIL;

    public void setOnChildScrollUpCallback(InterfaceC03350Bf interfaceC03350Bf) {
    }

    static {
        C16880lQ.LJLLJ(SwipeRefreshLayout.class);
        LLIILII = new int[]{R.attr.enabled};
    }

    public final boolean LIZ() {
        View view = this.LJLIL;
        if (view instanceof ListView) {
            return C07T.LIZ((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public final void LIZIZ() {
        if (this.LJLIL == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.LJZL)) {
                    this.LJLIL = childAt;
                    return;
                }
            }
        }
    }

    public final void LJFF() {
        this.LJZL.clearAnimation();
        this.LLFZ.stop();
        this.LJZL.setVisibility(8);
        setColorViewAlpha(255);
        if (this.LJZ) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.LLFF - this.LJLLJ);
        }
        this.LJLLJ = this.LJZL.getTop();
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LJLJL;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LJLJLJ.LJIIIZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LJLJLJ.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.LJLJLJ.LJIIL(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJFF();
    }

    public int getProgressCircleDiameter() {
        return this.LLIIIL;
    }

    public int getProgressViewEndOffset() {
        return this.LLFFF;
    }

    public int getProgressViewStartOffset() {
        return this.LLFF;
    }

    private void setColorViewAlpha(int i) {
        this.LJZL.getBackground().setAlpha(i);
        this.LLFZ.setAlpha(i);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.16T, android.view.animation.Animation] */
    public final void LIZJ(float f) {
        IDAListenerS228S0100000 iDAListenerS228S0100000;
        if (f > this.LJLJJL) {
            LJI(true, true);
            return;
        }
        this.LJLJI = false;
        C16P c16p = this.LLFZ;
        C16O c16o = c16p.LJLIL;
        c16o.LJ = 0.0f;
        c16o.LJFF = 0.0f;
        c16p.invalidateSelf();
        boolean z = this.LJZ;
        if (!z) {
            iDAListenerS228S0100000 = new IDAListenerS228S0100000(this, 1);
        } else {
            iDAListenerS228S0100000 = null;
        }
        int i = this.LJLLJ;
        if (z) {
            this.LLD = i;
            this.LLF = this.LJZL.getScaleX();
            ?? r2 = new Animation() { // from class: X.16T
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f2, Transformation transformation) {
                    SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                    float f3 = swipeRefreshLayout.LLF;
                    swipeRefreshLayout.setAnimationProgress(((-f3) * f2) + f3);
                    SwipeRefreshLayout.this.LJ(f2);
                }
            };
            this.LLIIIILZ = r2;
            r2.setDuration(150L);
            if (iDAListenerS228S0100000 != null) {
                this.LJZL.LJLIL = iDAListenerS228S0100000;
            }
            this.LJZL.clearAnimation();
            this.LJZL.startAnimation(this.LLIIIILZ);
        } else {
            this.LLD = i;
            reset();
            setDuration(200L);
            setInterpolator(this.LJZI);
            if (iDAListenerS228S0100000 != null) {
                this.LJZL.LJLIL = iDAListenerS228S0100000;
            }
            this.LJZL.clearAnimation();
            this.LJZL.startAnimation(this.LLIIL);
        }
        C16P c16p2 = this.LLFZ;
        C16O c16o2 = c16p2.LJLIL;
        if (c16o2.LJIILIIL) {
            c16o2.LJIILIIL = false;
        }
        c16p2.invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.16S, android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.16S, android.view.animation.Animation] */
    public final void LIZLLL(float f) {
        C16S c16s;
        C16S c16s2;
        C16P c16p = this.LLFZ;
        C16O c16o = c16p.LJLIL;
        if (!c16o.LJIILIIL) {
            c16o.LJIILIIL = true;
        }
        c16p.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.LJLJJL));
        float max = (((float) Math.max(min - 0.4d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.LJLJJL;
        int i = this.LLFII;
        if (i <= 0) {
            if (this.LLIIIZ) {
                i = this.LLFFF - this.LLFF;
            } else {
                i = this.LLFFF;
            }
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.LLFF + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.LJZL.getVisibility() != 0) {
            this.LJZL.setVisibility(0);
        }
        if (!this.LJZ) {
            this.LJZL.setScaleX(1.0f);
            this.LJZL.setScaleY(1.0f);
        }
        if (this.LJZ) {
            setAnimationProgress(Math.min(1.0f, f / this.LJLJJL));
        }
        if (f < this.LJLJJL) {
            final int i3 = 76;
            if (this.LLFZ.LJLIL.LJIJI > 76 && ((c16s2 = this.LLII) == null || !c16s2.hasStarted() || c16s2.hasEnded())) {
                final int i4 = this.LLFZ.LJLIL.LJIJI;
                ?? r1 = new Animation() { // from class: X.16S
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f3, Transformation transformation) {
                        SwipeRefreshLayout.this.LLFZ.setAlpha((int) (((i3 - r2) * f3) + i4));
                    }
                };
                r1.setDuration(300L);
                C16N c16n = this.LJZL;
                c16n.LJLIL = null;
                c16n.clearAnimation();
                this.LJZL.startAnimation(r1);
                this.LLII = r1;
            }
        } else {
            final int i5 = 255;
            if (this.LLFZ.LJLIL.LJIJI < 255 && ((c16s = this.LLIIII) == null || !c16s.hasStarted() || c16s.hasEnded())) {
                final int i6 = this.LLFZ.LJLIL.LJIJI;
                ?? r12 = new Animation() { // from class: X.16S
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f3, Transformation transformation) {
                        SwipeRefreshLayout.this.LLFZ.setAlpha((int) (((i5 - r2) * f3) + i6));
                    }
                };
                r12.setDuration(300L);
                C16N c16n2 = this.LJZL;
                c16n2.LJLIL = null;
                c16n2.clearAnimation();
                this.LJZL.startAnimation(r12);
                this.LLIIII = r12;
            }
        }
        C16P c16p2 = this.LLFZ;
        float min2 = Math.min(0.8f, max * 0.8f);
        C16O c16o2 = c16p2.LJLIL;
        c16o2.LJ = 0.0f;
        c16o2.LJFF = min2;
        c16p2.invalidateSelf();
        C16P c16p3 = this.LLFZ;
        float min3 = Math.min(1.0f, max);
        C16O c16o3 = c16p3.LJLIL;
        if (min3 != c16o3.LJIILL) {
            c16o3.LJIILL = min3;
        }
        c16p3.invalidateSelf();
        float LIZ = C1I1.LIZ(pow, 2.0f, (max * 0.4f) - 0.25f, 0.5f);
        C16P c16p4 = this.LLFZ;
        c16p4.LJLIL.LJI = LIZ;
        c16p4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.LJLLJ);
    }

    public final void LJ(float f) {
        setTargetOffsetTopAndBottom((this.LLD + ((int) ((this.LLFF - r1) * f))) - this.LJZL.getTop());
    }

    public final void LJII(float f) {
        float f2 = this.LJLLLL;
        float f3 = f - f2;
        int i = this.LJLJJI;
        if (f3 > i && !this.LJLLLLLL) {
            this.LJLLL = f2 + i;
            this.LJLLLLLL = true;
            this.LLFZ.setAlpha(76);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        LIZIZ();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || LIZ() || this.LJLJI || this.LJLLI) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.LJLZ) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.LJLZ = motionEvent.getPointerId(i);
                            }
                        }
                    }
                } else {
                    int i2 = this.LJLZ;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    LJII(motionEvent.getY(findPointerIndex));
                }
            }
            this.LJLLLLLL = false;
            this.LJLZ = -1;
        } else {
            setTargetOffsetTopAndBottom(this.LLFF - this.LJZL.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.LJLZ = pointerId;
            this.LJLLLLLL = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.LJLLLL = motionEvent.getY(findPointerIndex2);
        }
        return this.LJLLLLLL;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.LJLJL.LIZIZ(0);
        this.LJLLI = false;
        float f = this.LJLJJLL;
        if (f > 0.0f) {
            LIZJ(f);
            this.LJLJJLL = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || LIZ() || this.LJLJI || this.LJLLI) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.LJLZ) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.LJLZ = motionEvent.getPointerId(i);
                            }
                        }
                    } else {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (actionIndex2 < 0) {
                            return false;
                        }
                        this.LJLZ = motionEvent.getPointerId(actionIndex2);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.LJLZ);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    LJII(y);
                    if (this.LJLLLLLL) {
                        float f = (y - this.LJLLL) * 0.5f;
                        if (f <= 0.0f) {
                            return false;
                        }
                        LIZLLL(f);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.LJLZ);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                if (this.LJLLLLLL) {
                    float y2 = (motionEvent.getY(findPointerIndex2) - this.LJLLL) * 0.5f;
                    this.LJLLLLLL = false;
                    LIZJ(y2);
                }
                this.LJLZ = -1;
                return false;
            }
        } else {
            this.LJLZ = motionEvent.getPointerId(0);
            this.LJLLLLLL = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.LJLIL;
        if (view != null && !C16360ka.LJIILL(view)) {
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.LJZL.setScaleX(f);
        this.LJZL.setScaleY(f);
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        LIZIZ();
        C16P c16p = this.LLFZ;
        C16O c16o = c16p.LJLIL;
        c16o.LJIIIIZZ = iArr;
        c16o.LIZ(0);
        c16p.LJLIL.LIZ(0);
        c16p.invalidateSelf();
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

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            LJFF();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LJLJLJ.LJIIJ(z);
    }

    public void setOnRefreshListener(InterfaceC03360Bg interfaceC03360Bg) {
        this.LJLILLLLZI = interfaceC03360Bg;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.LJZL.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C04330Ez.LIZIZ(getContext(), i));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.16Q, android.view.animation.Animation] */
    public void setRefreshing(boolean z) {
        int i;
        if (z && this.LJLJI != z) {
            this.LJLJI = z;
            if (!this.LLIIIZ) {
                i = this.LLFFF + this.LLFF;
            } else {
                i = this.LLFFF;
            }
            setTargetOffsetTopAndBottom(i - this.LJLLJ);
            this.LLIIIJ = false;
            IDAListenerS228S0100000 iDAListenerS228S0100000 = this.LLIIJI;
            this.LJZL.setVisibility(0);
            this.LLFZ.setAlpha(255);
            ?? r2 = new Animation() { // from class: X.16Q
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
                    SwipeRefreshLayout.this.setAnimationProgress(f);
                }
            };
            this.LLI = r2;
            r2.setDuration(this.LJLLILLLL);
            if (iDAListenerS228S0100000 != null) {
                this.LJZL.LJLIL = iDAListenerS228S0100000;
            }
            this.LJZL.clearAnimation();
            this.LJZL.startAnimation(this.LLI);
            return;
        }
        LJI(z, false);
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
        this.LJZL.setImageDrawable(null);
        this.LLFZ.LIZJ(i);
        this.LJZL.setImageDrawable(this.LLFZ);
    }

    public void setSlingshotDistance(int i) {
        this.LLFII = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.LJZL.bringToFront();
        h0.LJIIL(i, this.LJZL);
        this.LJLLJ = this.LJZL.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LJLJLJ.LJIIJJI(i, 0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Bd] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Be] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = -1.0f;
        this.LJLJLLL = new int[2];
        this.LJLL = new int[2];
        this.LJLZ = -1;
        this.LL = -1;
        this.LLIIJI = new IDAListenerS228S0100000(this, 0);
        this.LLIIJLIL = new Animation() { // from class: X.0Bd
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (!swipeRefreshLayout.LLIIIZ) {
                    i = swipeRefreshLayout.LLFFF - Math.abs(swipeRefreshLayout.LLFF);
                } else {
                    i = swipeRefreshLayout.LLFFF;
                }
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.LLD + ((int) ((i - r1) * f))) - swipeRefreshLayout2.LJZL.getTop());
                C16P c16p = SwipeRefreshLayout.this.LLFZ;
                float f2 = 1.0f - f;
                C16O c16o = c16p.LJLIL;
                if (f2 != c16o.LJIILL) {
                    c16o.LJIILL = f2;
                }
                c16p.invalidateSelf();
            }
        };
        this.LLIIL = new Animation() { // from class: X.0Be
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.LJ(f);
            }
        };
        this.LJLJJI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLLILLLL = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.LJZI = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.LLIIIL = (int) (displayMetrics.density * 40.0f);
        this.LJZL = new C16N(getContext());
        C16P c16p = new C16P(getContext());
        this.LLFZ = c16p;
        c16p.LIZJ(1);
        this.LJZL.setImageDrawable(this.LLFZ);
        this.LJZL.setVisibility(8);
        addView(this.LJZL);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.LLFFF = i;
        this.LJLJJL = i;
        this.LJLJL = new C16690l7();
        this.LJLJLJ = new C16610kz(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.LLIIIL;
        this.LJLLJ = i2;
        this.LLFF = i2;
        LJ(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LLIILII);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public final void LJI(boolean z, boolean z2) {
        if (this.LJLJI != z) {
            this.LLIIIJ = z2;
            LIZIZ();
            this.LJLJI = z;
            if (z) {
                int i = this.LJLLJ;
                IDAListenerS228S0100000 iDAListenerS228S0100000 = this.LLIIJI;
                this.LLD = i;
                reset();
                setDuration(200L);
                setInterpolator(this.LJZI);
                if (iDAListenerS228S0100000 != null) {
                    this.LJZL.LJLIL = iDAListenerS228S0100000;
                }
                this.LJZL.clearAnimation();
                this.LJZL.startAnimation(this.LLIIJLIL);
                return;
            }
            IDAListenerS228S0100000 iDAListenerS228S01000002 = this.LLIIJI;
            C16R c16r = new C16R(this);
            this.LLIFFJFJJ = c16r;
            c16r.setDuration(150L);
            C16N c16n = this.LJZL;
            c16n.LJLIL = iDAListenerS228S01000002;
            c16n.clearAnimation();
            this.LJZL.startAnimation(this.LLIFFJFJJ);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLJLJ.LIZIZ(f, f2);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.LL;
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
            LIZIZ();
        }
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.LJZL.measure(View.MeasureSpec.makeMeasureSpec(this.LLIIIL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLIIIL, 1073741824));
        this.LL = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.LJZL) {
                this.LL = i3;
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLJLJ.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.LJLJL.LIZ(i, 0);
        startNestedScroll(i & 2);
        this.LJLJJLL = 0.0f;
        this.LJLLI = true;
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
        return this.LJLJLJ.LIZLLL(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.LJLJJLL;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.LJLJJLL = 0.0f;
                } else {
                    this.LJLJJLL = f - f2;
                    iArr[1] = i2;
                }
                LIZLLL(this.LJLJJLL);
            }
        }
        if (this.LLIIIZ && i2 > 0 && this.LJLJJLL == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.LJZL.setVisibility(8);
        }
        int[] iArr2 = this.LJLJLLL;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LJLJLJ.LJFF(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.LJLIL == null) {
            LIZIZ();
        }
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.LJZL.getMeasuredWidth();
        int measuredHeight2 = this.LJZL.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.LJLLJ;
        this.LJZL.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.LJLL);
        if (i4 + this.LJLL[1] < 0 && !LIZ()) {
            float abs = this.LJLJJLL + Math.abs(r6);
            this.LJLJJLL = abs;
            LIZLLL(abs);
        }
    }
}
