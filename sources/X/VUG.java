package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public final class VUG extends VUI implements VPU {
    public final UIScrollView LJLL;
    public VUM LJLLI;
    public boolean LJLLILLLL;
    public VUH LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public int LJZI;
    public VUP LJZL;
    public VOV LL;
    public final VUL LLD;
    public int LLF;
    public int LLFF;
    public final Rect LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public int LLIIIL;
    public Rect LLIIIZ;

    public final void LJI() {
        int i;
        VUP vup = this.LJZL;
        if (vup != null) {
            vup.LIZIZ();
        }
        if (this.LJLZ || this.LLIIIILZ) {
            i = 1;
        } else {
            i = 3;
        }
        LJ(i);
        this.LLF = getScrollY();
        this.LLFF = this.LJLLJ.getScrollX();
        postDelayed(this.LLD, 100L);
    }

    public int getOrientation() {
        return this.LJLLI.getOrientation();
    }

    public int getRealScrollX() {
        if (this.LJLLLLLL) {
            return this.LJLLJ.getScrollX();
        }
        return getScrollX();
    }

    public int getRealScrollY() {
        if (this.LJLLLLLL) {
            return this.LJLLJ.getScrollY();
        }
        return getScrollY();
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        if (this.LJLLILLLL) {
            this.LJLLI.removeAllViews();
        } else {
            super.removeAllViews();
            this.LJLLILLLL = true;
        }
    }

    public int getContentHeight() {
        return this.LJZI;
    }

    public int getContentWidth() {
        return this.LJZ;
    }

    public VUH getHScrollView() {
        return this.LJLLJ;
    }

    public LinearLayout getLinearLayout() {
        return this.LJLLI;
    }

    public static void LIZLLL(View view) {
        Field declaredField;
        try {
            if (view instanceof HorizontalScrollView) {
                declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
            } else {
                if (view instanceof ScrollView) {
                    declaredField = ScrollView.class.getDeclaredField("mScroller");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("did not find mScroller in ");
                LIZ.append(view.getClass().getName());
                LLog.LIZLLL(3, "AndroidScrollView", X1D.LIZIZ(LIZ));
            }
            if (declaredField != null) {
                declaredField.setAccessible(true);
                OverScroller overScroller = (OverScroller) declaredField.get(view);
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                    return;
                }
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("did not find mScroller in ");
            LIZ2.append(view.getClass().getName());
            LLog.LIZLLL(3, "AndroidScrollView", X1D.LIZIZ(LIZ2));
        } catch (Throwable th) {
            LLog.LIZLLL(3, "AndroidScrollView", th.getMessage());
        }
    }

    public final void LJ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyStateChange ");
        LIZ.append(this.LLIIIL);
        LIZ.append(" -> ");
        LIZ.append(i);
        LLog.LIZLLL(2, "LynxUIScrollView", X1D.LIZIZ(LIZ));
        if (this.LLIIIL != i) {
            this.LLIIIL = i;
            VUP vup = this.LJZL;
            if (vup != null) {
                vup.LIZ(i);
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final void addView(View view) {
        if (this.LJLLILLLL) {
            this.LJLLI.addView(view);
        } else {
            super.addView(view);
            this.LJLLILLLL = true;
        }
    }

    @Override // X.VPU
    public final void bindDrawChildHook(VOV vov) {
        this.LL = vov;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLIIIJ || super.canScrollVertically(i)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (!this.LLFZ) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width;
        int height;
        Drawable background = getBackground();
        if (background instanceof BackgroundDrawable) {
            BackgroundDrawable backgroundDrawable = (BackgroundDrawable) background;
            RectF LJFF = backgroundDrawable.LJFF();
            VQQ vqq = backgroundDrawable.LJIL;
            Rect rect = this.LLIIIZ;
            if (rect == null) {
                rect = background.getBounds();
            }
            Path path = new Path();
            float f = rect.left + LJFF.left;
            float f2 = rect.top + LJFF.top;
            int i = this.LJLLL;
            RectF rectF = new RectF(f, f2 + i, rect.right - LJFF.right, (rect.bottom - LJFF.bottom) + i);
            if (vqq == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, C79712VQe.LIZIZ(vqq.LIZ(), LJFF, 1.0f), Path.Direction.CW);
            }
            int save = canvas.save();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        if ((getParent() instanceof ViewGroup) && !((ViewGroup) getParent()).getClipChildren() && getClipBounds() == null) {
            Rect rect2 = this.LLFFF;
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int scrollX2 = getScrollX();
            Rect rect3 = this.LLIIIZ;
            if (rect3 == null) {
                width = getWidth();
            } else {
                width = rect3.width();
            }
            int i2 = scrollX2 + width;
            int scrollY2 = getScrollY();
            Rect rect4 = this.LLIIIZ;
            if (rect4 == null) {
                height = getHeight();
            } else {
                height = rect4.height();
            }
            rect2.set(scrollX, scrollY, i2, scrollY2 + height);
            canvas.clipRect(this.LLFFF);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.VUI, android.widget.ScrollView
    public final void fling(int i) {
        super.fling(i);
        if (this.LLIIIL == 1) {
            LJ(2);
        }
        VUP vup = this.LJZL;
        if (vup != null) {
            vup.LIZLLL();
        }
    }

    @Override // X.VUI, android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLLLLLL) {
            if (this.LJLL.LJLL) {
                requestDisallowInterceptTouchEvent(true);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.VUI, android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.LJLLLLLL) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LLIIIILZ = z;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            this.LJLZ = false;
            this.LLIIIILZ = false;
            this.LJLL.LJJIIZ();
            LJIIIIZZ(0);
        } else if (motionEvent.getAction() == 0) {
            this.LJLZ = true;
            this.LJLL.LJJIIJZLJL(this.LLIIIL);
        } else if (motionEvent.getAction() == 3) {
            this.LLIIIILZ = false;
            LJIIIIZZ(0);
        }
        return onTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LJLLILLLL) {
            C16880lQ.LJZI(this.LJLLI, view);
        } else {
            super.removeView(view);
            this.LJLLILLLL = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        if (this.LJLLILLLL) {
            C16880lQ.LLII(this.LJLLI, i);
        } else {
            super.removeViewAt(i);
            this.LJLLILLLL = true;
        }
    }

    public void setBlockDescendantFocusability(boolean z) {
        this.LLFZ = z;
    }

    @Override // android.view.View
    public void setClipBounds(Rect rect) {
        this.LLIIIZ = rect;
    }

    public void setEnableScroll(boolean z) {
        VUQ vuq = new VUQ(z);
        this.LJLLJ.setOnTouchListener(vuq);
        setOnTouchListener(vuq);
    }

    public void setForceCanScroll(boolean z) {
        this.LLIIIJ = z;
    }

    public void setOnScrollListener(VUP vup) {
        this.LJZL = vup;
    }

    public void setOrientation(int i) {
        if (i == 0) {
            this.LJLLI.setOrientation(0);
            this.LJLLLLLL = true;
        } else {
            if (i != 1) {
                return;
            }
            this.LJLLI.setOrientation(1);
            this.LJLLLLLL = false;
        }
    }

    public void setScrollBarEnable(boolean z) {
        setVerticalScrollBarEnabled(z);
    }

    public VUG(Context context, UIScrollView uIScrollView) {
        super(context, uIScrollView);
        this.LJLL = uIScrollView;
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.LLFFF = new Rect();
        if (this.LJLLI == null) {
            VUM vum = new VUM(this, getContext());
            this.LJLLI = vum;
            vum.setOrientation(1);
            this.LJLLI.setWillNotDraw(true);
            this.LJLLI.setFocusableInTouchMode(true);
            VUH vuh = new VUH(this, getContext(), uIScrollView);
            this.LJLLJ = vuh;
            vuh.setOverScrollMode(2);
            this.LJLLJ.setFadingEdgeLength(0);
            this.LJLLJ.setWillNotDraw(true);
            this.LJLLJ.addView(this.LJLLI, new FrameLayout.LayoutParams(-1, -1));
            addView(this.LJLLJ, new FrameLayout.LayoutParams(-2, -2));
        }
        this.LLD = new VUL(this);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        if (this.LJLLILLLL) {
            this.LJLLI.addView(view, i);
        } else {
            super.addView(view, i);
            this.LJLLILLLL = true;
        }
    }

    @Override // X.VUI, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        VUP vup;
        boolean dispatchNestedPreFling = super.dispatchNestedPreFling(f, f2);
        if (dispatchNestedPreFling && (vup = this.LJZL) != null) {
            vup.LIZ(4);
        }
        return dispatchNestedPreFling;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.LJLLILLLL) {
            this.LJLLI.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
            this.LJLLILLLL = true;
        }
    }

    public final void LJFF(int i, int i2, boolean z) {
        if (this.LJLLLL == i && this.LJLLL == i2) {
            return;
        }
        if (z) {
            if (this.LJLLLLLL) {
                this.LJLLJ.setSmoothScrollingEnabled(true);
                this.LJLLJ.LIZLLL(i, i2);
                return;
            } else {
                setSmoothScrollingEnabled(true);
                LIZJ(i, i2);
                return;
            }
        }
        if (this.LJLLLLLL) {
            LIZLLL(this.LJLLJ);
            this.LJLLJ.scrollTo(i, i2);
        } else {
            LIZLLL(this);
            scrollTo(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        if (this.LJLLILLLL) {
            this.LJLLI.addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
            this.LJLLILLLL = true;
        }
    }

    @Override // X.VUI, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        VUP vup;
        boolean dispatchNestedFling = super.dispatchNestedFling(f, f2, z);
        if (dispatchNestedFling && (vup = this.LJZL) != null) {
            vup.LIZ(4);
        }
        return dispatchNestedFling;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.LJLLILLLL) {
            this.LJLLI.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
            this.LJLLILLLL = true;
        }
    }

    @Override // X.VUI, android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        VUP vup;
        boolean dispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        if (dispatchNestedPreScroll && (vup = this.LJZL) != null) {
            vup.LIZ(4);
        }
        return dispatchNestedPreScroll;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 == this.LJLLL) {
            return;
        }
        this.LJLLL = getScrollY();
        if (this.LLIIIL == 0) {
            LJI();
        }
        this.LJZL.onScrollChanged(i, i2, i3, i4);
        if (!this.LJLZ && !this.LLFII) {
            this.LJLL.LJJIIZ();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.LJLLI.setPadding(i, i2, i3, i4);
    }

    @Override // X.VUI
    public final boolean LIZ(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        VUP vup;
        boolean LIZ = super.LIZ(i, i2, i3, iArr, iArr2);
        if (LIZ && (vup = this.LJZL) != null) {
            vup.LIZ(4);
        }
        return LIZ;
    }

    @Override // X.VUI, android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        VUP vup;
        boolean dispatchNestedScroll = super.dispatchNestedScroll(i, i2, i3, i4, iArr);
        if (dispatchNestedScroll && (vup = this.LJZL) != null) {
            vup.LIZ(4);
        }
        return dispatchNestedScroll;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LJLLLLLL) {
            int i5 = this.LJLJLLL.LJFF;
            if (this.LJLJJL && i5 > 0 && i5 != getScrollY()) {
                LJFF(getScrollX(), i5, false);
            }
        }
    }

    @Override // X.VUI
    public final boolean LIZIZ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        VUP vup;
        boolean LIZIZ = super.LIZIZ(i, i2, i3, i4, iArr, i5);
        if (LIZIZ && (vup = this.LJZL) != null) {
            vup.LIZ(4);
        }
        return LIZIZ;
    }
}
