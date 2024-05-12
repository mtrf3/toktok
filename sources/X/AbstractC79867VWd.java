package X;

import Y.ARunnableS50S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.a1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VWd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC79867VWd extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public OverScroller LJLJJLL;
    public VelocityTracker LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public double LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public C79870VWg LJZ;
    public boolean LJZI;
    public boolean LJZL;

    public abstract void LIZ(boolean z);

    public abstract void LIZLLL(MotionEvent motionEvent);

    public abstract void LJ(double d, double d2);

    public abstract void LJFF();

    public void LJI() {
    }

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ();

    public void LJIIJ() {
    }

    public abstract void LJIIJJI();

    public abstract void LJIIL();

    @Override // android.view.View
    public final void computeScroll() {
        if (!this.LJZL && !this.LJZI) {
            LJIIJ();
        }
        if (getMScroller().computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = getMScroller().getCurrX();
            int currY = getMScroller().getCurrY();
            int scrollRange = getScrollRange();
            if (scrollX != currX || scrollY != currY) {
                getOverScrollMode();
                overScrollBy(currX - scrollX, currY - scrollY, scrollX, scrollY, scrollRange, 0, this.LJLJJL, 0, false);
                onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
            }
        }
        this.LJZL = false;
        LJI();
    }

    public abstract int getChildTotalWidth();

    public abstract int getScrollRange();

    public final void setScrolling(boolean z) {
    }

    public final ValueAnimator getAutoScrollAnimator() {
        Object value = this.LJLZ.getValue();
        o.LJIIIIZZ(value, "<get-autoScrollAnimator>(...)");
        return (ValueAnimator) value;
    }

    public final OverScroller getMScroller() {
        OverScroller overScroller = this.LJLJJLL;
        if (overScroller != null) {
            return overScroller;
        }
        o.LJIJI("mScroller");
        throw null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.LJZL = true;
    }

    public final boolean getCanHandleTouchEv() {
        return this.LJLLL;
    }

    public final boolean getIgNoScroll() {
        return this.LJZL;
    }

    public final int getLastMotionX() {
        return this.LJLJLLL;
    }

    public final boolean getSuperIgNo() {
        return this.LJZI;
    }

    public final C79870VWg getTouchBlockEvent() {
        return this.LJZ;
    }

    public final float getTrackX() {
        return this.LJLLLL;
    }

    public final float getTrackY() {
        return this.LJLLLLLL;
    }

    public static double LIZIZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        float abs = Math.abs(event.getX(0) - event.getX(1));
        float abs2 = Math.abs(event.getY(0) - event.getY(1));
        double sqrt = Math.sqrt((abs2 * abs2) + (abs * abs));
        if (sqrt < 200.0d) {
            return 200.0d;
        }
        return sqrt;
    }

    public final void LIZJ(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > getScrollRange()) {
            i = getScrollRange();
        }
        this.LJZL = true;
        scrollTo(i, 0);
    }

    public final void LJII(MotionEvent motionEvent) {
        int i;
        int action = (motionEvent.getAction() & 65280) >> 8;
        motionEvent.getPointerId(action);
        if (action == 0) {
            i = 1;
        } else {
            i = 0;
        }
        this.LJLJLLL = (int) motionEvent.getX(i);
        this.LJLJLJ = motionEvent.getPointerId(i);
        VelocityTracker velocityTracker = this.LJLJL;
        if (velocityTracker != null) {
            o.LJI(velocityTracker);
            velocityTracker.clear();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        this.LJZL = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r1 != 6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC79867VWd.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r5 != 6) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC79867VWd.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.LJZI = true;
            postDelayed(new ARunnableS50S0100000_14(this, 201), 100L);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        this.LJZL = true;
    }

    public final void setCanHandleTouchEv(boolean z) {
        this.LJLLL = z;
    }

    public final void setIgNoScroll(boolean z) {
        this.LJZL = z;
    }

    public final void setMScroller(OverScroller overScroller) {
        o.LJIIIZ(overScroller, "<set-?>");
        this.LJLJJLL = overScroller;
    }

    public final void setSuperIgNo(boolean z) {
        this.LJZI = z;
    }

    public void setTouchBlock(EnumC79869VWf touchBlock) {
        o.LJIIIZ(touchBlock, "touchBlock");
        this.LJZ.LIZ = touchBlock;
        int i = C79868VWe.LIZ[touchBlock.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i != 5) {
                return;
            }
            getAutoScrollAnimator().cancel();
            return;
        }
        getAutoScrollAnimator().start();
    }

    public final void setTouchBlockEvent(C79870VWg c79870VWg) {
        o.LJIIIZ(c79870VWg, "<set-?>");
        this.LJZ = c79870VWg;
    }

    public final void setTrackX(float f) {
        this.LJLLLL = f;
    }

    public final void setTrackY(float f) {
        this.LJLLLLLL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC79867VWd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJLJ = -1;
        this.LJLLL = true;
        this.LJLZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 366));
        this.LJZ = new C79870VWg(EnumC79869VWf.Null);
        setLayoutMode(1);
        setMScroller(new OverScroller(getContext()));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LJLIL = viewConfiguration.getScaledTouchSlop();
        this.LJLILLLLZI = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLJI = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LJLJJI = viewConfiguration.getScaledOverscrollDistance();
        this.LJLJJL = viewConfiguration.getScaledOverflingDistance();
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (!getMScroller().isFinished()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            setScrollX(i);
            setScrollY(i2);
            onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
            if (z) {
                getMScroller().springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0);
                return;
            }
            return;
        }
        super.scrollTo(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z) {
            this.LJZL = true;
        }
    }
}
