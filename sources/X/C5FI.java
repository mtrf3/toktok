package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5FI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FI extends ConstraintLayout implements C5FL {
    public final C62822Ol8 LJLIL;
    public final int LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public boolean LJLJJL;
    public C86941YAf LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public C5FJ LJLL;
    public C5FM LJLLI;
    public VelocityTracker LJLLILLLL;
    public boolean LJLLJ;
    public View.OnClickListener LJLLL;
    public boolean LJLLLL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public float LJZ;

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    private final Runnable getFingerStopRunner() {
        return (Runnable) this.LJLZ.getValue();
    }

    private final OverScroller getScrollerX() {
        return (OverScroller) this.LJLIL.getValue();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (!getScrollerX().isFinished() && getScrollerX().computeScrollOffset() && !C90193gN.LIZ()) {
            LJJLJLI(getScrollerX().getCurrX(), this.LJLLLL);
            postInvalidateOnAnimation();
        } else {
            if (this.LJLL != C5FJ.SETTLING) {
                return;
            }
            setScrollState(C5FJ.IDLE);
        }
    }

    public final int getChildScrollX() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof C5FH) && childAt != null) {
                if (!C90193gN.LIZ()) {
                    i = Math.max(i, childAt.getScrollX());
                } else {
                    i = Math.max(i, -childAt.getScrollX());
                }
            }
        }
        return i;
    }

    public final int getRealScrollX() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof C5FH) && childAt != null) {
                i = Math.max(i, childAt.getScrollX());
            }
        }
        return i;
    }

    public final C86941YAf getScaleGestureDetector() {
        return this.LJLJJLL;
    }

    private final void setScrollState(C5FJ c5fj) {
        if (this.LJLL == c5fj) {
            return;
        }
        this.LJLL = c5fj;
        int childScrollX = getChildScrollX();
        C5FM c5fm = this.LJLLI;
        if (c5fm != null) {
            c5fm.LIZ(childScrollX, c5fj);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() >= 2) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = z;
        if (motionEvent.getActionMasked() == 5) {
            C86941YAf c86941YAf = this.LJLJJLL;
            if (c86941YAf != null) {
                c86941YAf.LIZJ(motionEvent, this);
            }
            return true;
        }
        if (this.LJLJJL) {
            return true;
        }
        if ((motionEvent.getAction() == 2 && this.LJLL == C5FJ.DRAGGING) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float x = motionEvent.getX() - this.LJLJLJ;
                if (Math.abs(x) >= Math.abs(motionEvent.getY() - this.LJLJLLL) && this.LJLILLLLZI <= Math.abs(x)) {
                    setScrollState(C5FJ.DRAGGING);
                }
            }
        } else {
            this.LJLJLJ = motionEvent.getX();
            this.LJLJLLL = motionEvent.getY();
            this.LJLJL = motionEvent.getX();
            if (!getScrollerX().isFinished()) {
                getScrollerX().abortAnimation();
            }
        }
        if (this.LJLL != C5FJ.DRAGGING) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C5FJ c5fj;
        C5FH c5fh;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() >= 2) {
            C86941YAf c86941YAf = this.LJLJJLL;
            if (c86941YAf != null) {
                c86941YAf.LIZJ(motionEvent, this);
            }
            return true;
        }
        VelocityTracker velocityTracker = this.LJLLILLLL;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.LJLLILLLL = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z = false;
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        setFromUser(false);
                        VelocityTracker velocityTracker2 = this.LJLLILLLL;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                        }
                        this.LJLLILLLL = null;
                        setScrollState(C5FJ.IDLE);
                    }
                } else {
                    C5FJ c5fj2 = this.LJLL;
                    C5FJ c5fj3 = C5FJ.DRAGGING;
                    if (c5fj2 == c5fj3) {
                        setFromUser(true);
                        LIZLLL(true, false, (int) (this.LJLJL - motionEvent.getX()), 0, false);
                    } else {
                        float x = motionEvent.getX() - this.LJLJLJ;
                        if (Math.abs(x) >= Math.abs(motionEvent.getY() - this.LJLJLLL) && this.LJLILLLLZI <= Math.abs(x)) {
                            setScrollState(c5fj3);
                        }
                    }
                    float x2 = motionEvent.getX();
                    this.LJLJL = x2;
                    if (Math.abs(this.LJZ - x2) >= 1.0f) {
                        this.LJZ = this.LJLJL;
                        if (getHandler() != null) {
                            removeCallbacks(getFingerStopRunner());
                            postDelayed(getFingerStopRunner(), 96L);
                        }
                    }
                    if (this.LJLL != c5fj3) {
                        z = true;
                    }
                    this.LJLLJ = z;
                }
            } else {
                setFromUser(false);
                if (this.LJLL == C5FJ.DRAGGING) {
                    velocityTracker.computeCurrentVelocity(1000, this.LJLJJI);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) < this.LJLJI) {
                        xVelocity = 0.0f;
                    } else {
                        float abs = Math.abs(xVelocity);
                        float f = this.LJLJJI;
                        if (abs > f) {
                            if (xVelocity > 0.0f) {
                                xVelocity = f;
                            } else {
                                xVelocity = -f;
                            }
                        }
                    }
                    float f2 = -xVelocity;
                    if (f2 == 0.0f) {
                        c5fj = C5FJ.IDLE;
                    } else {
                        int i = (int) f2;
                        int childCount = getChildCount();
                        int i2 = 0;
                        int i3 = 0;
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = getChildAt(i4);
                            if ((childAt instanceof C5FH) && (c5fh = (C5FH) childAt) != null) {
                                i3 = Math.max(i3, c5fh.getMaxScrollX());
                                i2 = Math.max(i2, c5fh.getScrollX());
                            }
                        }
                        getScrollerX().fling(i2, 0, i, 0, 0, i3, 0, 0);
                        postInvalidateOnAnimation();
                        c5fj = C5FJ.SETTLING;
                    }
                    setScrollState(c5fj);
                } else if (this.LJLLJ) {
                    View.OnClickListener onClickListener = this.LJLLL;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    setScrollState(C5FJ.IDLE);
                }
                VelocityTracker velocityTracker3 = this.LJLLILLLL;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                }
                this.LJLLILLLL = null;
            }
        } else {
            this.LJLLJ = true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            VelocityTracker velocityTracker = this.LJLLILLLL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.LJLLILLLL = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setFingerStopListener(InterfaceC88472Yns<? super Integer, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLLLLL = listener;
    }

    public void setFromUser(boolean z) {
        C5FH c5fh;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C5FH) && (c5fh = (C5FH) childAt) != null) {
                c5fh.setFromUser(z);
            }
        }
    }

    public final void setOnBlankClickListener(View.OnClickListener onClickListener) {
        C5FH c5fh;
        this.LJLLL = onClickListener;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C5FH) && (c5fh = (C5FH) childAt) != null) {
                c5fh.setOnBlankClickListener$tools_camera_edit_release(onClickListener);
            }
        }
    }

    public final void setOnScrollStateChangeListener(C5FM c5fm) {
        this.LJLLI = c5fm;
    }

    public final void setScaleGestureDetector(C86941YAf c86941YAf) {
        this.LJLJJLL = c86941YAf;
    }

    public final void setTimelineScale(float f) {
        C5FH c5fh;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C5FH) && (c5fh = (C5FH) childAt) != null) {
                c5fh.setTimelineScale(f);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5FI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJJLJLI(int i, boolean z) {
        C5FH c5fh;
        this.LJLLLL = z;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof C5FH) && (c5fh = (C5FH) childAt) != null) {
                c5fh.LJI(z, false, i, c5fh.getScrollY(), false);
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        LIZLLL(false, false, i, i2, false);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        LJJLJLI(i, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5FI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        setFocusable(true);
        setDescendantFocusability(262144);
        setVerticalScrollBarEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        this.LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 181));
        this.LJLILLLLZI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLJI = r1.getScaledMinimumFlingVelocity();
        this.LJLJJI = r1.getScaledMaximumFlingVelocity();
        this.LJLL = C5FJ.IDLE;
        this.LJLLLL = true;
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 180));
        this.LJZ = -1.0f;
    }

    @Override // X.C5FL
    public final void LIZLLL(boolean z, boolean z2, int i, int i2, boolean z3) {
        C5FH c5fh;
        this.LJLLLL = z;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof C5FH) && (c5fh = (C5FH) childAt) != null) {
                c5fh.LJLILLLLZI = z;
                c5fh.LJI(z, z2, c5fh.getScrollX() + i, c5fh.getScrollY() + i2, z3);
            }
        }
    }
}
