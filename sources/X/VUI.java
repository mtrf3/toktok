package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public class VUI extends ScrollView implements C1V0, InterfaceC33971Uz {
    public final C16690l7 LJLIL;
    public final C16610kz LJLILLLLZI;
    public final UIScrollView LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public final int[] LJLJL;
    public OverScroller LJLJLJ;
    public final VUK LJLJLLL;

    @Override // android.view.View
    public final void stopNestedScroll() {
        LJIIIIZZ(0);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void computeScroll() {
        OverScroller vScroller;
        if (!this.LJLJJI || (vScroller = getVScroller()) == null) {
            super.computeScroll();
            return;
        }
        if (vScroller.computeScrollOffset()) {
            int currY = vScroller.getCurrY();
            int i = currY - this.LJLJJLL;
            boolean z = true;
            if (LIZ(0, i, 1, this.LJLJL, null)) {
                i -= this.LJLJL[1];
            }
            if (i != 0) {
                int LJJII = this.LJLJI.LJJII();
                int scrollY = getScrollY();
                int i2 = scrollY + i;
                if (i2 >= 0 && i2 <= LJJII) {
                    z = false;
                }
                int LJJIIZ = C78609UtB.LJJIIZ(i2, 0, LJJII);
                if (z && !this.LJLILLLLZI.LJIIIZ(1)) {
                    vScroller.springBack(0, LJJIIZ, 0, 0, 0, LJJII);
                }
                super.scrollTo(getScrollX(), LJJIIZ);
                int scrollY2 = getScrollY() - scrollY;
                LIZIZ(0, scrollY2, 0, i - scrollY2, null, 1);
            }
            this.LJLJJLL = currY;
            C16300kU.LJIIJ(this);
            return;
        }
        if (this.LJLILLLLZI.LJIIIZ(1)) {
            LJIIIIZZ(1);
        }
        this.LJLJJLL = 0;
        VUK vuk = this.LJLJLLL;
        if (vuk == null || !this.LJLJJL) {
            return;
        }
        vuk.LIZ();
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LJLIL;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    public OverScroller getVScroller() {
        OverScroller overScroller = this.LJLJLJ;
        if (overScroller != null) {
            return overScroller;
        }
        try {
            Field declaredField = ScrollView.class.getDeclaredField("mScroller");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (obj instanceof OverScroller) {
                    this.LJLJLJ = (OverScroller) obj;
                }
            }
        } catch (IllegalAccessException unused) {
            LLog.LIZLLL(4, "LynxNestedScrollView", "Failed to get mScroller of ScrollView!");
        } catch (NoSuchFieldException unused2) {
            LLog.LIZLLL(4, "LynxNestedScrollView", "Failed to get mScroller field of ScrollView!");
        }
        return this.LJLJLJ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LJLILLLLZI.LJIIIZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LJLILLLLZI.LIZLLL;
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        this.LJLILLLLZI.LJIIL(i);
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        OverScroller vScroller;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fling with vel = ");
        LIZ.append(i);
        LLog.LIZLLL(2, "LynxNestedScrollView", X1D.LIZIZ(LIZ));
        if (!this.LJLJJI || (vScroller = getVScroller()) == null) {
            super.fling(i);
        } else if (getChildCount() > 0) {
            this.LJLILLLLZI.LJIIJJI(2, 1);
            vScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE, 0, 0);
            C16300kU.LJIIJ(this);
            this.LJLJJLL = getScrollY();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VUK vuk;
        if (this.LJLJJL && (vuk = this.LJLJLLL) != null) {
            return vuk.LIZIZ();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        LJIILJJIL(0, view);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VUK vuk;
        if (this.LJLJJL && (vuk = this.LJLJLLL) != null) {
            vuk.getClass();
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setEnableNewBounce(boolean z) {
        this.LJLJJL = z;
    }

    public void setEnableNewNested(boolean z) {
        this.LJLJJI = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LJLILLLLZI.LJIIJ(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LJLILLLLZI.LJIIJJI(i, 0);
    }

    public VUI(Context context, UIScrollView uIScrollView) {
        super(context);
        this.LJLJL = new int[2];
        this.LJLJI = uIScrollView;
        C16690l7 c16690l7 = new C16690l7();
        this.LJLIL = c16690l7;
        this.LJLILLLLZI = new C16610kz(this);
        this.LJLJLLL = new VUK(this, true, c16690l7);
        setNestedScrollingEnabled(true);
    }

    public final void LIZJ(int i, int i2) {
        if (this.LJLJJI && getVScroller() != null) {
            this.LJLJJLL = getScrollY();
        }
        super.smoothScrollTo(i, i2);
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View view) {
        VUK vuk;
        if (this.LJLJJL && (vuk = this.LJLJLLL) != null) {
            vuk.LJ(i);
        } else {
            this.LJLIL.LIZIZ(i);
            LJIIIIZZ(i);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLILLLLZI.LIZIZ(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLILLLLZI.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        VUK vuk;
        if (this.LJLJJL && (vuk = this.LJLJLLL) != null) {
            vuk.getClass();
            return false;
        }
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        LJIILL(view, view2, i, 0);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return LJJLIIJ(view, view2, i, 0);
    }

    @Override // X.C1V0
    public final void LJIILL(View view, View view2, int i, int i2) {
        VUK vuk;
        if (this.LJLJJL && (vuk = this.LJLJLLL) != null) {
            vuk.LJI.LIZ(i, i2);
        } else {
            this.LJLIL.LIZ(i, i2);
            this.LJLILLLLZI.LJIIJJI(2, i2);
        }
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View view, View view2, int i, int i2) {
        VUK vuk;
        int i3 = 2;
        if (this.LJLJJL && (vuk = this.LJLJLLL) != null) {
            if (!vuk.LIZ) {
                i3 = 1;
            }
            if ((i & i3) == 0) {
                return false;
            }
            return true;
        }
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return LIZ(i, i2, 0, iArr, iArr2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        VUK vuk;
        boolean z2 = false;
        if (this.LJLJJL && (vuk = this.LJLJLLL) != null) {
            vuk.getClass();
            return false;
        }
        if (z) {
            return false;
        }
        int scrollY = getScrollY();
        int LJJII = this.LJLJI.LJJII();
        if ((scrollY > 0 || f2 > 0.0f) && (scrollY < LJJII || f2 < 0.0f)) {
            z2 = true;
        }
        if (!dispatchNestedPreFling(0.0f, f2)) {
            dispatchNestedFling(0.0f, f2, z2);
            fling((int) f2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        LIZ(i, i2, 0, iArr, null);
    }

    public boolean LIZ(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return this.LJLILLLLZI.LIZJ(i, i2, i3, iArr, iArr2);
    }

    @Override // X.C1V0
    public final void LJJIIJ(View view, int i, int i2, int[] iArr, int i3) {
        VUK vuk;
        if (this.LJLJJL && (vuk = this.LJLJLLL) != null) {
            vuk.LIZJ(view, i, i2, iArr, i3);
        } else {
            LIZ(i, i2, i3, iArr, null);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return LIZIZ(i, i2, i3, i4, iArr, 0);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        LJJ(view, i, i2, i3, i4, 0);
    }

    public boolean LIZIZ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.LJLILLLLZI.LJI(i, i2, i3, i4, iArr, i5);
    }

    @Override // X.C1V0
    public final void LJJ(View view, int i, int i2, int i3, int i4, int i5) {
        VUK vuk;
        if (this.LJLJJL && (vuk = this.LJLJLLL) != null) {
            vuk.LIZLLL(i, i2, i3, i4, i5);
            return;
        }
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        LIZIZ(0, scrollY2, 0, i4 - scrollY2, null, i5);
    }
}
