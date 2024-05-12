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
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1303959v extends ConstraintLayout implements C59H {
    public final C62822Ol8 LJLIL;
    public final int LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public boolean LJLJJL;
    public C86941YAf LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public C5AF LJLL;
    public final ArrayList<InterfaceC1299658e> LJLLI;
    public VelocityTracker LJLLILLLL;
    public boolean LJLLJ;
    public View.OnClickListener LJLLL;
    public boolean LJLLLL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLLLLLL;
    public InterfaceC65784Pro<C76800UCe> LJLZ;
    public InterfaceC65784Pro<C76800UCe> LJZ;
    public final C62822Ol8 LJZI;
    public float LJZL;
    public boolean LL;
    public boolean LLD;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LLF;
    public final C62822Ol8 LLFF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1303959v(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1303959v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    private final Runnable getFingerStopRunner() {
        return (Runnable) this.LJZI.getValue();
    }

    private final OverScroller getScrollerX() {
        return (OverScroller) this.LJLIL.getValue();
    }

    public final boolean LJJLJLI() {
        if (!getScrollerX().isFinished() && getScrollerX().computeScrollOffset()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (!getScrollerX().isFinished() && getScrollerX().computeScrollOffset()) {
            LJJZ(getScrollerX().getCurrX(), this.LJLLLL);
            postInvalidateOnAnimation();
        } else {
            if (this.LJLL != C5AF.SETTLING) {
                return;
            }
            setScrollState(C5AF.IDLE);
        }
    }

    public final int getChildScrollX() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof AbstractC1304059w) && childAt != null) {
                boolean booleanValue = ((Boolean) this.LLFF.getValue()).booleanValue();
                int scrollX = childAt.getScrollX();
                if (booleanValue) {
                    i = Math.min(i, scrollX);
                } else {
                    i = Math.max(i, scrollX);
                }
            }
        }
        return i;
    }

    public final int getRealScrollX() {
        return getChildScrollX();
    }

    public final C86941YAf getScaleGestureDetector() {
        return this.LJLJJLL;
    }

    private final void setScrollState(C5AF c5af) {
        if (this.LJLL == c5af) {
            return;
        }
        this.LJLL = c5af;
        int childScrollX = getChildScrollX();
        Iterator<InterfaceC1299658e> it = this.LJLLI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(c5af, childScrollX);
        }
    }

    @Override // X.C59H
    public final void LJJIIZI(int i) {
        AbstractC1304059w abstractC1304059w;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof AbstractC1304059w) && (abstractC1304059w = (AbstractC1304059w) childAt) != null && abstractC1304059w.LJLJLJ != i) {
                abstractC1304059w.LJLJLJ = i;
            }
        }
    }

    public final void LJJLL(int i) {
        AbstractC1304059w abstractC1304059w;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof AbstractC1304059w) && (abstractC1304059w = (AbstractC1304059w) childAt) != null) {
                AbstractC1304059w.LIZLLL(abstractC1304059w, i, abstractC1304059w.getScrollY(), false);
            }
        }
    }

    public final void LJJZZI(long j) {
        AbstractC1304059w abstractC1304059w;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof AbstractC1304059w) && (abstractC1304059w = (AbstractC1304059w) childAt) != null) {
                abstractC1304059w.LJLJJLL = j;
                abstractC1304059w.LJLJL = (int) (((float) j) * abstractC1304059w.LJLJLLL);
                abstractC1304059w.LJLJLJ = 0;
            }
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
        if ((motionEvent.getAction() == 2 && this.LJLL == C5AF.DRAGGING) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float x = motionEvent.getX() - this.LJLJLJ;
                if (Math.abs(x) >= Math.abs(motionEvent.getY() - this.LJLJLLL) && this.LJLILLLLZI <= Math.abs(x)) {
                    setScrollState(C5AF.DRAGGING);
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
        if (this.LJLL != C5AF.DRAGGING) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C5AF c5af;
        AbstractC1304059w abstractC1304059w;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.LLD) {
            return true;
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
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        VelocityTracker velocityTracker2 = this.LJLLILLLL;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                        }
                        this.LJLLILLLL = null;
                        setScrollState(C5AF.IDLE);
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJLZ;
                        if (interfaceC65784Pro3 != null) {
                            interfaceC65784Pro3.invoke();
                        }
                    }
                } else {
                    C5AF c5af2 = this.LJLL;
                    C5AF c5af3 = C5AF.DRAGGING;
                    if (c5af2 == c5af3) {
                        C59I.LIZ(this, (int) (this.LJLJL - motionEvent.getX()), 0, true, false, 24);
                    } else {
                        float x = motionEvent.getX() - this.LJLJLJ;
                        if (Math.abs(x) >= Math.abs(motionEvent.getY() - this.LJLJLLL) && this.LJLILLLLZI <= Math.abs(x)) {
                            setScrollState(c5af3);
                        }
                    }
                    float x2 = motionEvent.getX();
                    this.LJLJL = x2;
                    if (Math.abs(this.LJZL - x2) >= 1.0f) {
                        this.LL = true;
                        this.LJZL = this.LJLJL;
                        if (getHandler() != null) {
                            removeCallbacks(getFingerStopRunner());
                            postDelayed(getFingerStopRunner(), 96L);
                        }
                    }
                    if (this.LJLL != c5af3) {
                        z = true;
                    }
                    this.LJLLJ = z;
                }
            } else {
                if (this.LL && (interfaceC65784Pro2 = this.LJZ) != null) {
                    interfaceC65784Pro2.invoke();
                }
                if (this.LJLL == C5AF.DRAGGING) {
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
                        c5af = C5AF.IDLE;
                    } else {
                        int i = (int) f2;
                        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LLF;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(Integer.valueOf(i));
                        }
                        int childScrollX = getChildScrollX();
                        int childCount = getChildCount();
                        int i2 = 0;
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = getChildAt(i3);
                            if ((childAt instanceof AbstractC1304059w) && (abstractC1304059w = (AbstractC1304059w) childAt) != null) {
                                i2 = Math.max(i2, abstractC1304059w.getMaxScrollX());
                            }
                        }
                        if (((Boolean) this.LLFF.getValue()).booleanValue()) {
                            getScrollerX().fling(childScrollX, 0, i, 0, -i2, 0, 0, 0);
                        } else {
                            getScrollerX().fling(childScrollX, 0, i, 0, 0, i2, 0, 0);
                        }
                        postInvalidateOnAnimation();
                        c5af = C5AF.SETTLING;
                    }
                    setScrollState(c5af);
                    if (this.LJLL == C5AF.IDLE && (interfaceC65784Pro = this.LJLZ) != null) {
                        interfaceC65784Pro.invoke();
                    }
                } else if (this.LJLLJ) {
                    View.OnClickListener onClickListener = this.LJLLL;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    setScrollState(C5AF.IDLE);
                }
                VelocityTracker velocityTracker3 = this.LJLLILLLL;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                }
                this.LJLLILLLL = null;
            }
        } else {
            this.LL = false;
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

    public final void setFingerAndTrackStopListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLZ = listener;
    }

    public final void setFingerStopListener(InterfaceC88472Yns<? super Integer, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLLLLL = listener;
    }

    public final void setFingerUpAfterMovedListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJZ = listener;
    }

    public final void setHorizontalFlingListener(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LLF = interfaceC88472Yns;
    }

    public final void setOnBlankClickListener(View.OnClickListener onClickListener) {
        AbstractC1304059w abstractC1304059w;
        this.LJLLL = onClickListener;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof AbstractC1304059w) && (abstractC1304059w = (AbstractC1304059w) childAt) != null) {
                abstractC1304059w.setOnBlankClickListener$editor_trackpanel_release(onClickListener);
            }
        }
    }

    public final void setScaleGestureDetector(C86941YAf c86941YAf) {
        this.LJLJJLL = c86941YAf;
    }

    public final void setTimelineScale(float f) {
        AbstractC1304059w abstractC1304059w;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof AbstractC1304059w) && (abstractC1304059w = (AbstractC1304059w) childAt) != null) {
                abstractC1304059w.setTimelineScale(f);
            }
        }
    }

    @Override // X.C59H
    public final void LJJJJJ(int i, boolean z) {
        if (i == 0) {
            return;
        }
        this.LJLLLL = z;
        setScrollState(C5AF.SETTLING);
        getScrollerX().startScroll(getChildScrollX(), 0, i, 0);
        postInvalidateOnAnimation();
    }

    public final void LJJZ(int i, boolean z) {
        AbstractC1304059w abstractC1304059w;
        this.LJLLLL = z;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof AbstractC1304059w) && (abstractC1304059w = (AbstractC1304059w) childAt) != null) {
                AbstractC1304059w.LIZLLL(abstractC1304059w, i, abstractC1304059w.getScrollY(), z);
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        C59I.LIZ(this, i, i2, false, false, 24);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        LJJZ(i, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303959v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        setFocusable(true);
        setDescendantFocusability(262144);
        setVerticalScrollBarEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        this.LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 630));
        this.LJLILLLLZI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLJI = r1.getScaledMinimumFlingVelocity();
        this.LJLJJI = r1.getScaledMaximumFlingVelocity();
        this.LJLL = C5AF.IDLE;
        this.LJLLI = new ArrayList<>();
        this.LJLLLL = true;
        this.LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 628));
        this.LJZL = -1.0f;
        this.LLFF = C221108m2.LIZIZ(new AqS152S0100000_2(context, 629));
    }

    public /* synthetic */ C1303959v(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // X.C59H
    public final void LIZLLL(boolean z, boolean z2, int i, int i2, boolean z3) {
        AbstractC1304059w abstractC1304059w;
        this.LJLLLL = z;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof AbstractC1304059w) && (abstractC1304059w = (AbstractC1304059w) childAt) != null) {
                abstractC1304059w.LJLJI = z;
                abstractC1304059w.LIZJ(z, z2, abstractC1304059w.getScrollX() + i, abstractC1304059w.getScrollY() + i2, z3);
            }
        }
    }
}
