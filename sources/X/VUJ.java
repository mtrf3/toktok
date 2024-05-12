package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public class VUJ extends HorizontalScrollView implements C1V0, InterfaceC33971Uz {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final int[] LJLLI;
    public final int[] LJLLILLLL;
    public final UIScrollView LJLLJ;
    public OverScroller LJLLL;
    public VelocityTracker LJLLLL;
    public C16690l7 LJLLLLLL;
    public C16610kz LJLZ;
    public VUK LJZ;

    @Override // android.view.View
    public final void stopNestedScroll() {
        LJIIIIZZ(0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void computeScroll() {
        OverScroller hScroller;
        if (!this.LJLIL || (hScroller = getHScroller()) == null) {
            super.computeScroll();
            return;
        }
        if (hScroller.computeScrollOffset()) {
            int currX = hScroller.getCurrX();
            int i = currX - this.LJLL;
            boolean z = true;
            if (LIZ(i, 0, 1, this.LJLLILLLL, null)) {
                i -= this.LJLLILLLL[0];
            }
            if (i != 0) {
                int LJJII = this.LJLLJ.LJJII();
                int scrollX = getScrollX();
                int i2 = scrollX + i;
                if (i2 >= 0 && i2 <= LJJII) {
                    z = false;
                }
                int LJJIIZ = C78609UtB.LJJIIZ(i2, 0, LJJII);
                if (z && !this.LJLZ.LJIIIZ(1)) {
                    hScroller.springBack(LJJIIZ, 0, 0, LJJII, 0, 0);
                }
                super.scrollTo(LJJIIZ, getScrollY());
                int scrollX2 = getScrollX() - scrollX;
                LIZIZ(scrollX2, 0, i - scrollX2, 0, null, 1);
            }
            this.LJLL = currX;
            C16300kU.LJIIJ(this);
            return;
        }
        if (this.LJLZ.LJIIIZ(1)) {
            LJIIIIZZ(1);
        }
        this.LJLL = 0;
        VUK vuk = this.LJZ;
        if (vuk == null || !this.LJLJI) {
            return;
        }
        vuk.LIZ();
    }

    public OverScroller getHScroller() {
        OverScroller overScroller = this.LJLLL;
        if (overScroller != null) {
            return overScroller;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (obj instanceof OverScroller) {
                    this.LJLLL = (OverScroller) obj;
                }
            }
        } catch (IllegalAccessException unused) {
            LLog.LIZLLL(4, "LynxNestedHorizontalScrollView", "Failed to get mScroller of HorizontalScrollView!");
        } catch (NoSuchFieldException unused2) {
            LLog.LIZLLL(4, "LynxNestedHorizontalScrollView", "Failed to get mScroller field of HorizontalScrollView!");
        }
        return this.LJLLL;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LJLLLLLL;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LJLZ.LJIIIZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LJLZ.LIZLLL;
    }

    public final void LIZJ(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LJLJJI) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LJLJJL = (int) motionEvent.getX(i);
            this.LJLJJI = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LJLLLL;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        this.LJLZ.LJIIL(i);
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        OverScroller hScroller;
        if (!this.LJLIL || (hScroller = getHScroller()) == null) {
            super.fling(i);
        } else if (getChildCount() > 0) {
            this.LJLZ.LJIIJJI(1, 1);
            hScroller.fling(getScrollX(), getScrollY(), i, 0, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE, 0, 0, 0, 0);
            C16300kU.LJIIJ(this);
            this.LJLL = getScrollX();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        VUK vuk;
        if (!this.LJLIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.LJLJI && (vuk = this.LJZ) != null) {
            return vuk.LIZIZ();
        }
        if (motionEvent.getAction() == 2 && this.LJLILLLLZI) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            LIZJ(motionEvent);
                        }
                    }
                } else {
                    int i = this.LJLJJI;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                        int x = (int) motionEvent.getX(findPointerIndex);
                        if (Math.abs(x - this.LJLJJL) > this.LJLJJLL && (getNestedScrollAxes() & 1) == 0) {
                            this.LJLILLLLZI = true;
                            this.LJLJJL = x;
                            if (this.LJLLLL == null) {
                                this.LJLLLL = VelocityTracker.obtain();
                            }
                            this.LJLLLL.addMovement(motionEvent);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            this.LJLJLLL = 0;
                        }
                    }
                }
            }
            this.LJLILLLLZI = false;
            this.LJLJJI = -1;
            VelocityTracker velocityTracker = this.LJLLLL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJLLLL = null;
            }
            int LJJII = this.LJLLJ.LJJII();
            if (getHScroller() != null && getHScroller().springBack(getScrollX(), getScrollY(), 0, LJJII, 0, 0)) {
                C16300kU.LJIIJ(this);
            }
            LJIIIIZZ(0);
        } else {
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (getChildCount() > 0) {
                int scrollX = getScrollX();
                View childAt = getChildAt(0);
                if (y >= childAt.getTop() && y < childAt.getBottom() && x2 >= childAt.getLeft() - scrollX && x2 < childAt.getRight() - scrollX) {
                    VelocityTracker velocityTracker2 = this.LJLLLL;
                    if (velocityTracker2 == null) {
                        this.LJLLLL = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.LJLLLL.addMovement(motionEvent);
                    this.LJLJJI = motionEvent.getPointerId(0);
                    this.LJLJJL = x2;
                    OverScroller hScroller = getHScroller();
                    if (hScroller != null) {
                        hScroller.computeScrollOffset();
                        this.LJLILLLLZI = !getHScroller().isFinished();
                    }
                    this.LJLZ.LJIIJJI(1, 0);
                }
            }
            this.LJLILLLLZI = false;
            VelocityTracker velocityTracker3 = this.LJLLLL;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.LJLLLL = null;
            }
        }
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        LJIILJJIL(0, view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        boolean z2;
        if (!this.LJLIL) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.LJLJI && this.LJZ != null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJLLLL == null) {
            this.LJLLLL = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (actionMasked == 0) {
            this.LJLJLLL = 0;
        }
        obtain.offsetLocation(this.LJLJLLL, 0.0f);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                LIZJ(motionEvent);
                                int findPointerIndex = motionEvent.findPointerIndex(this.LJLJJI);
                                if (findPointerIndex != -1) {
                                    this.LJLJJL = (int) motionEvent.getX(findPointerIndex);
                                }
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.LJLJJL = (int) motionEvent.getX(actionIndex);
                            this.LJLJJI = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        int LJJII = this.LJLLJ.LJJII();
                        OverScroller hScroller = getHScroller();
                        if (this.LJLILLLLZI && getChildCount() > 0 && hScroller != null && hScroller.springBack(getScrollX(), getScrollY(), 0, LJJII, 0, 0)) {
                            C16300kU.LJIIJ(this);
                        }
                        this.LJLILLLLZI = false;
                        this.LJLJJI = -1;
                        VelocityTracker velocityTracker = this.LJLLLL;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.LJLLLL = null;
                        }
                        LJIIIIZZ(0);
                    }
                } else {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.LJLJJI);
                    if (findPointerIndex2 != -1) {
                        int x = (int) motionEvent.getX(findPointerIndex2);
                        int i = this.LJLJJL - x;
                        if (LIZ(i, 0, 0, this.LJLLILLLL, this.LJLLI)) {
                            i -= this.LJLLILLLL[0];
                            obtain.offsetLocation(this.LJLLI[0], 0.0f);
                            this.LJLJLLL += this.LJLLI[0];
                        }
                        if (!this.LJLILLLLZI && Math.abs(i) > this.LJLJJLL) {
                            this.LJLILLLLZI = true;
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            if (i > 0) {
                                i -= this.LJLJJLL;
                            } else {
                                i += this.LJLJJLL;
                            }
                        }
                        if (this.LJLILLLLZI) {
                            this.LJLJJL = x - this.LJLLI[0];
                            int LJJII2 = this.LJLLJ.LJJII();
                            int scrollX = getScrollX();
                            int i2 = scrollX + i;
                            if (i2 < 0 || i2 > LJJII2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int LJJIIZ = C78609UtB.LJJIIZ(i2, 0, LJJII2);
                            OverScroller hScroller2 = getHScroller();
                            if (z2 && !this.LJLZ.LJIIIZ(1) && hScroller2 != null) {
                                hScroller2.springBack(LJJIIZ, 0, 0, LJJII2, 0, 0);
                            }
                            super.scrollTo(LJJIIZ, getScrollY());
                            if (z2 && !this.LJLZ.LJIIIZ(0)) {
                                this.LJLLLL.clear();
                            }
                            int scrollX2 = getScrollX() - scrollX;
                            if (LIZIZ(scrollX2, 0, i - scrollX2, 0, this.LJLLI, 0)) {
                                int i3 = this.LJLJJL;
                                int i4 = this.LJLLI[0];
                                this.LJLJJL = i3 - i4;
                                this.LJLJLLL += i4;
                                obtain.offsetLocation(i4, 0.0f);
                            }
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.LJLLLL;
                velocityTracker2.computeCurrentVelocity(1000, this.LJLJLJ);
                int i5 = -((int) velocityTracker2.getXVelocity(this.LJLJJI));
                int LJJII3 = this.LJLLJ.LJJII();
                OverScroller hScroller3 = getHScroller();
                if (getChildCount() > 0) {
                    if (Math.abs(i5) > this.LJLJL) {
                        if ((getScrollX() > 0 || i5 > 0) && (getScrollX() < LJJII3 || i5 < 0)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float f = i5;
                        if (!dispatchNestedPreFling(f, 0.0f)) {
                            dispatchNestedFling(f, 0.0f, z);
                            fling(i5);
                        }
                    } else if (hScroller3 != null && hScroller3.springBack(getScrollX(), getScrollY(), 0, LJJII3, 0, 0)) {
                        C16300kU.LJIIJ(this);
                    }
                }
                this.LJLILLLLZI = false;
                this.LJLJJI = -1;
                VelocityTracker velocityTracker3 = this.LJLLLL;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.LJLLLL = null;
                }
                LJIIIIZZ(0);
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            OverScroller hScroller4 = getHScroller();
            if (hScroller4 != null) {
                boolean z3 = !hScroller4.isFinished();
                this.LJLILLLLZI = z3;
                if (z3 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                hScroller4.abortAnimation();
            }
            this.LJLJJL = (int) motionEvent.getX();
            this.LJLJJI = motionEvent.getPointerId(0);
            this.LJLZ.LJIIJJI(1, 0);
        }
        VelocityTracker velocityTracker4 = this.LJLLLL;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void setEnableNewBounce(boolean z) {
        this.LJLJI = z;
    }

    public void setEnableNewNested(boolean z) {
        this.LJLIL = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LJLZ.LJIIJ(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LJLZ.LJIIJJI(i, 0);
    }

    public VUJ(Context context, UIScrollView uIScrollView) {
        super(context);
        this.LJLJJI = -1;
        this.LJLLI = new int[2];
        this.LJLLILLLL = new int[2];
        this.LJLLJ = uIScrollView;
        C16690l7 c16690l7 = new C16690l7();
        this.LJLLLLLL = c16690l7;
        this.LJLZ = new C16610kz(this);
        this.LJZ = new VUK(this, false, c16690l7);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LJLJJLL = viewConfiguration.getScaledTouchSlop();
        this.LJLJL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLJLJ = viewConfiguration.getScaledMaximumFlingVelocity();
        setNestedScrollingEnabled(false);
    }

    public final void LIZLLL(int i, int i2) {
        if (this.LJLIL && getHScroller() != null) {
            this.LJLL = getScrollX();
        }
        super.smoothScrollTo(i, i2);
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View view) {
        VUK vuk;
        if (this.LJLJI && (vuk = this.LJZ) != null) {
            vuk.LJ(i);
        } else {
            this.LJLLLLLL.LIZIZ(i);
            LJIIIIZZ(i);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLZ.LIZIZ(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLZ.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        VUK vuk;
        if (this.LJLJI && (vuk = this.LJZ) != null) {
            vuk.getClass();
            return false;
        }
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        LJIILL(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return LJJLIIJ(view, view2, i, 0);
    }

    @Override // X.C1V0
    public final void LJIILL(View view, View view2, int i, int i2) {
        VUK vuk;
        if (this.LJLJI && (vuk = this.LJZ) != null) {
            vuk.LJI.LIZ(i, i2);
        } else {
            this.LJLLLLLL.LIZ(i, i2);
            this.LJLZ.LJIIJJI(1, i2);
        }
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View view, View view2, int i, int i2) {
        VUK vuk;
        int i3;
        if (this.LJLJI && (vuk = this.LJZ) != null) {
            if (vuk.LIZ) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            if ((i3 & i) == 0) {
                return false;
            }
            return true;
        }
        if ((i & 1) == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return LIZ(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        VUK vuk;
        boolean z2 = false;
        if (this.LJLJI && (vuk = this.LJZ) != null) {
            vuk.getClass();
            return false;
        }
        if (z) {
            return false;
        }
        int scrollX = getScrollX();
        int LJJII = this.LJLLJ.LJJII();
        if ((scrollX > 0 || f > 0.0f) && (scrollX < LJJII || f < 0.0f)) {
            z2 = true;
        }
        if (!dispatchNestedPreFling(f, 0.0f)) {
            dispatchNestedFling(f, 0.0f, z2);
            fling((int) f);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        LIZ(i, i2, 0, iArr, null);
    }

    public boolean LIZ(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return this.LJLZ.LIZJ(i, i2, i3, iArr, iArr2);
    }

    @Override // X.C1V0
    public final void LJJIIJ(View view, int i, int i2, int[] iArr, int i3) {
        VUK vuk;
        if (this.LJLJI && (vuk = this.LJZ) != null) {
            vuk.LIZJ(view, i, i2, iArr, i3);
        } else {
            LIZ(i, i2, i3, iArr, null);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return LIZIZ(i, i2, i3, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        LJJ(view, i, i2, i3, i4, 0);
    }

    public boolean LIZIZ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.LJLZ.LJI(i, i2, i3, i4, iArr, i5);
    }

    @Override // X.C1V0
    public final void LJJ(View view, int i, int i2, int i3, int i4, int i5) {
        VUK vuk;
        if (this.LJLJI && (vuk = this.LJZ) != null) {
            vuk.LIZLLL(i, i2, i3, i4, i5);
            return;
        }
        int scrollX = getScrollX();
        scrollBy(i3, 0);
        int scrollX2 = getScrollX() - scrollX;
        LIZIZ(scrollX2, 0, i3 - scrollX2, 0, null, i5);
    }
}
