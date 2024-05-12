package X;

import Y.IDAListenerS81S0100000_14;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.vcloud.vctrace.BuildConfig;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VvN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81293VvN extends LinearLayout implements InterfaceC16670l5 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public static final C43051mX<Rect> LLIIIL;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public boolean LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public boolean LJLLJ;
    public ObjectAnimator LJLLL;
    public C75O LJLLLL;
    public InterfaceC81297VvR LJLLLLLL;
    public View.OnClickListener LJLZ;
    public final C81294VvO LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public boolean LL;
    public final C62822Ol8 LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LLFII;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LLFZ;
    public final IDAListenerS81S0100000_14 LLI;
    public final IDAListenerS81S0100000_14 LLIFFJFJJ;
    public final boolean LLII;
    public int LLIIII;
    public int LLIIIILZ;

    static {
        TBV tbv = new TBV(C81293VvN.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbv};
        LLIIIL = new C43051mX<>(12);
    }

    public final void LIZJ() {
        this.LJLLJ = false;
        setMTouchScrollingChild(false);
        this.LL = false;
        this.LJLLI = 0.0f;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f, float f2, boolean z) {
        o.LJIIIZ(target, "target");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View target, int i, int i2, int i3, int i4) {
        o.LJIIIZ(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View child, View target, int i) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
    }

    private final boolean getMAnimating() {
        if (this.LLF || this.LLFF) {
            return true;
        }
        return false;
    }

    private final View getMCommentBgContainer() {
        return (View) this.LJZL.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.LJLJJI.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.LJLJI.getValue()).floatValue();
    }

    private final ViewGroup getMPlaceholder() {
        return (ViewGroup) this.LJZI.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return this.LJZ.LIZ(this, LLIIIJ[0]).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.LJLILLLLZI.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.LJLJJL.getValue();
    }

    public final VVN getMScrollingChild() {
        return (VVN) this.LLD.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.LJLIL.getValue();
    }

    public final boolean getHaveBangs() {
        return this.LLII;
    }

    public final int getHeightOffset() {
        return this.LLIIIILZ;
    }

    public final C75O getMOnShowHeightChangeListener() {
        return this.LJLLLL;
    }

    public final int getNotchHeight() {
        return this.LLIIII;
    }

    public final View.OnClickListener getOnCancelListener() {
        return this.LJLZ;
    }

    public final InterfaceC81297VvR getOnDialogListener() {
        return this.LJLLLLLL;
    }

    private final void setMTouchScrollingChild(boolean z) {
        this.LJZ.LIZIZ(LLIIIJ[0], this, Boolean.valueOf(z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 0) {
            this.LJLJJLL = getMAnimating();
        }
        if (this.LJLJJLL && !getMAnimating() && ev.getActionMasked() == 2) {
            ev.setAction(0);
            this.LJLJJLL = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getActionMasked() == 0) {
            LIZJ();
            this.LJLJL = event.getX();
            float y = event.getY();
            this.LJLJLJ = y;
            this.LJLJLLL = y;
            this.LJLL = event.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(event);
            ViewGroup mPlaceholder = getMPlaceholder();
            o.LJIIIIZZ(mPlaceholder, "mPlaceholder");
            this.LL = LIZIZ(event, mPlaceholder);
            VVN mScrollingChild = getMScrollingChild();
            o.LJIIIIZZ(mScrollingChild, "mScrollingChild");
            setMTouchScrollingChild(LIZIZ(event, mScrollingChild));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(event);
        }
        if (event.getActionMasked() == 3) {
            LIZJ();
        }
        if (event.getActionMasked() == 1) {
            LIZJ();
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.LL) {
                    return false;
                }
                float y2 = this.LJLJLLL - event.getY();
                if (!getMTouchScrollingChild() && (this.LJLLJ || Math.abs(y2) > getMTouchSlop())) {
                    this.LJLLJ = true;
                    return true;
                }
            }
        } else if (this.LL) {
            return false;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View child) {
        boolean z;
        o.LJIIIZ(child, "child");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStopNestedScroll: ");
        LIZ.append(getTranslationY());
        LIZ.append("  ");
        float f = 2;
        boolean z2 = true;
        if (getTranslationY() * f < this.LJLLILLLL) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (getTranslationY() * f >= this.LJLLILLLL) {
            z2 = false;
        }
        LIZ(z2, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        boolean z;
        o.LJIIIZ(event, "event");
        if (getMAnimating()) {
            return true;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    onStopNestedScroll(this);
                    LIZJ();
                }
            } else if (!getMTouchScrollingChild()) {
                getMVelocityTracker().addMovement(event);
                float x = this.LJLJL - event.getX();
                float y = this.LJLJLJ - event.getY();
                if (this.LJLLJ || Math.abs(y) > getMTouchSlop()) {
                    this.LJLLJ = true;
                    VVN mScrollingChild = getMScrollingChild();
                    o.LJIIIIZZ(mScrollingChild, "mScrollingChild");
                    onNestedPreScroll(mScrollingChild, (int) x, (int) y, new int[]{0, 0});
                    InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LLFZ;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(Boolean.TRUE);
                    }
                }
                this.LJLLI = event.getRawY() - this.LJLL;
                this.LJLL = event.getRawY();
            }
        } else {
            VelocityTracker mVelocityTracker = getMVelocityTracker();
            mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
            if (Math.abs(mVelocityTracker.getYVelocity()) > getMMinimumVelocity() && !getMAnimating()) {
                if (this.LJLLI < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                LIZ(z, false);
            } else {
                onStopNestedScroll(this);
            }
            LIZJ();
        }
        return true;
    }

    public final void setHeightOffset(int i) {
        this.LLIIIILZ = i;
    }

    public final void setMIsFocus(boolean z) {
        if (this.LLFFF ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.LLFFF = z;
        }
    }

    public final void setMOnShowHeightChangeListener(C75O c75o) {
        this.LJLLLL = c75o;
    }

    public final void setNotchHeight(int i) {
        this.LLIIII = i;
    }

    public final void setOnCancelListener(View.OnClickListener onClickListener) {
        this.LJLZ = onClickListener;
    }

    public final void setOnDialogListener(InterfaceC81297VvR interfaceC81297VvR) {
        this.LJLLLLLL = interfaceC81297VvR;
    }

    public final void setPreScrollChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LLFZ = interfaceC88472Yns;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C75O c75o = this.LJLLLL;
        if (c75o != null) {
            float f2 = this.LJLLILLLL;
            c75o.O4(f2 - f, f2);
        }
    }

    public final void setVisibleChangedListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LLFII = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81293VvN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        boolean z = false;
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(context, 1496));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 292));
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 289));
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 288));
        this.LJLJJL = C221108m2.LIZIZ(C51675KPv.LJLIL);
        this.LJZ = new C81294VvO(Boolean.FALSE, this);
        this.LJZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, BuildConfig.VERSION_CODE));
        this.LJZL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 287));
        this.LLD = C221108m2.LIZIZ(new AqS164S0100000_14(this, 291));
        this.LLI = new IDAListenerS81S0100000_14(this, 8);
        this.LLIFFJFJJ = new IDAListenerS81S0100000_14(this, 7);
        setMIsFocus(true);
        setOnKeyListener(new ViewOnKeyListenerC81295VvP(this));
        if (C60178Nja.LIZIZ(getContext()) && C61447O9r.LJIILIIL == 0) {
            z = true;
        }
        this.LLII = z;
        this.LLIIII = C61447O9r.LIZJ(context);
        this.LLIIIILZ = C17N.LJIILL(8.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
    
        if (getVisibility() == 8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81293VvN.LIZ(boolean, boolean):void");
    }

    public final boolean LIZIZ(MotionEvent motionEvent, View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        C43051mX<Rect> c43051mX = LLIIIL;
        Rect LIZIZ = c43051mX.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = new Rect();
        }
        C73021SlF.LIZ(this, view, LIZIZ);
        try {
            boolean contains = LIZIZ.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            LIZIZ.setEmpty();
            c43051mX.LIZ(LIZIZ);
            return contains;
        } catch (Throwable th) {
            LIZIZ.setEmpty();
            LLIIIL.LIZ(LIZIZ);
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLLILLLL = getMeasuredHeight() - getMPlaceholder().getMeasuredHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        boolean z;
        o.LJIIIZ(target, "target");
        if ((target instanceof InterfaceC16140kE) && ((InterfaceC16140kE) target).computeVerticalScrollOffset() != 0) {
            return false;
        }
        if (getTranslationY() * 2 < this.LJLLILLLL) {
            z = true;
        } else {
            z = false;
        }
        LIZ(z, false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View child, View target, int i) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        if ((target instanceof InterfaceC16600ky) && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View target, int i, int i2, int[] consumed) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        float translationY = getTranslationY();
        float f = 0.0f;
        if (translationY > 0.0f) {
            float f2 = translationY - i2;
            if (f2 >= 0.0f) {
                f = f2;
            }
            float f3 = this.LJLLILLLL;
            if (f > f3) {
                f = f3;
            }
            setTranslationY(f);
            if (getMTouchScrollingChild()) {
                consumed[1] = consumed[1] + i2;
                return;
            }
            return;
        }
        int i3 = 0;
        if (translationY != 0.0f) {
            return;
        }
        if (target instanceof InterfaceC16140kE) {
            i3 = ((InterfaceC16140kE) target).computeVerticalScrollOffset();
        }
        if (i2 >= 0) {
            return;
        }
        if (i3 != 0 && getMTouchScrollingChild()) {
            return;
        }
        float f4 = translationY - i2;
        float f5 = this.LJLLILLLL;
        if (f4 > f5) {
            f4 = f5;
        }
        setTranslationY(f4);
    }
}
